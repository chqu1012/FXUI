package de.dc.fx.ui.model.demo.wiki.provider;

import java.time.*;
import java.util.*;
import de.dc.fx.ui.model.demo.wiki.model.*;
import javafx.collections.*;

public enum EntryModelProvider {
	Instance;
	
	private ObservableList<Entry> entrys = FXCollections.observableArrayList();
	private Random random = new Random();

	private EntryModelProvider() {
		for (int j = 0; j < 100; j++) {
		String name = "Name"+j;
				String content = "Content"+j;
				LocalDateTime createdOn = LocalDateTime.now();
				LocalDateTime updatedOn = LocalDateTime.now();
		entrys.add(new Entry(name, content, createdOn, updatedOn));
		}
	}
	
	public ObservableList<Entry> getEntrys() {
		return entrys;
	}

	public void setEntrys(ObservableList<Entry> entrys) {
		this.entrys = entrys;
	}
}
