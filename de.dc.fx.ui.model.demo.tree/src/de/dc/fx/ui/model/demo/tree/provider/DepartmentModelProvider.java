package de.dc.fx.ui.model.demo.tree.provider;

import de.dc.fx.ui.model.demo.tree.model.Department;

public enum DepartmentModelProvider {
	instance;
	
	protected Department root = new Department("Root");
	
	public Department getRoot() {
		return root;
	}
}
