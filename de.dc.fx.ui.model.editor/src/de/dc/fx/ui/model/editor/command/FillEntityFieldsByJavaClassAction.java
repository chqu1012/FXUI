package de.dc.fx.ui.model.editor.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.e4.compatibility.SelectionService;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FxuiFactory;
import de.dc.fx.ui.model.fxui.FxuiPackage;

public class FillEntityFieldsByJavaClassAction implements IActionDelegate{

	@Override
	public void run(IAction action) {
		FilteredTypesSelectionDialog dialog = new FilteredTypesSelectionDialog(new Shell(), false, PlatformUI.getWorkbench().getProgressService(),
		        null, IJavaSearchConstants.CLASS);
		dialog.setTitle("Java Class Type Selection");
	    dialog.setMessage("Choose a type:");
		dialog.open();
		Object firstResult = dialog.getFirstResult();
		if (firstResult!=null) {
			if (firstResult instanceof SourceType) {
				SourceType sourceType = (SourceType) firstResult;
				IJavaElement javaElement = sourceType.getParent();
				if (javaElement instanceof org.eclipse.jdt.internal.core.CompilationUnit) {
					CompilationUnit cu = (CompilationUnit) javaElement;
					try {
						for (IType type : cu.getAllTypes()) {
							ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
							if (selectionService.getSelection() instanceof IStructuredSelection) {
								IStructuredSelection ss = (IStructuredSelection) selectionService.getSelection();
								if (ss.getFirstElement() instanceof FXModel) {
									FXModel model = (FXModel) ss.getFirstElement();
									
									EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(model);
									EList<FXProperty> properties = new BasicEList<FXProperty>();
									for (IField field : type.getFields()) {
										FXProperty property = FxuiFactory.eINSTANCE.createFXProperty();
										String name = field.getElementName().substring(0, 1).toUpperCase()+field.getElementName().substring(1);
										property.setName(name);
										property.setType(field.getTypeSignature().substring(0, field.getTypeSignature().length() - 1).replaceFirst("Q", ""));
										properties.add(property);
									}
									EReference eReference = FxuiPackage.eINSTANCE.getFXModel_FxProperties();
									Command command = AddCommand.create(editingDomain, model, eReference,properties);
									editingDomain.getCommandStack().execute(command);
								}
							}
						}
					} catch (JavaModelException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
