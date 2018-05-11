package principal;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MenuController {

    @FXML
    private BorderPane bpPrincipal;

    @FXML
    private Button btnAdicionarFilial;
    
    @FXML
    private Button btnAdicionarCliente;

    @FXML
    private Button btnAlugar;
    
    @FXML
    private Button btnAdicionarCarroEmFilial;

    @FXML
    private Button btnAdicionarVendedorEmFilial;
    

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
			BorderPane aluguelView = (BorderPane) loader.load();
			bpPrincipal.setCenter(aluguelView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }

    @FXML
    void realizarAluguel(ActionEvent event) {

    }




}