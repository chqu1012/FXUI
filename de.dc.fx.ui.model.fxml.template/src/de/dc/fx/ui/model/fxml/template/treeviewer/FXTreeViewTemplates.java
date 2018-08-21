package de.dc.fx.ui.model.fxml.template.treeviewer;

import java.io.File;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxml.template.SrcType;
import de.dc.fx.ui.model.fxui.FXTreeView;

public enum FXTreeViewTemplates {
	IContentProvider(new IContentProviderTemplate(), "/provider/", "IContentProvider.java", false, SrcType.Src),
	ILabelProvider(new ILabelProviderTemplate(), "/provider/", "ILabelProvider.java", false, SrcType.Src),
	IViewer(new IViewerTemplate(), "/viewer/", "IViewer.java", false, SrcType.Src),
	TreeViewer(new TreeViewerTemplate(), "/viewer/", "TreeViewer.java", false, SrcType.Src),
	Css(new CssTemplate(), "/viewer/css/", "TreeViewer.css", false, SrcType.Src),
	TreeViewSample(new TreeViewSampleTemplate(), "/", "TreeViewSample.java", false, SrcType.Src);
	
	private IGenerator<FXTreeView> template;
	private String fileExtension;
	private String genPath;
	private boolean useDefinedName;
	private SrcType srcType;

	private FXTreeViewTemplates(IGenerator<FXTreeView> template, String genPath, String fileExtension) {
		this.template = template;
		this.genPath = genPath;
		this.fileExtension = fileExtension;
		this.setUseDefinedName(false);
		this.srcType=SrcType.Src;
	}
	
	private FXTreeViewTemplates(IGenerator<FXTreeView> template, String genPath, String fileExtension, boolean useDefinedName, SrcType srcType) {
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

	public IGenerator<FXTreeView> getTemplate() {
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
