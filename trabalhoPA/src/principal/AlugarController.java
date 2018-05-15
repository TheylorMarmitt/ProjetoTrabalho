package principal;
import com.sun.glass.events.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AlugarController {

    @FXML
    private ComboBox<?> cbcarro;

    @FXML
    private ComboBox<?> cbVendendor;

    @FXML
    private ComboBox<?> cbFillal;

    @FXML
    private TableView<?> tblVendedor;

    @FXML
    private TableColumn<?, ?> tbcCodigo;

    @FXML
    private TableColumn<?, ?> tbcNome;

    @FXML
    private Button btnAlugar;

    @FXML
    void selecionaVendedor(MouseEvent event) {
    	
    	
    	
    }

}
