package de.dc.fx.ui.model.fxml.template;

public enum SrcType {
	Src("src"),
	SrcGen("src-gen"),
	Gen("generated"),
	Res("res"),
	Data("data"),
	Content("content");
	
	private String source;
	
	private SrcType(String source) {
		this.source = source;
	}
	
	public String getSource() {
		return source;
	}
}
