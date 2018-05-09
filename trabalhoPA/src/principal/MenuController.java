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

}