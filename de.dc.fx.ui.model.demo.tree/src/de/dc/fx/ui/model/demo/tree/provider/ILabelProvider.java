package de.dc.fx.ui.model.demo.tree.provider;

import javafx.scene.image.*;

public interface ILabelProvider<T> {
	String getText(T data);
	ImageView getImage(T data);
}
