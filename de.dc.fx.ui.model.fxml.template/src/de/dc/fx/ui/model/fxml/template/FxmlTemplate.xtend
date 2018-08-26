package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class FxmlTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.scene.control.TableColumn?>
	<?import javafx.scene.control.TableView?>
	<?import javafx.scene.control.cell.PropertyValueFactory?>

	<fx:root type="TableView" fx:id="tableView" editable="true" stylesheets="@css/«view.name»TableViewer.css" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/8.0.162">
	  <columns>
		«FOR col : view.fxColumns»«val propertyName = col.associatedFXProperty.name»
		<TableColumn fx:id="«propertyName.toFirstLower»Column" prefWidth="«col.width»" text="«propertyName»">
			<cellValueFactory><PropertyValueFactory property="«propertyName.toFirstLower»"/></cellValueFactory>
		</TableColumn>
		«ENDFOR»
	  </columns>
	</fx:root>
	'''
	
}