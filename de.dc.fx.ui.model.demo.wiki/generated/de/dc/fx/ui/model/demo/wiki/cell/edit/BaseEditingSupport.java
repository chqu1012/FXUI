package de.dc.fx.ui.model.demo.wiki.cell.edit;
import de.dc.fx.ui.model.demo.wiki.model.Entry;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn.CellEditEvent;

public abstract class BaseEditingSupport<T> implements EventHandler<CellEditEvent<Entry,T>>{

	@Override
	public void handle(CellEditEvent<Entry, T> t) {
		ObservableList<Entry> items = t.getTableView().getItems();
		int selection = t.getTablePosition().getRow();
		Entry current = (Entry) items.get(selection);
		setValue(current, t.getNewValue());
	}

	protected abstract void setValue(Entry current, T newValue);
}
