package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxml.template.form.FormSwitch;
import de.dc.fx.ui.model.fxui.FXControl;
import de.dc.fx.ui.model.fxui.FXForm;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class FormFxmlTemplate implements IGenerator<FXForm> {
  private FormSwitch fxSwitch = new FormSwitch();
  
  @Override
  public String gen(final FXForm data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import javafx.geometry.Insets?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.*?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<fx:root type=\"GridPane\" fx:id=\"root\" stylesheets=\"@css/");
    String _name = data.getName();
    _builder.append(_name);
    _builder.append("Form.css\" hgap=\"20.0\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" minHeight=\"-Infinity\" minWidth=\"-Infinity\" vgap=\"10.0\" xmlns:fx=\"http://javafx.com/fxml/1\" xmlns=\"http://javafx.com/javafx/8.0.162\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<columnConstraints>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<ColumnConstraints hgrow=\"NEVER\" maxWidth=\"1.7976931348623157E308\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"10.0\" prefWidth=\"100.0\" />");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</columnConstraints>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<rowConstraints>");
    _builder.newLine();
    {
      EList<FXControl> _fxcontrols = data.getFxcontrols();
      for(final FXControl control : _fxcontrols) {
        _builder.append("  \t");
        _builder.append("<RowConstraints fillHeight=\"false\" vgrow=\"NEVER\" />");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("</rowConstraints>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<children>");
    _builder.newLine();
    {
      int _size = data.getFxcontrols().size();
      IntegerRange _upTo = new IntegerRange(1, _size);
      for(final Integer n : _upTo) {
        _builder.append("   \t\t");
        final FXControl c = data.getFxcontrols().get(((n).intValue() - 1));
        _builder.newLineIfNotEmpty();
        _builder.append("   \t\t");
        _builder.append("<Label ");
        {
          boolean _isShowLabel = c.isShowLabel();
          if (_isShowLabel) {
            _builder.append("text=\"");
            String _name_1 = c.getName();
            _builder.append(_name_1, "   \t\t");
            _builder.append(":\" ");
          }
        }
        _builder.append("GridPane.rowIndex=\"");
        _builder.append(n, "   \t\t");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("   \t\t");
        String _doSwitch = this.fxSwitch.doSwitch(c);
        _builder.append(_doSwitch, "   \t\t");
        _builder.append(" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"");
        _builder.append(n, "   \t\t");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("   ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<padding>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<Insets bottom=\"10.0\" left=\"10.0\" right=\"10.0\" top=\"10.0\" />");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</padding>");
    _builder.newLine();
    _builder.append("</fx:root>");
    _builder.newLine();
    return _builder.toString();
  }
}
