package edu.thomc;
 
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MyController implements Initializable{
	@FXML
	private Button btnSayHello;
	@FXML 
	TextArea txtHello;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	public void SayHelloo(ActionEvent a) {
		txtHello.setText("Xin chào");
	}
}
