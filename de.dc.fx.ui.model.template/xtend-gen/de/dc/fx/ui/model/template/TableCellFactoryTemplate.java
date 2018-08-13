package de.dc.fx.ui.model.template;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.Pos;
import de.dc.fx.ui.model.template.IGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TableCellFactoryTemplate implements IGenerator<FXColumn> {
  @Override
  public String gen(final FXColumn data) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = data.eContainer();
    final FXTableView view = ((FXTableView) _eContainer);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = view.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".cell;");
    _builder.newLineIfNotEmpty();
    final String modelName = StringExtensions.toFirstUpper(view.getFxEntity().getName());
    _builder.newLineIfNotEmpty();
    final String property = StringExtensions.toFirstUpper(data.getAssociatedFXProperty().getName());
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import de.dc.fx.ui.model.core.FXTableCellFactory;");
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = view.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.");
    _builder.append(modelName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.geometry.Pos;");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(modelName);
    _builder.append("TableCell");
    _builder.append(property);
    _builder.append("Factory extends FXTableCellFactory<");
    _builder.append(modelName);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String extractValue(");
    _builder.append(modelName, "\t");
    _builder.append(" data) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return String.valueOf(data.get");
    _builder.append(property, "\t\t");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Pos getAlignment() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Pos.valuesOf(\"");
    Pos _alignment = data.getAlignment();
    _builder.append(_alignment, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
