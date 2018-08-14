package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class BaseFormControllerTemplate implements IGenerator<FXForm>{
	
	override gen(FXForm data)'''
	package «data.packagePath».form.controller;
	
	import javafx.collections.*;
	import javafx.collections.transformation.*;
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import java.time.*;
	import javafx.scene.layout.*;
	
	public abstract class «data.name»BaseFormController<T> extends GridPane{
		«FOR c : data.fxcontrols»
		@FXML «val controlName = c.class.simpleName.replaceFirst("FX", "").replace("Impl", "")»
		protected «controlName» «c.name.toFirstLower.replace(" ", "")»«controlName»;
	    «ENDFOR»
	}
	'''
	
}