package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxui.FXButton;
import de.dc.fx.ui.model.fxui.FXCheckBox;
import de.dc.fx.ui.model.fxui.FXChoiceBox;
import de.dc.fx.ui.model.fxui.FXComboBox;
import de.dc.fx.ui.model.fxui.FXRadioButton;
import de.dc.fx.ui.model.fxui.FXSelectedControl;
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
  public String caseFXCheckBox(final FXCheckBox c) {
    return this.initSelectedControl(c);
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
    return this.initSelectedControl(c);
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
    return this.initSelectedControl(c);
  }
  
  @Override
  public String caseFXChoiceBox(final FXChoiceBox c) {
    return this.initSelectedControl(c);
  }
  
  public String initSelectedControl(final FXSelectedControl c) {
    StringConcatenation _builder = new StringConcatenation();
    String _init = this.init(c.getClass().getSimpleName().replace("FX", "").replace("Impl", ""), StringExtensions.toFirstLower(c.getName()).replace(" ", ""));
    _builder.append(_init);
    _builder.append(" mnemonicParsing=\"false\" selected=\"");
    boolean _isSelected = c.isSelected();
    _builder.append(_isSelected);
    _builder.append("\"");
    return _builder.toString();
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
