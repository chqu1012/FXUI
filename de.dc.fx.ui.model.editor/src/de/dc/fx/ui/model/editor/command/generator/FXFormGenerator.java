package de.dc.fx.ui.model.editor.command.generator;

import java.io.File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxml.template.form.FormFxmlTemplate;
import de.dc.fx.ui.model.fxui.FXForm;

public class FXFormGenerator extends AbstractGenerator<FXForm> {

	@Override
	public void gen(FXForm view, IProject project) {
		FormFxmlTemplate tpl = new FormFxmlTemplate();
		
		String srcPath = getLocation(SrcType.Src, project, view);
		new File(srcPath+"/form/").mkdirs();
		String content = tpl.gen(view);
		String genFilePath = srcPath+"/form/"+view.getName()+".fxml";
		writeFile(genFilePath, content);
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
