package de.dc.fx.ui.model.demo.registration.cell;

import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public abstract class BaseCellFactory<T> implements Callback<TableColumn<T, T>, TableCell<T, T>> {

	protected T data;
	private TableCell<T,T> cell;
	private String style = "";
	
	@Override
	public TableCell<T, T> call(TableColumn<T, T> param) {
		cell = new TableCell<T,T>() {
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
		cell.setStyle(getStyle());
		cell.setAlignment(getAlignment());
		return cell;
	}
	
	protected void setStyle(String style) {
		this.style=style;
	}

	protected String getStyle() {
		return style;
	}

	protected Pos getAlignment() {
		return Pos.CENTER;
	}
	
	protected abstract String extractValue(T data);
}
