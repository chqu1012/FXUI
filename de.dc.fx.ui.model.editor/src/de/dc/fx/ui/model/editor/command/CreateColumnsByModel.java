package de.dc.fx.ui.model.editor.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.FxuiFactory;
import de.dc.fx.ui.model.fxui.FxuiPackage;

public class CreateColumnsByModel implements IActionDelegate{


	@Override
	public void run(IAction action) {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = activePage.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.getFirstElement() instanceof FXModel) {
				FXModel model = (FXModel) ss.getFirstElement();
				FXTableView tableView = (FXTableView)model.eContainer();
				tableView.getFxColumns().clear();
				
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(tableView);
				EList<FXColumn> columns = new BasicEList<FXColumn>();
				for (FXProperty property : model.getFxProperties()) {
					FXColumn column = FxuiFactory.eINSTANCE.createFXColumn();
					column.setAssociatedFXProperty(property);
					column.setName(property.getName());
					columns.add(column);
				}
				EReference eReference = FxuiPackage.eINSTANCE.getFXTableView_FxColumns();
				Command command = AddCommand.create(editingDomain, tableView, eReference,columns);
				editingDomain.getCommandStack().execute(command);
			}			
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
