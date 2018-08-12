package de.dc.fx.ui.model.fxml.template;

import java.io.File;

import de.dc.fx.ui.model.fxui.FXTableView;

public enum TableViewTemplateRegistry {
	BaseController(new BaseControllerTemplate(), "/controller/", "BaseController.java"),
	Controller(new ControllerTemplate(), "/controller/", "Controller.java"),
	Fxml(new FxmlTemplate(),"/", "TableViewer.fxml");
	
	private IGenerator<FXTableView> template;
	private String genPath;
	private String fileExtension;
	private boolean useDefinedName;

	private TableViewTemplateRegistry(IGenerator<FXTableView> template, String genPath, String fileExtension) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.useDefinedName =false;
	}
	
	private TableViewTemplateRegistry(IGenerator<FXTableView> template, String genPath, String fileExtension, boolean useDefinedName) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension=fileExtension;
		this.useDefinedName = useDefinedName;
	}

	public String getFileExtension() {
		return fileExtension;
	}
	
	public String genPath() {
		return genPath;
	}
	
	public IGenerator<FXTableView> getTemplate() {
		return template;
	}
	
	public String getGenFilePath(String path, String entityName) {
		new File(path +genPath).mkdirs();
		String name = entityName+fileExtension;
		if (useDefinedName) {
			name = fileExtension;
		}
		return path +genPath+name;
	}

	public boolean isUseDefinedName() {
		return useDefinedName;
	}

	public void setUseDefinedName(boolean useDefinedName) {
		this.useDefinedName = useDefinedName;
	}
}
