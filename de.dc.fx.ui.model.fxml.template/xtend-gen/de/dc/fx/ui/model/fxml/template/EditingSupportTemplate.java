package de.dc.fx.ui.model.fxml.template;

import com.google.common.base.Objects;
import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXExistingModel;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXTableView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EditingSupportTemplate implements IGenerator<FXColumn> {
  @Override
  public String gen(final FXColumn data) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = data.eContainer();
    final FXTableView view = ((FXTableView) _eContainer);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = view.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".cell.edit;");
    _builder.newLineIfNotEmpty();
    EObject _rootContainer = EcoreUtil.getRootContainer(data);
    final FXTableView root = ((FXTableView) _rootContainer);
    _builder.newLineIfNotEmpty();
    final FXModel model = root.getInput();
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
    {
      String _type = data.getAssociatedFXProperty().getType();
      boolean _equals = Objects.equal(_type, "LocalDate");
      if (_equals) {
        _builder.append("import java.time.LocalDate;");
        _builder.newLine();
      } else {
        String _type_1 = data.getAssociatedFXProperty().getType();
        boolean _equals_1 = Objects.equal(_type_1, "LocalDateTime");
        if (_equals_1) {
          _builder.append("import java.time.LocalDateTime;");
          _builder.newLine();
        }
      }
    }
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(view.getName());
    _builder.append(_firstUpper);
    String _firstUpper_1 = StringExtensions.toFirstUpper(data.getAssociatedFXProperty().getName());
    _builder.append(_firstUpper_1);
    _builder.append("EditingSupport extends BaseEditingSupport<");
    String _normalize = this.normalize(data.getAssociatedFXProperty().getType());
    _builder.append(_normalize);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    FXExistingModel _useExistingModel_1 = model.getUseExistingModel();
    boolean _tripleNotEquals_1 = (_useExistingModel_1 != null);
    if (_tripleNotEquals_1) {
      _xifexpression = model.getUseExistingModel().getImportUri();
    } else {
      _xifexpression = model.getName();
    }
    final String className = _xifexpression;
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void setValue(");
    _builder.append(className, "\t");
    _builder.append(" current, ");
    String _normalize_1 = this.normalize(data.getAssociatedFXProperty().getType());
    _builder.append(_normalize_1, "\t");
    _builder.append(" newValue) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("current.set");
    String _firstUpper_2 = StringExtensions.toFirstUpper(data.getAssociatedFXProperty().getName());
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append("(newValue);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String normalize(final String type) {
    boolean _equals = Objects.equal(type, "int");
    if (_equals) {
      return "Integer";
    } else {
      boolean _equals_1 = Objects.equal(type, "double");
      if (_equals_1) {
        return "Double";
      } else {
        boolean _equals_2 = Objects.equal(type, "long");
        if (_equals_2) {
          return "Long";
        } else {
          boolean _equals_3 = Objects.equal(type, "float");
          if (_equals_3) {
            return "Float";
          } else {
            return type;
          }
        }
      }
    }
  }
}
