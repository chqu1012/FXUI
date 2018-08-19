package de.dc.fx.ui.model.editor.command.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxml.template.form.FormTemplateRegistry;
import de.dc.fx.ui.model.fxui.FXForm;

public class FXFormGenerator extends AbstractGenerator<FXForm> {

	@Override
	public void gen(FXForm view, IProject project) {
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		ContainerSelectionDialog dialog = new ContainerSelectionDialog(new Shell(), root, true, "Choose a project to generate");
//		int open = dialog.open();
//		String srcPath = "";
//		if (open==0) {
//			srcPath=((Path)dialog.getResult()[0]).toOSString();
//			System.out.println(srcPath);
//		}
		
		for (FormTemplateRegistry template : FormTemplateRegistry.values()) {
			String srcPath =  getLocation(template.getSrcType(), project, view);
			String content = template.getTemplate().gen(view);
			String genFilePath =  template.getGenFilePath(srcPath, view.getName());
			writeFile(genFilePath, content);
		}
	}

	private String getLocation(SrcType srcType, IProject project, FXForm view) {
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
