package de.dc.fx.ui.model.demo.tree.provider;

import de.dc.fx.ui.model.demo.tree.model.Node;
import javafx.scene.image.ImageView;

public class TreeViewerLabelProvider implements ILabelProvider<Node>{

	@Override
	public String getText(Node data) {
		return data.getName();
	}

	@Override
	public ImageView getImage(Node data) {
		// TODO Auto-generated method stub
		return null;
	}

}
