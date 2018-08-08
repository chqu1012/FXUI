package de.dc.fx.ui.model.editor.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class GenerateSourceHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("aaaa");
		return null;
	}

}
