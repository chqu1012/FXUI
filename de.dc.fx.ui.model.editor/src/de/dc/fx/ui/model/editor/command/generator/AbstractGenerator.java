package de.dc.fx.ui.model.editor.command.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.core.resources.IProject;

public abstract class AbstractGenerator<T> {

	public abstract void gen(T input, IProject project) ;
	
	protected void writeFile(String genFilePath, String content) {
		try {
			Files.write(Paths.get(genFilePath), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
