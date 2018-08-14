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
    _builder.append("import javafx.fxml.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    String _name = data.getName();
    _builder.append(_name);
    _builder.append("BaseFormController extends GridPane{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<FXControl> _fxcontrols = data.getFxcontrols();
      boolean _hasElements = false;
      for(final FXControl c : _fxcontrols) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        _builder.append("\t");
        _builder.append("@FXML ");
        final String controlName = c.getClass().getSimpleName().replaceFirst("FX", "").replace("Impl", "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("protected ");
        _builder.append(controlName, "\t");
        _builder.append(" ");
        String _replace = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
        _builder.append(_replace, "\t");
        _builder.append(controlName, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected abstract void initialize();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
