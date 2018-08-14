package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class BaseFormControllerTemplate implements IGenerator<FXForm>{
	
	override gen(FXForm data)'''
	package «data.packagePath».form;
	
	import java.io.IOException;
	
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	
	public abstract class «data.name»BaseForm extends GridPane{
		
		«FOR c : data.fxcontrols SEPARATOR '\n'»
		@FXML «val controlName = c.class.simpleName.replaceFirst("FX", "").replace("Impl", "")»
		protected «controlName» «c.name.toFirstLower.replace(" ", "")»«controlName»;
	    «ENDFOR»
	    
	    public «data.name»BaseForm() {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getClass().getSimpleName()+".fxml"));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
	
			try {
				fxmlLoader.load();
			}catch(IOException exception) {
				throw new RuntimeException(exception);
			}
		}
	    
	    protected abstract void initialize();
	}
	'''
	
}