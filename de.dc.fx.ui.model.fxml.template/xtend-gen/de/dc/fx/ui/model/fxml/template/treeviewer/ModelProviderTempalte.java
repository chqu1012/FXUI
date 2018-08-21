package de.dc.fx.ui.model.fxml.template.treeviewer;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTreeView;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelProviderTempalte implements IGenerator<FXTreeView> {
  @Override
  public String gen(final FXTreeView data) {
    StringConcatenation _builder = new StringConcatenation();
    final String rootName = StringExtensions.toFirstUpper(data.getRoot().getName());
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".provider;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = data.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum ");
    _builder.append(rootName);
    _builder.append("ModelProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("instance;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected ");
    _builder.append(rootName, "\t");
    _builder.append(" root = new ");
    _builder.append(rootName, "\t");
    _builder.append("(null);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(rootName, "\t");
    _builder.append(" getRoot() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return root;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
