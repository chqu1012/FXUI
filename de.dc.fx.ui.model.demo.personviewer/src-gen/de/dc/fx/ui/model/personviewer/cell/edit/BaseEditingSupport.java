package de.dc.fx.ui.model.personviewer.cell.edit;
import de.dc.fx.ui.model.personviewer.model.Person;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn.CellEditEvent;

public abstract class BaseEditingSupport<T> implements EventHandler<CellEditEvent<Person,T>>{

	@Override
	public void handle(CellEditEvent<Person, T> t) {
		ObservableList<Person> items = t.getTableView().getItems();
		int selection = t.getTablePosition().getRow();
		Person current = (Person) items.get(selection);
		setValue(current, t.getNewValue());
	}

	protected abstract void setValue(Person current, T newValue);
}
