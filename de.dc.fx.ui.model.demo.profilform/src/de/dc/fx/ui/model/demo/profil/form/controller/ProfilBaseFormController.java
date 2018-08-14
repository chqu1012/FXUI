package de.dc.fx.ui.model.demo.profil.form.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;

public abstract class ProfilBaseFormController extends GridPane{
	@FXML 
	protected TextField nameTextField;
	@FXML 
	protected TextField vornameTextField;
	@FXML 
	protected TextField alterTextField;
	@FXML 
	protected TextField straﬂeTextField;
	@FXML 
	protected TextField pLZTextField;
	@FXML 
	protected TextField stadtTextField;
	@FXML 
	protected Button helloWorldButton;
	@FXML 
	protected ToggleButton hellloToggleToggleButton;
	@FXML 
	protected ToggleButton m‰nnlichToggleButton;
	@FXML 
	protected ToggleButton weiblichToggleButton;
	
	protected abstract void initialize();
}
