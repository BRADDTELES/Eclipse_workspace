package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private MediaView mediaview;
	
	@FXML
	private AnchorPane telaApp;
	@FXML
	private Slider tempoMusica;
	@FXML
	private Slider seletorVolume;
	@FXML
	private Label tempoAtual;
	@FXML
	private Label tempoTotal;
	@FXML
	private Label nomeMusica;

	public void minimizar() {
		((Stage) telaApp.getScene().getWindow()).toBack();
	}

	public void fechar() {
		System.exit(0);
	}

	public void anterior() {

	}

	public void play() {

	}

	public void pause() {

	}

	public void stop() {

	}

	public void proxima() {

	}
	
	public void mudo() {
		
	}
}
