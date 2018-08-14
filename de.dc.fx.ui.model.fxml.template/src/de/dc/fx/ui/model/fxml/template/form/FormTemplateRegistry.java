package de.dc.fx.ui.model.fxml.template.form;

import java.io.File;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxui.FXForm;

public enum FormTemplateRegistry {
	BaseFormController(new BaseFormControllerTemplate(), "/form/", "BaseForm.java", false, SrcType.SrcGen),
	FormController(new FormControllerTemplate(), "/form/", "Form.java"),
	FormFxml(new FormFxmlTemplate(), "/form/","Form.fxml");
	
	private IGenerator<FXForm> template;
	private String fileExtension;
	private String genPath;
	private boolean useDefinedName;
	private SrcType srcType;
	
	private FormTemplateRegistry(IGenerator<FXForm> template, String genPath, String fileExtension) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.setUseDefinedName(false);
		this.srcType=SrcType.Src;
	}
	
	private FormTemplateRegistry(IGenerator<FXForm> template, String genPath, String fileExtension, boolean useDefinedName, SrcType srcType) {
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

	public IGenerator<FXForm> getTemplate() {
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
