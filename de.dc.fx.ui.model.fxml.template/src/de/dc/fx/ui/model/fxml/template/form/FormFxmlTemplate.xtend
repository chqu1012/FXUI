package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class FormFxmlTemplate implements IGenerator<FXForm>{
	
	FormSwitch fxSwitch = new FormSwitch
	
	override gen(FXForm data)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.geometry.Insets?>
	<?import javafx.scene.control.*?>
	<?import javafx.scene.layout.*?>

	<fx:root type="GridPane" fx:id="root" stylesheets="@css/«data.name»Form.css" hgap="20.0" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" minHeight="-Infinity" minWidth="-Infinity" vgap="10.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/8.0.162">
	  <columnConstraints>
	    <ColumnConstraints hgrow="NEVER" maxWidth="1.7976931348623157E308" />
	    <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
	  </columnConstraints>
	  <rowConstraints>
	  	«FOR control : data.fxcontrols»
	  	<RowConstraints fillHeight="false" vgrow="NEVER" />
	    «ENDFOR»
	  </rowConstraints>
	   <children>
	   		«FOR n: 1..data.fxcontrols.size»
	   		«val c = data.fxcontrols.get(n-1)»
	   		<Label «IF c.showLabel»text="«c.name»:" «ENDIF»GridPane.rowIndex="«n»" />
	   		«fxSwitch.doSwitch(c)» GridPane.columnIndex="1" GridPane.rowIndex="«n»" />
	   		«ENDFOR»	
	   </children>
	   <padding>
	      <Insets bottom="10.0" left="10.0" right="10.0" top="10.0" />
	   </padding>
	</fx:root>
	'''
	
}