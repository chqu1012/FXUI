package de.dc.fx.ui.model.editor.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;

public class GenerateSourceAction implements IActionDelegate{

	GenerateSourceHandler handler = new GenerateSourceHandler();

	@Override
	public void run(IAction action) {
		try {
			handler.execute(null);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
