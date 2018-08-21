package de.dc.fx.ui.model.demo.tree.provider;

import java.util.Arrays;
import java.util.List;

import de.dc.fx.ui.model.demo.tree.model.Node;

public class TreeViewContentProvider implements IContentProvider<Node> {

	@Override
	public boolean hasChildren(Node element) {
		return element.getChildren().size()>0;
	}

	@Override
	public Node getParent(Node element) {
		return element.getParent();
	}

	@Override
	public List<Node> getElements(Node inputElement) {
		return Arrays.asList(inputElement);
	}

	@Override
	public List<Node> getChildren(Node parentElement) {
		return parentElement.getChildren();
	}

}
