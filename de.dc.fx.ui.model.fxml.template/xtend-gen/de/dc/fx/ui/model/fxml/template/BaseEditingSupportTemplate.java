package de.dc.fx.ui.model.fxml.template;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXExistingModel;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXTableView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BaseEditingSupportTemplate implements IGenerator<FXColumn> {
  @Override
  public String gen(final FXColumn data) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = data.eContainer();
    final FXTableView view = ((FXTableView) _eContainer);
    _builder.newLineIfNotEmpty();
    EObject _eContainer_1 = data.getAssociatedFXProperty().eContainer();
    final FXModel model = ((FXModel) _eContainer_1);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = view.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".cell.edit;");
    _builder.newLineIfNotEmpty();
    {
      FXExistingModel _useExistingModel = model.getUseExistingModel();
      boolean _tripleNotEquals = (_useExistingModel != null);
      if (_tripleNotEquals) {
        _builder.append("import ");
        String _importUri = model.getUseExistingModel().getImportUri();
        _builder.append(_importUri);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("import ");
        String _packagePath_1 = view.getPackagePath();
        _builder.append(_packagePath_1);
        _builder.append(".model.*;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import javafx.collections.ObservableList;");
    _builder.newLine();
    _builder.append("import javafx.event.EventHandler;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableColumn.CellEditEvent;");
    _builder.newLine();
    EObject _rootContainer = EcoreUtil.getRootContainer(data);
    final FXTableView root = ((FXTableView) _rootContainer);
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    FXExistingModel _useExistingModel_1 = root.getInput().getUseExistingModel();
    boolean _tripleNotEquals_1 = (_useExistingModel_1 != null);
    if (_tripleNotEquals_1) {
      _xifexpression = root.getInput().getUseExistingModel().getImportUri();
    } else {
      _xifexpression = model.getName();
    }
    final String className = _xifexpression;
    _builder.newLineIfNotEmpty();
    _builder.append("public abstract class BaseEditingSupport<T> implements EventHandler<CellEditEvent<");
    _builder.append(className);
    _builder.append(",T>>{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void handle(CellEditEvent<");
    _builder.append(className, "\t");
    _builder.append(", T> t) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("ObservableList<");
    _builder.append(className, "\t\t");
    _builder.append("> items = t.getTableView().getItems();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("int selection = t.getTablePosition().getRow();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(className, "\t\t");
    _builder.append(" current = (");
    _builder.append(className, "\t\t");
    _builder.append(") items.get(selection);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("setValue(current, t.getNewValue());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected abstract void setValue(");
    _builder.append(className, "\t");
    _builder.append(" current, T newValue);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
