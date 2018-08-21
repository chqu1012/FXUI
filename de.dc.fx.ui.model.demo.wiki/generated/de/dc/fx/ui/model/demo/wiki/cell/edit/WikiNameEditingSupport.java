package de.dc.fx.ui.model.demo.wiki.cell.edit;
import de.dc.fx.ui.model.demo.wiki.model.Entry;
public class WikiNameEditingSupport extends BaseEditingSupport<String>{

	@Override
	protected void setValue(Entry current, String newValue) {
		current.setName(newValue);
	}
}
