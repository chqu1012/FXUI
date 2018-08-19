package de.dc.fx.ui.model.fxml.template;

import java.io.File;

import de.dc.fx.ui.model.fxui.FXModel;

public enum TableEntityRegistry {
	Entity(new EntityTemplate(), "/model/", ".java", false, SrcType.Gen),
	ModelProvider(new ModelProviderTemplate(), "/provider/", "ModelProvider.java", false, SrcType.Gen);
	
	private IGenerator<FXModel> template;
	private String fileExtension;
	private String genPath;
	private boolean useDefinedName;
	private SrcType srcType;
	
	private TableEntityRegistry(IGenerator<FXModel> template, String genPath, String fileExtension) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.setUseDefinedName(false);
		this.srcType = SrcType.Src;
	}
	
	private TableEntityRegistry(IGenerator<FXModel> template, String genPath, String fileExtension, boolean useDefinedName, SrcType srcType) {
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

	public IGenerator<FXModel> getTemplate() {
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
