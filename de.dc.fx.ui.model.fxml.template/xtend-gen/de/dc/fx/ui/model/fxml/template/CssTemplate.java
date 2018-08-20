package de.dc.fx.ui.model.fxml.template;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXTableView;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CssTemplate implements IGenerator<FXTableView> {
  @Override
  public String gen(final FXTableView data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".table-row-cell:empty {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f8f8f8;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-base: transparent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-control-inner-background: transparent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-table-cell-border-color: transparent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-table-header-border-color: transparent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append(".table-row-cell:empty .table-cell {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-width: 0px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".table-cell {     ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.5em 0.5em 0.1em 0.3em;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-color: -fx-box-border -fx-box-border transparent transparent;  ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-font: 12px \"Segoe UI\";    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: #212121;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-alignment: CENTER_LEFT;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-insets: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-table-header-border-color: #959595;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-table-cell-border-color: -fx-box-border;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-control-inner-background: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-color: transparent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-insets: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:focused {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-box-border,-fx-box-border, white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-row-cell {    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-row-cell:odd {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 0 0 1 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:focused .table-row-cell:focused,.table-view:focused .table-row-cell:focused:odd {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-box-border, white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 1, 2;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:focused .table-row-cell:filled:focused:selected {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-box-border, rgb(205,205,205);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:focused .table-row-cell:filled:selected, .table-view:row-selection .table-row-cell:filled:hover:selected {    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f4f3f3;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0,1 1 1 1 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:focused .table-row-cell:filled:focused:selected:hover {    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-box-border, rgb(205,205,205);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0,1 1 1 1 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-row-cell:filled:selected:focused, .table-row-cell:filled:selected {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f5f5f5;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:row-selection .table-row-cell:filled:hover { ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f5f5f5;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:row-selection .table-row-cell:filled:focused:hover { ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f4f3f3;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view:focused .table-row-cell:filled:focused:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-box-border,rgb(231,231,231);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view .column-header-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(".table-view .column-header .label{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-text-fill: #2b579a;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-alignment: CENTER_LEFT;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(".table-view .column-header, .table-view .filler {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-size: 35;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-color: -fx-box-border;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-insets: -1 0 0 -1;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0 5 0 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view .show-hide-columns-button {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-color: -fx-box-border;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-border-insets: -1 -1 0 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view .column-drag-header {    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: rgb(45,137,239);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-opacity: 0.6;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view .column-resize-line {  ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: rgb(45,137,239);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view .column-overlay {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: darkgray;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-opacity: 0.2;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".table-view .arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.2em;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-shape: \"M4,17v-2.889l4.124-3.86l4.125,3.86V17l-4.125-3.375L4,17z\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .thumb{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #cdcdcd;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-radius: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .thumb:hover {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-color: #dadada;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("/* The following is not working. Maybe related to RT-10521*/");
    _builder.newLine();
    _builder.append(".scroll-bar .thumb:pressed {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #606060;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .track {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f0f0f0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-radius: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".scroll-bar .track-background {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f0f0f0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .increment-button, .scroll-bar .decrement-button {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #f0f0f0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-radius: 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.25em; /* 3 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .increment-button:hover, .scroll-bar .decrement-button:hover  {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #dadada;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .increment-button:pressed, .scroll-bar .decrement-button:pressed {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: #606060;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar:horizontal .increment-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-mark-highlight-color, -fx-mark-color;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 1 0 -1 0, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.5em 0.333333em 0.0em 0.0em; /* 6 4 0 0 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-shape: \"M7.626,12.876L4.251,8.751H7.14L11,12.876L7.14,17H4.251L7.626,12.876z\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar:vertical .increment-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-mark-highlight-color, -fx-mark-color;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 1 0 -1 0, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.333333em 0.5em 0.0em 0.0em; /* 4 6 0 0 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-shape: \"M8.124,13.625l4.125-3.375v2.889l-4.125,3.86L4,13.139V10.25L8.124,13.625z\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .increment-button:pressed .increment-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white, white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar:horizontal .decrement-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-mark-highlight-color, -fx-mark-color;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 1 0 -1 0, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.5em 0.333333em 0.0em 0.0em; /* 6 4 0 0 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-shape: \"M11,17H8.111l-3.86-4.124l3.86-4.125H11l-3.375,4.125L11,17z\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar:vertical .decrement-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: -fx-mark-highlight-color, -fx-mark-color;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 1 0 -1 0, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0.333333em 0.5em 0.0em 0.0em; /* 4 6 0 0 */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-shape: \"M4,17v-2.889l4.124-3.86l4.125,3.86V17l-4.125-3.375L4,17z\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar .decrement-button:pressed .decrement-arrow {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-color: white, white;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".scroll-bar:disabled {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-opacity: 0.4;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
