package de.dc.fx.ui.model.editor.command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxml.template.TableColumnTemplateRegistry;
import de.dc.fx.ui.model.fxml.template.TableEntityRegistry;
import de.dc.fx.ui.model.fxml.template.TableViewTemplateRegistry;
import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.presentation.FxuiEditor;

public class GenerateSourceHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		if (selectionService.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selectionService.getSelection();
			if (ss.getFirstElement() instanceof FXTableView) {
				FXTableView view = (FXTableView) ss.getFirstElement();
					IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
					if (activeEditor instanceof FxuiEditor) {
						FxuiEditor editor = (FxuiEditor) activeEditor;
						IEditorInput editorInput = editor.getEditorInput();						
						if (editorInput instanceof IFileEditorInput) {
							IFileEditorInput fileEditorInput = (IFileEditorInput) editorInput;
							IFile file = fileEditorInput.getFile();
							IProject project = file.getProject();
							
							for (TableViewTemplateRegistry template : TableViewTemplateRegistry.values()) {
								String srcPath = getLocation(template.getSrcType(), project, view);
								String content = template.getTemplate().gen(view);
								String genFilePath = template.getGenFilePath(srcPath, view.getName());
								writeFile(genFilePath, content);
							}
							
							for (FXColumn column : view.getFxColumns()) {
								for (TableColumnTemplateRegistry template : TableColumnTemplateRegistry.values()) {
									String srcPath = getLocation(template.getSrcType(), project, view);
									String content = template.getTemplate().gen(column);
									String name = view.getName()+column.getAssociatedFXProperty().getName(); 
									String genFilePath = template.getGenFilePath(srcPath, name);
									writeFile(genFilePath, content);
								}
							}
				
							for (TableEntityRegistry template : TableEntityRegistry.values()) {
								String srcPath = getLocation(template.getSrcType(), project, view);
								String content = template.getTemplate().gen(view.getFxEntity());
								String genFilePath = template.getGenFilePath(srcPath, view.getFxEntity().getName());
								writeFile(genFilePath, content);
							}
							
							try {
								project.refreshLocal(IResource.DEPTH_INFINITE, null);
							} catch (CoreException e) {
								e.printStackTrace();
							}
							
						}
					}
				}
			}
		return null;
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
	
	private void writeFile(String genFilePath, String content) {
		try {
			
			Files.write(Paths.get(genFilePath), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
