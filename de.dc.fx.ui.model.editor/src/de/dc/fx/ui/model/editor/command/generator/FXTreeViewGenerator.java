package de.dc.fx.ui.model.editor.command.generator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxml.template.treeviewer.FXTreeViewTemplates;
import de.dc.fx.ui.model.fxui.FXTreeView;

public class FXTreeViewGenerator extends AbstractGenerator<FXTreeView> {

	@Override
	public void gen(FXTreeView input, IProject project) {
		for (FXTreeViewTemplates template : FXTreeViewTemplates.values()) {
			String srcPath =  getLocation(template.getSrcType(), project, input);
			String content = template.getTemplate().gen(input);
			String genFilePath = template.getGenFilePath(srcPath, "");
			writeFile(genFilePath, content);
		}
	}
	
	private String getLocation(SrcType srcType, IProject project, FXTreeView view) {
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
