package de.dc.fx.ui.model.fxml.template;

import com.google.common.base.Objects;
import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXExistingModel;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FXTableView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelProviderTemplate implements IGenerator<FXModel> {
  @Override
  public String gen(final FXModel data) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = data.eContainer();
    final FXTableView view = ((FXTableView) _eContainer);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = view.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".provider;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    {
      FXExistingModel _useExistingModel = data.getUseExistingModel();
      boolean _tripleNotEquals = (_useExistingModel != null);
      if (_tripleNotEquals) {
        _builder.append("import ");
        String _importUri = data.getUseExistingModel().getImportUri();
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
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    String _xifexpression = null;
    FXExistingModel _useExistingModel_1 = data.getUseExistingModel();
    boolean _tripleNotEquals_1 = (_useExistingModel_1 != null);
    if (_tripleNotEquals_1) {
      _xifexpression = data.getUseExistingModel().getImportUri();
    } else {
      _xifexpression = data.getName();
    }
    final String className = _xifexpression;
    _builder.newLineIfNotEmpty();
    _builder.append("public enum ");
    String _firstUpper = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper);
    _builder.append("ModelProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Instance;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ObservableList<");
    _builder.append(className, "\t");
    _builder.append("> ");
    String _firstLower = StringExtensions.toFirstLower(data.getName());
    _builder.append(_firstLower, "\t");
    _builder.append("s = FXCollections.observableArrayList();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private Random random = new Random();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("ModelProvider() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("for (int j = 0; j < 100; j++) {");
    _builder.newLine();
    {
      int _size = data.getFxProperties().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer n : _upTo) {
        _builder.append("\t\t");
        CharSequence _type = this.getType(data.getFxProperties().get((n).intValue()), (n).intValue());
        _builder.append(_type, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    final Function1<FXProperty, String> _function = (FXProperty it) -> {
      return StringExtensions.toFirstLower(it.getName());
    };
    final Function2<String, String, String> _function_1 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String parameter = IterableExtensions.<String>reduce(ListExtensions.<FXProperty, String>map(data.getFxProperties(), _function), _function_1);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _firstLower_1 = StringExtensions.toFirstLower(data.getName());
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("s.add(new ");
    _builder.append(className, "\t\t");
    _builder.append("(");
    _builder.append(parameter, "\t\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ObservableList<");
    _builder.append(className, "\t");
    _builder.append("> get");
    String _firstUpper_2 = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper_2, "\t");
    _builder.append("s() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    String _firstLower_2 = StringExtensions.toFirstLower(data.getName());
    _builder.append(_firstLower_2, "\t\t");
    _builder.append("s;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void set");
    String _firstUpper_3 = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper_3, "\t");
    _builder.append("s(ObservableList<");
    _builder.append(className, "\t");
    _builder.append("> ");
    String _firstLower_3 = StringExtensions.toFirstLower(data.getName());
    _builder.append(_firstLower_3, "\t");
    _builder.append("s) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    String _firstLower_4 = StringExtensions.toFirstLower(data.getName());
    _builder.append(_firstLower_4, "\t\t");
    _builder.append("s = ");
    String _firstLower_5 = StringExtensions.toFirstLower(data.getName());
    _builder.append(_firstLower_5, "\t\t");
    _builder.append("s;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public CharSequence getType(final FXProperty property, final int loopIndex) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = property.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(property.getName());
    _builder.append(_firstLower);
    _builder.append(" = ");
    String _createTypeValue = this.createTypeValue(property, loopIndex);
    _builder.append(_createTypeValue);
    _builder.append(";");
    return _builder;
  }
  
  public String createTypeValue(final FXProperty property, final int loopIndex) {
    String _type = property.getType();
    boolean _equals = Objects.equal(_type, "String");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"");
      String _name = property.getName();
      _builder.append(_name);
      _builder.append("\"+j");
      return _builder.toString();
    } else {
      if ((Objects.equal(property.getType(), "Integer") || Objects.equal(property, "int"))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("random.nextInt()");
        return _builder_1.toString();
      } else {
        if ((Objects.equal(property.getType(), "Double") || Objects.equal(property, "double"))) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("random.nextDouble()");
          return _builder_2.toString();
        } else {
          if ((Objects.equal(property.getType(), "Long") || Objects.equal(property, "long"))) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("random.nextLong()");
            return _builder_3.toString();
          } else {
            if ((Objects.equal(property.getType(), "Boolean") || Objects.equal(property, "boolean"))) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("random.nextBoolean()");
              return _builder_4.toString();
            } else {
              String _type_1 = property.getType();
              boolean _equals_1 = Objects.equal(_type_1, "LocalDate");
              if (_equals_1) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("LocalDate.now()");
                return _builder_5.toString();
              } else {
                String _type_2 = property.getType();
                boolean _equals_2 = Objects.equal(_type_2, "LocalDateTime");
                if (_equals_2) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("LocalDateTime.now()");
                  return _builder_6.toString();
                }
              }
            }
          }
        }
      }
    }
    return "\"\";";
  }
}
