package de.dc.fx.ui.model.fxml.template;

import java.io.File;

import de.dc.fx.ui.model.fxui.FXColumn;

public enum TableColumnTemplateRegistry {
	BaseCellFactory(new BaseCellFactoryTemplate(),"/cell/", "BaseCellFactory.java", true, SrcType.Gen),
	BaseEditingSupport(new BaseEditingSupportTemplate(), "/cell/edit/", "BaseEditingSupport.java", true, SrcType.Gen),
	CellFactory(new CellFactoryTemplate(),"/cell/", "CellFactory.java", false, SrcType.Gen),
	EditingSupport(new EditingSupportTemplate(), "/cell/edit/","EditingSupport.java", false, SrcType.Gen);
	
	private IGenerator<FXColumn> template;
	private String fileExtension;
	private String genPath;
	private boolean useDefinedName;
	private SrcType srcType;

	private TableColumnTemplateRegistry(IGenerator<FXColumn> template, String genPath, String fileExtension) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.setUseDefinedName(false);
		this.srcType=SrcType.Src;
	}
	
	private TableColumnTemplateRegistry(IGenerator<FXColumn> template, String genPath, String fileExtension, boolean useDefinedName, SrcType srcType) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.srcType = srcType;
		this.setUseDefinedName(useDefinedName);
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

	public IGenerator<FXColumn> getTemplate() {
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
