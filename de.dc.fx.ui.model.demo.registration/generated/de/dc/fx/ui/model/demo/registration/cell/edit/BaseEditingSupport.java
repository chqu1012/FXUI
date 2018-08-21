package de.dc.fx.ui.model.demo.registration.cell.edit;
import de.dc.fx.ui.model.demo.registration.model.Registration;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn.CellEditEvent;

public abstract class BaseEditingSupport<T> implements EventHandler<CellEditEvent<Registration,T>>{

	@Override
	public void handle(CellEditEvent<Registration, T> t) {
		ObservableList<Registration> items = t.getTableView().getItems();
		int selection = t.getTablePosition().getRow();
		Registration current = (Registration) items.get(selection);
		setValue(current, t.getNewValue());
	}

	protected abstract void setValue(Registration current, T newValue);
}
