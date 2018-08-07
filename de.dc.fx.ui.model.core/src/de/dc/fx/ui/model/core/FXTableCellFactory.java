package de.dc.fx.ui.model.core;

import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public abstract class FXTableCellFactory<T> implements Callback<TableColumn<T, T>, TableCell<T, T>> {

	T data;
	
	@Override
	public TableCell<T, T> call(TableColumn<T, T> param) {
		TableCell<T,T> cell = new TableCell<T,T>() {
			@SuppressWarnings("unchecked")
			@Override
			protected void updateItem(T item, boolean empty) {
				if (getTableRow() != null) {
					data = (T) getTableRow().getItem();
				}
				super.updateItem(item, empty);
				String content = "";
				if (data != null) {
					content = extractValue(data);
				} 
				setText(content);
			}
		};
		cell.setAlignment(getAlignment());
		return cell;
	}
	
	protected Pos getAlignment() {
		return Pos.CENTER;
	}
	
	protected abstract String extractValue(T data);
}
