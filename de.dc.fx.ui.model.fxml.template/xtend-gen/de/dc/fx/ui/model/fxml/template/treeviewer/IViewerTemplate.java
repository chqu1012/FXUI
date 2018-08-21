package de.dc.fx.ui.model.fxml.template.treeviewer;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTreeView;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IViewerTemplate implements IGenerator<FXTreeView> {
  @Override
  public String gen(final FXTreeView data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".viewer;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = data.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".provider.*;");
    _builder.newLineIfNotEmpty();
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
    return _builder.toString();
  }
}
