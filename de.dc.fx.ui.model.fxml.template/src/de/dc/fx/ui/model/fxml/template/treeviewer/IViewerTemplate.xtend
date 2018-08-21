package de.dc.fx.ui.model.fxml.template.treeviewer

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXTreeView

class IViewerTemplate implements IGenerator<FXTreeView>{

  override gen(FXTreeView data)'''
  package «data.packagePath».viewer;

  import «data.packagePath».provider.*;

  public interface IViewer<T> {
    void setInput(T input);
    void setLabelProvider(ILabelProvider<T> labelprovider);
    void setContentProvider(IContentProvider<T> contentprovider);
  }
  '''
}
