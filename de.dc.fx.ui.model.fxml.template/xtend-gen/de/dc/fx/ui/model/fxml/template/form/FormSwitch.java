package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxui.FXButton;
import de.dc.fx.ui.model.fxui.FXCheckbox;
import de.dc.fx.ui.model.fxui.FXComboBox;
import de.dc.fx.ui.model.fxui.FXRadioButton;
import de.dc.fx.ui.model.fxui.FXTextField;
import de.dc.fx.ui.model.fxui.FXToggleButton;
import de.dc.fx.ui.model.fxui.util.FxuiSwitch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FormSwitch extends FxuiSwitch<String> {
  @Override
  public String caseFXButton(final FXButton c) {
    String _xblockexpression = null;
    {
      final String name = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
      _xblockexpression = this.init("Button", name);
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseFXCheckbox(final FXCheckbox c) {
    String _xblockexpression = null;
    {
      final String name = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
      _xblockexpression = this.init("CheckBox", name);
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseFXComboBox(final FXComboBox c) {
    String _xblockexpression = null;
    {
      final String name = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
      _xblockexpression = this.init("ComboBox", name);
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseFXRadioButton(final FXRadioButton c) {
    String _xblockexpression = null;
    {
      final String name = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
      _xblockexpression = this.init("RadioButton", name);
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseFXTextField(final FXTextField c) {
    String _xblockexpression = null;
    {
      final String name = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<TextField fx:id=\"");
      _builder.append(name);
      _builder.append("TextField\" promptText=\"");
      String _prompt = c.getPrompt();
      _builder.append(_prompt);
      _builder.append("\"");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String caseFXToggleButton(final FXToggleButton c) {
    String _xblockexpression = null;
    {
      final String name = StringExtensions.toFirstLower(c.getName()).replace(" ", "");
      _xblockexpression = this.init("ToggleButton", name);
    }
    return _xblockexpression;
  }
  
  public String init(final String control, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    _builder.append(control);
    _builder.append(" fx:id=\"");
    _builder.append(name);
    _builder.append(control);
    _builder.append("\" text=\"");
    String _firstUpper = StringExtensions.toFirstUpper(name);
    _builder.append(_firstUpper);
    _builder.append("\"");
    return _builder.toString();
  }
}
