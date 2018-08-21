package de.dc.fx.ui.model.fxml.template.treeviewer;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTreeView;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ILabelProviderTemplate implements IGenerator<FXTreeView> {
  @Override
  public String gen(final FXTreeView data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".provider;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.scene.image.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface ILabelProvider<T> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String getText(T data);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ImageView getImage(T data);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
