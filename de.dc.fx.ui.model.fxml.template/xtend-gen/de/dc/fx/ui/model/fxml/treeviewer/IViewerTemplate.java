package de.dc.fx.ui.model.fxml.treeviewer;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IViewerTemplate /* implements IGenerator<FXModel>  */{
  @Override
  public CharSequence gen(final /* FXModel */Object data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package treeviewer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IViewer<T> {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("void setInput(T input);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("void setLabelProvider(ILabelProvider<T> labelprovider);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("void setContentProvider(IContentProvider<T> contentprovider);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
