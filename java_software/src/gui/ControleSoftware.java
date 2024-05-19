package gui;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleSoftware {
	
	double html = 100.99;
	double java = 99.21;
	double logica = 199.99;
	
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtProfissao;
	@FXML
	private TextField txtContato;
	@FXML
	private TextField txtProduto;
	@FXML
	private TextField txtAcessos;
	@FXML
	private Label lblCliente;
	@FXML
	private Label lblTotal;
	@FXML
	private Label lblSalvar;
	
	@FXML
	private Button btnCadastrar;
	
	@FXML
	private Button btnCalcular;
	
	@FXML
	private Button btnSalvar;
	
	@FXML
	public void onBtnCadastrarAction() {
		String nome = txtNome.getText();
		String profissao = txtProfissao.getText();
		String contato = txtContato.getText();
		
		lblCliente.setText("Nome: "+nome+" Profissão: "+profissao+" Contato: "
				+contato);
	}
	
	@FXML
	public void onBtnCalcularAction() {
		double produto = Double.parseDouble(txtProduto.getText());
		double acessos = Double.parseDouble(txtAcessos.getText());
		if (produto == 1) {
			lblTotal.setText("R$ "+html*acessos);
		}
		else if (produto == 2) {
			lblTotal.setText("R$ "+java*acessos);
		}
		else if (produto == 3) {
			lblTotal.setText("R$ "+logica*acessos);
		}
		else {
			lblTotal.setText(null);
		}
	}
	
	@FXML
	public void onBtnSalvarAction() {
		Path salvar = Paths.get("C:\\Users\\Administrador\\OneDrive\\Documentos\\clientes\\cliente.txt");
		
		String cliente = lblCliente.getText();
		byte[] clienteByte = cliente.getBytes();
		try {
			Files.write(salvar, clienteByte);
			lblSalvar.setText("Dados Salvos com Sucesso!");
		}catch (Exception erro) {
			
		}
	}
}
