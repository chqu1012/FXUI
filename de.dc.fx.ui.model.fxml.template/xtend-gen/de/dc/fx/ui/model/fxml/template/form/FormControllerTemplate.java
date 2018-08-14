package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXForm;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FormControllerTemplate implements IGenerator<FXForm> {
  @Override
  public String gen(final FXForm data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".form.controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = data.getName();
    _builder.append(_name);
    _builder.append("FormController extends ");
    String _name_1 = data.getName();
    _builder.append(_name_1);
    _builder.append("BaseFormController{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void initialize() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
