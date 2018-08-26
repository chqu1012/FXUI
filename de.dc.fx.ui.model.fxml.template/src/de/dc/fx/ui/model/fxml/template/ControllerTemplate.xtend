package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXProperty
import de.dc.fx.ui.model.fxui.FXTableView

class ControllerTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	package «view.packagePath».ui;

	import java.io.IOException;
	import javafx.scene.control.cell.TextFieldTableCell;
	import javafx.fxml.FXMLLoader;
	import «view.packagePath».cell.edit.*;
	import «view.packagePath».cell.*;
	«IF view.input.useExistingModel!==null»
	import «view.input.useExistingModel.importUri»;
	«ELSE»
	import «view.packagePath».model.*;
	«ENDIF»
	import javafx.util.converter.*;
	import java.time.*;
	public class «view.name»TableViewer extends «view.name»BaseTableViewer{
	
		@Override
		protected void init() {
		«FOR col : view.fxColumns»
			«col.associatedFXProperty.name.toFirstLower»Column.setCellFactory(new «view.name.toFirstUpper»«col.associatedFXProperty.name.toFirstUpper»CellFactory());
			«IF col.editable»
			«col.associatedFXProperty.name.toFirstLower»Column.setCellFactory(TextFieldTableCell.forTableColumn(«getConverter(col.associatedFXProperty)»));
			«col.associatedFXProperty.name.toFirstLower»Column.setOnEditCommit(new «view.name.toFirstUpper»«col.associatedFXProperty.name.toFirstUpper»EditingSupport());
			«ENDIF»
		«ENDFOR»
		}
	}
	'''
	
	def String getConverter(FXProperty property){
		if (property.type=='String') {
			return '''new DefaultStringConverter()'''
		}else if (property.type=="Integer" || property=="int") {
			return '''new IntegerStringConverter()'''
		}else if (property.type=="Double" || property=="double") {
			return '''new DoubleStringConverter()'''
		}else if (property.type=="Long" || property=="long") {
			return '''new LongStringConverter()'''
		}else if (property.type=="Boolean" || property=="boolean") {
			return '''new BooleanStringConverter()'''
		}else if (property.type=="LocalDate") {
			return '''new LocalDateStringConverter()'''
		}else if (property.type=="LocalDateTime") {
			return '''new LocalDateTimeStringConverter()'''
		}
		return "\"\";"
	}
	
}