package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class FxmlTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.scene.control.TableColumn?>
	<?import javafx.scene.control.TableView?>
	<?import javafx.scene.control.cell.PropertyValueFactory?>
	«FOR col : view.fxColumns»
	<?import «view.packagePath».cell.«view.name»TableCell«col.associatedFXProperty.name»Factory?>
	«ENDFOR»
	<fx:root type="TableView" fx:id="tableView" stylesheets="@css/«view.name»TableViewer.css" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/8.0.162">
	  <columns>
		«FOR col : view.fxColumns»
		<TableColumn fx:id="«col.name»Column" prefWidth="«col.width»" text="«col.associatedFXProperty.name»">
			<cellValueFactory>
			    <PropertyValueFactory property="«col.associatedFXProperty.name»"/>
			</cellValueFactory>
			<cellFactory>
				<«view.name»TableCell«col.associatedFXProperty.name»Factory/>
			</cellFactory>
		</TableColumn>
		«ENDFOR»
	  </columns>
	</fx:root>
	'''
	
}