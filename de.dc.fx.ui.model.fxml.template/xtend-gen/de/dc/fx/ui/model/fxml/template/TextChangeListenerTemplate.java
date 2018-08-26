package de.dc.fx.ui.model.fxml.template;

import com.google.common.base.Objects;
import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXExistingModel;
import de.dc.fx.ui.model.fxui.FXTableView;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TextChangeListenerTemplate implements IGenerator<FXTableView> {
  @Override
  public String gen(final FXTableView data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".filter;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = data.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.beans.value.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.transformation.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper);
    _builder.append("SearchTextChangeListener implements ChangeListener<String> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _xifexpression = null;
    FXExistingModel _useExistingModel = data.getInput().getUseExistingModel();
    boolean _tripleNotEquals = (_useExistingModel != null);
    if (_tripleNotEquals) {
      _xifexpression = data.getInput().getUseExistingModel().getImportUri();
    } else {
      _xifexpression = StringExtensions.toFirstUpper(data.getInput().getName());
    }
    final String modelName = _xifexpression;
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected FilteredList<");
    _builder.append(modelName, "\t");
    _builder.append("> filteredList;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public TicketSearchTextChangeListener(FilteredList<modelName> filteredList) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.filteredList = filteredList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("filteredList.setPredicate(t -> {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// If filter text is empty, display all persons.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (newValue == null || newValue.isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Compare first name and last name of every person with filter text.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("String lowerCaseFilter = newValue.toLowerCase();");
    _builder.newLine();
    {
      int _size = data.getFxColumns().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.append("\t\t\t");
        String _criteria = this.criteria((i).intValue(), data.getFxColumns().get((i).intValue()));
        _builder.append(_criteria, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("return false; // Does not match.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String criteria(final int index, final FXColumn col) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        if ((index == 0)) {
          _builder.append("if");
        } else {
          _builder.append("else if");
        }
      }
      String token = _builder.toString();
      final String name = StringExtensions.toFirstUpper(col.getAssociatedFXProperty().getName());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("t.get");
      _builder_1.append(name);
      _builder_1.append("().toLowerCase()");
      String content = _builder_1.toString();
      String _type = col.getAssociatedFXProperty().getType();
      boolean _notEquals = (!Objects.equal(_type, "String"));
      if (_notEquals) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("String.valueOf(t.get");
        _builder_2.append(name);
        _builder_2.append("())");
        content = _builder_2.toString();
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(token);
      _builder_3.append("(");
      _builder_3.append(content);
      _builder_3.append(".contains(lowerCaseFilter)) {");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("return true;");
      _builder_3.newLine();
      _builder_3.append("\t\t");
      _builder_3.append("}");
      _xblockexpression = _builder_3.toString();
    }
    return _xblockexpression;
  }
}
