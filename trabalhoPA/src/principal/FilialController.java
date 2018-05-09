package principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class FilialController {

    @FXML
    private AnchorPane acPrincipal;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfCNPJ;

    @FXML
    private TextField tfCidade;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnNovo;

    @FXML
    private Button btnExcluir;

    @FXML
    private TableView<?> tblCliente;

    @FXML
    private TableColumn<?, ?> tbcCodigo;

    @FXML
    private TableColumn<?, ?> tbcNome;

    @FXML
    private TableColumn<?, ?> tbcDataCadastro;

    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfUf;

    @FXML
    void excluir(ActionEvent event) {

    }

    @FXML
    void novo(ActionEvent event) {

    }

    @FXML
    void salvar(ActionEvent event) {

    }

    @FXML
    void selecionaCliente(MouseEvent event) {

    }

}
