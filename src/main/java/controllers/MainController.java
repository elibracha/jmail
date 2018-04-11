package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

public class MainController implements Initializable{

	@FXML
	private WebView webRender;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		webRender.getEngine().loadContent("<h1>hello</h1>");
	}

	
}
