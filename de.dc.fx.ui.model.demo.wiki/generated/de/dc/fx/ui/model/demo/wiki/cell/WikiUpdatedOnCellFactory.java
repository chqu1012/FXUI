package de.dc.fx.ui.model.demo.wiki.cell;

import de.dc.fx.ui.model.demo.wiki.cell.*;
import de.dc.fx.ui.model.demo.wiki.model.*;
import javafx.geometry.Pos;
public class WikiUpdatedOnCellFactory extends BaseCellFactory<Entry> {

	@Override
	protected String extractValue(Entry data) {
		return String.valueOf(data.getUpdatedOn());
	}
	
	@Override
	protected Pos getAlignment() {
		return Pos.valueOf("CENTER");
	}
}

