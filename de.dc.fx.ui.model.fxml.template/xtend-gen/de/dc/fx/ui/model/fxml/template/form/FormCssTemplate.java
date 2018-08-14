package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXForm;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FormCssTemplate implements IGenerator<FXForm> {
  @Override
  public String gen(final FXForm data) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
}
