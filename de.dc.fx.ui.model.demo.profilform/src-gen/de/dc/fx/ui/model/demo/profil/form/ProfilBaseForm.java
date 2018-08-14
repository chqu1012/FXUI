package de.dc.fx.ui.model.demo.profil.form;

import java.io.IOException;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class ProfilBaseForm extends GridPane{
	
	@FXML 
	protected TextField nameTextField;
	
	@FXML 
	protected TextField vornameTextField;
	
	@FXML 
	protected TextField alterTextField;
	
	@FXML 
	protected TextField strasseTextField;
	
	@FXML 
	protected TextField pLZTextField;
	
	@FXML 
	protected TextField stadtTextField;
	
	@FXML 
	protected Button helloWorldButton;
	
	@FXML 
	protected ToggleButton hellloToggleToggleButton;
	
	@FXML 
	protected ToggleButton maennlichToggleButton;
	
	@FXML 
	protected ToggleButton weiblichToggleButton;
    
    public ProfilBaseForm() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getClass().getSimpleName()+".fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		}catch(IOException exception) {
			throw new RuntimeException(exception);
		}
	}
    
    protected abstract void initialize();
}
