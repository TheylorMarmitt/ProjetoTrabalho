package principal;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MenuController {

    @FXML
    private BorderPane bpPrincipal;

    @FXML
    private MenuItem mnuCadastroFilial;

    @FXML
    private MenuItem mnuCadastroCliente;

    @FXML
    private MenuItem mnuCadastroVendedor;
    
    @FXML
    private MenuItem cadastroCarro;
    
    @FXML
    private MenuItem mnuAlugar;

    @FXML
    private MenuItem mnuDevolucao;

    @FXML
    void cadastrarFilial(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("FilialForm.fxml"));
		try {
			AnchorPane cursoView = (AnchorPane) loader.load();
			bpPrincipal.setCenter(cursoView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }
    
    @FXML
    void cadastrarCliente(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("ClienteForm.fxml"));
		try {
			AnchorPane aluguelView = (AnchorPane) loader.load();
			bpPrincipal.setCenter(aluguelView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }

    @FXML
    void cadastrarVendedor(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("VendedorForm.fxml"));
		try {
			AnchorPane aluguelView = (AnchorPane) loader.load();
			bpPrincipal.setCenter(aluguelView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }
    
    @FXML
    void cadastrarCarro(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Carro.fxml"));
		try {
			AnchorPane aluguelView = (AnchorPane) loader.load();
			bpPrincipal.setCenter(aluguelView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }
    
    @FXML
    void devolverVeiculo(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("DevolucaoForm.fxml"));
		try {
			AnchorPane aluguelView = (AnchorPane) loader.load();
			bpPrincipal.setCenter(aluguelView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }
    
    @FXML
    void alugarVeiculo(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("AlugarForm.fxml"));
		try {
			AnchorPane aluguelView = (AnchorPane) loader.load();
			bpPrincipal.setCenter(aluguelView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }

}