package de.dc.fx.ui.model.demo.tree.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

	private Node parent;
	private String name;
	private List<Node> children = new ArrayList<>();

	public Node(Node parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	public Node(Node parent) {
		this.parent = parent;
	}
	
	public void add(Node node) {
		children.add(node);
	}

	public void remove(Node node) {
		children.remove(node);
	}

	public Node getParent() {
		return parent;
	}
	
	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
