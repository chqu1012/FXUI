package de.dc.fx.ui.model.fxml.template.form;

import de.dc.fx.ui.model.fxml.template.IGenerator;
import de.dc.fx.ui.model.fxui.FXForm;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FormApplicationTemplate implements IGenerator<FXForm> {
  @Override
  public String gen(final FXForm data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = data.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = data.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".form.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.application.Application;");
    _builder.newLine();
    _builder.append("import javafx.scene.Scene;");
    _builder.newLine();
    _builder.append("import javafx.stage.Stage;");
    _builder.newLine();
    _builder.append("import javafx.stage.StageStyle;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper);
    _builder.append("Application extends Application {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(Stage primaryStage) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Scene scene = new Scene(new ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("Form(), 1400, 800);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("primaryStage.setScene(scene);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.initStyle(StageStyle.DECORATED);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
