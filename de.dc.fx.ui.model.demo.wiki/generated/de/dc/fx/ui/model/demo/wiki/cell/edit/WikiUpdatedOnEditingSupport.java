package de.dc.fx.ui.model.demo.wiki.cell.edit;
import de.dc.fx.ui.model.demo.wiki.model.Entry;
import java.time.LocalDateTime;
public class WikiUpdatedOnEditingSupport extends BaseEditingSupport<LocalDateTime>{

	@Override
	protected void setValue(Entry current, LocalDateTime newValue) {
		current.setUpdatedOn(newValue);
	}
}
