package de.dc.fx.ui.model.editor.command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.presentation.FxuiEditor;
import de.dc.fx.ui.model.template.ApplicationTemplate;

public class GenerateSourceHandler extends AbstractHandler {

	private ApplicationTemplate appTpl = new ApplicationTemplate();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		if (selectionService.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selectionService.getSelection();
			if (ss.getFirstElement() instanceof FXTableView) {
				FXTableView view = (FXTableView) ss.getFirstElement();
				String appContent = appTpl.gen(view);

				try {
					Path path = Paths.get("/" + view.getPackagePath().replaceAll("//", ".") + "/" + view.getName()
							+ "Application.java");
					System.out.println(path.toString());
					Files.write(path, appContent.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		return null;
	}
	
	public static IProject getCurrentProject() {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if (editorPart != null && editorPart instanceof FxuiEditor) {
			FxuiEditor editor = (FxuiEditor) editorPart;
			
			
			//			IEditorInput input = editorPart.getEditorInput();
//			IFile file = input.
//			IProject activeProject = file.getProject();
//			return activeProject;
		}
		return null;
	}

}
