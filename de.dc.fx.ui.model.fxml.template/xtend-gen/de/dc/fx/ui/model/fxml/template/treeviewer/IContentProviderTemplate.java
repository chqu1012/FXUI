package de.dc.fx.ui.model.fxml.template.treeviewer;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTreeView;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IContentProviderTemplate implements IGenerator<FXTreeView> {
  @Override
  public String gen(final FXTreeView data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".provider;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface IContentProvider<T> {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("boolean hasChildren(T element);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("T getParent(T element);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("List<T> getElements(T inputElement);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("List<T> getChildren(T parentElement);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
