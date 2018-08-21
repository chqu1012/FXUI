package de.dc.fx.ui.model.demo.tree.viewer;

import de.dc.fx.ui.model.demo.tree.provider.*;

public interface IViewer<T> {
  void setInput(T input);
  void setLabelProvider(ILabelProvider<T> labelprovider);
  void setContentProvider(IContentProvider<T> contentprovider);
}
