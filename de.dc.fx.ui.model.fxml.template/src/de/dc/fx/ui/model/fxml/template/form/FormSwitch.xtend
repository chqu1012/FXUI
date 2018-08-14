package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxui.util.FxuiSwitch
import de.dc.fx.ui.model.fxui.FXButton
import de.dc.fx.ui.model.fxui.FXCheckbox
import de.dc.fx.ui.model.fxui.FXComboBox
import de.dc.fx.ui.model.fxui.FXRadioButton
import de.dc.fx.ui.model.fxui.FXTextField
import de.dc.fx.ui.model.fxui.FXToggleButton

class FormSwitch extends FxuiSwitch<String>{
	
	override caseFXButton(FXButton c){
		val name = c.name.toFirstLower.replace(" ","")
		'Button'.init(name)
	}
	
	override caseFXCheckbox(FXCheckbox c) {
		val name = c.name.toFirstLower.replace(" ","")
		'CheckBox'.init(name)
	}
	
	override caseFXComboBox(FXComboBox c) {
		val name = c.name.toFirstLower.replace(" ","")
		'ComboBox'.init(name)
	}
	
	override caseFXRadioButton(FXRadioButton c) {
		val name = c.name.toFirstLower.replace(" ","")
		'RadioButton'.init(name)
	}
	
	override caseFXTextField(FXTextField c) {
		val name = c.name.toFirstLower.replace(" ","")
		'''<TextField fx:id="«name»TextField" promptText="«c.prompt»"'''
	}
	
	override caseFXToggleButton(FXToggleButton c) {
		val name = c.name.toFirstLower.replace(" ","")
		'ToggleButton'.init(name)
	}
	
	def String init(String control, String name)'''<«control» fx:id="«name»«control»" text="«name.toFirstUpper»"'''
}