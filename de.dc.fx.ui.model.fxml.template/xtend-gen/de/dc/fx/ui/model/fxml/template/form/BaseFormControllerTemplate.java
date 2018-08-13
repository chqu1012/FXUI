package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXControl;
import de.dc.fx.ui.model.fxui.FXForm;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class BaseFormControllerTemplate implements IGenerator<FXForm> {
  @Override
  public String gen(final FXForm data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".form.controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.transformation.*;");
    _builder.newLine();
    _builder.append("import javafx.fxml.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    String _name = data.getName();
    _builder.append(_name);
    _builder.append("BaseFormController<T> extends GridPane{");
    _builder.newLineIfNotEmpty();
    {
      EList<FXControl> _fxcontrols = data.getFxcontrols();
      for(final FXControl c : _fxcontrols) {
        _builder.append("\t");
        _builder.append("@FXML ");
        final String controlName = c.getClass().getSimpleName().replaceFirst("FX", "").replace("Impl", "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("protected ");
        _builder.append(controlName, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(c.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(controlName, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
