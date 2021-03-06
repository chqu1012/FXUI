package de.dc.fx.ui.model.editor.command.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxml.template.TableColumnTemplateRegistry;
import de.dc.fx.ui.model.fxml.template.TableEntityRegistry;
import de.dc.fx.ui.model.fxml.template.TableViewTemplateRegistry;
import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXTableView;

public class FXTableViewGenerator extends AbstractGenerator<FXTableView>{

	@Override
	public void gen(FXTableView view, IProject project) {
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		ContainerSelectionDialog dialog = new ContainerSelectionDialog(new Shell(), root, true, "Choose a project to generate");
//		int open = dialog.open();
//		String srcPath = "";
//		if (open==0) {
//			srcPath=((Path)dialog.getResult()[0]).toOSString();
//			System.out.println(srcPath);
//		}
		
		for (TableViewTemplateRegistry template : TableViewTemplateRegistry.values()) {
			String srcPath =  getLocation(template.getSrcType(), project, view);
			String content = template.getTemplate().gen(view);
			String genFilePath = template.getGenFilePath(srcPath, view.getName());
			writeFile(genFilePath, content);
		}
		
		for (FXColumn column : view.getFxColumns()) {
			for (TableColumnTemplateRegistry template : TableColumnTemplateRegistry.values()) {
				String srcPath =  getLocation(template.getSrcType(), project, view);
				String content = template.getTemplate().gen(column);
				String name = view.getName()+column.getAssociatedFXProperty().getName(); 
				String genFilePath = template.getGenFilePath(srcPath, name);
				writeFile(genFilePath, content);
			}
		}

		for (TableEntityRegistry template : TableEntityRegistry.values()) {
			for (FXModel model : view.getFxEntity()){
				String srcPath =  getLocation(template.getSrcType(), project, view);
				String content = template.getTemplate().gen(model);
				String genFilePath = template.getGenFilePath(srcPath, model.getName());
				writeFile(genFilePath, content);
			}
		}		
	}

	private String getLocation(SrcType srcType, IProject project, FXTableView view) {
		IFolder folder = project.getFolder(srcType.getSource());
		if (!folder.exists()) {
			try {
				folder.create(IResource.FORCE, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return folder.getLocation().toOSString()+"/"+view.getPackagePath().replaceAll("\\.", "/");
	}
}
