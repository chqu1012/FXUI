package de.dc.fx.ui.model.demo.wiki.cell;

import de.dc.fx.ui.model.demo.wiki.cell.*;
import de.dc.fx.ui.model.demo.wiki.model.*;
import javafx.geometry.Pos;
public class WikiContentCellFactory extends BaseCellFactory<Entry> {

	@Override
	protected String extractValue(Entry data) {
		return String.valueOf(data.getContent());
	}
	
	@Override
	protected Pos getAlignment() {
		return Pos.valueOf("CENTER");
	}
}

