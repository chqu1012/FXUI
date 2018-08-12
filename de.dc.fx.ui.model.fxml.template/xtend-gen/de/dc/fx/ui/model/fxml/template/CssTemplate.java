package de.dc.fx.ui.model.fxml.template;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTableView;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CssTemplate implements IGenerator<FXTableView> {
  @Override
  public String gen(final FXTableView data) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
}
