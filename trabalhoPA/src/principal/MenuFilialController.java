package principal;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenuFilialController {

	  @FXML
	  private BorderPane bpPrincipal;
	  
    @FXML
    private Button btnAlugar;

    @FXML
    private MenuButton mnCadastrar;

    @FXML
    private MenuItem mniCarro;

    @FXML
    private MenuItem mniCliente;

    @FXML
    private MenuItem mniFilial;

    @FXML
    private MenuItem mniVendedor;

    @FXML
    void alugar(ActionEvent event) {
    	
    }

    @FXML
    void cadastroCarro(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Carro.fxml"));
		try {
			BorderPane cursoView = (BorderPane) loader.load();
			bpPrincipal.setCenter(cursoView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }

    @FXML
    void cadastroCliente(ActionEvent event) {

    }

    @FXML
    void cadastroFilial(ActionEvent event) {

    }

    @FXML
    void cadastroVendedor(ActionEvent event) {

    }
}


