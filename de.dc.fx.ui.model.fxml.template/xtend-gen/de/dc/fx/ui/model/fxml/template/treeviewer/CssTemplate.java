package de.dc.fx.ui.model.fxml.template.treeviewer;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTreeView;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CssTemplate implements IGenerator<FXTreeView> {
  @Override
  public String gen(final FXTreeView data) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
}
