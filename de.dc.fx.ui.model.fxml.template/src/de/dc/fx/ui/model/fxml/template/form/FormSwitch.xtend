package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxui.FXButton
import de.dc.fx.ui.model.fxui.FXCheckBox
import de.dc.fx.ui.model.fxui.FXChoiceBox
import de.dc.fx.ui.model.fxui.FXComboBox
import de.dc.fx.ui.model.fxui.FXRadioButton
import de.dc.fx.ui.model.fxui.FXSelectedControl
import de.dc.fx.ui.model.fxui.FXTextField
import de.dc.fx.ui.model.fxui.FXToggleButton
import de.dc.fx.ui.model.fxui.util.FxuiSwitch

class FormSwitch extends FxuiSwitch<String>{
	
	override caseFXButton(FXButton c){
		val name = c.name.toFirstLower.replace(" ","")
		'Button'.init(name)
	}
	
	override caseFXCheckBox(FXCheckBox c) {
		c.initSelectedControl
	}
	
	override caseFXComboBox(FXComboBox c) {
		val name = c.name.toFirstLower.replace(" ","")
		'ComboBox'.init(name)
	}
	
	override caseFXRadioButton(FXRadioButton c) {
		c.initSelectedControl
	}
	
	override caseFXTextField(FXTextField c) {
		val name = c.name.toFirstLower.replace(" ","")
		'''<TextField fx:id="«name»TextField" promptText="«c.prompt»"'''
	}
	
	override caseFXToggleButton(FXToggleButton c) {
		c.initSelectedControl
	}
	
	override caseFXChoiceBox(FXChoiceBox c) {
		c.initSelectedControl
	}
	
	
	def String initSelectedControl(FXSelectedControl c)'''«init(c.class.simpleName.replace("FX","").replace("Impl", ""), c.name.toFirstLower.replace(" ",""))» mnemonicParsing="false" selected="«c.selected»"'''
	
	def String init(String control, String name)'''<«control» fx:id="«name»«control»" text="«name.toFirstUpper»"'''
}