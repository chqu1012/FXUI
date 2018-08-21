package de.dc.fx.ui.model.demo.wiki.provider;

import java.time.*;
import java.util.*;
import de.dc.fx.ui.model.demo.wiki.model.*;
import javafx.collections.*;

public enum CategoryModelProvider {
	Instance;
	
	private ObservableList<Category> categorys = FXCollections.observableArrayList();
	private Random random = new Random();

	private CategoryModelProvider() {
		for (int j = 0; j < 100; j++) {
		String name = "Name"+j;
				String tag = "Tag"+j;
		categorys.add(new Category(name, tag));
		}
	}
	
	public ObservableList<Category> getCategorys() {
		return categorys;
	}

	public void setCategorys(ObservableList<Category> categorys) {
		this.categorys = categorys;
	}
}
