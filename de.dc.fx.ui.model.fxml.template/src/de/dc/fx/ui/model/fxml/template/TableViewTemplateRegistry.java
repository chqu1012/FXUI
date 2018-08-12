package de.dc.fx.ui.model.fxml.template;

import java.io.File;

import de.dc.fx.ui.model.fxui.FXTableView;

public enum TableViewTemplateRegistry {
	BaseController(new BaseControllerTemplate(), "/ui/", "BaseTableViewer.java", false, SrcType.SrcGen),
	Controller(new ControllerTemplate(), "/ui/", "TableViewer.java"),
	Fxml(new FxmlTemplate(),"/ui/", "TableViewer.fxml"),
	Css(new CssTemplate(), "/ui/css/", "TableViewer.css");
	
	private IGenerator<FXTableView> template;
	private String genPath;
	private String fileExtension;
	private boolean useDefinedName;
	private SrcType srcType;
	
	private TableViewTemplateRegistry(IGenerator<FXTableView> template, String genPath, String fileExtension) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.useDefinedName =false;
		this.srcType=SrcType.Src;
	}
	
	private TableViewTemplateRegistry(IGenerator<FXTableView> template, String genPath, String fileExtension, boolean useDefinedName, SrcType srcType) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension=fileExtension;
		this.useDefinedName = useDefinedName;
		this.srcType = srcType;
	}

	public SrcType getSrcType() {
		return srcType;
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
