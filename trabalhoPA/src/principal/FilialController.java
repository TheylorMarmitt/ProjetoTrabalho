package principal;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import principal.dao.FilialArquivo;
import principal.dao.FilialDAO;
import principal.model.Filial;
import principal.model.FilialBuilder;

public class FilialController {

    @FXML
    private AnchorPane acPrincipal;

    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfCNPJ;

    @FXML
    private TextField tfCidade;

    @FXML
    private TextField tfUf;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnNovo;

    @FXML
    private Button btnExcluir;

    @FXML
    private TableView<Filial> tblFilial;

    @FXML
    private TableColumn<Filial, Number> tbcCodigo;

    @FXML
    private TableColumn<Filial, String> tbcNome;

    @FXML
    private TableColumn<Filial, String> tbcUf;

    @FXML
    private TableColumn<Filial, String> tbcCidade;

    @FXML
    private TableColumn<Filial, Number> tbcCnpj;

    Filial filial;
	private  FilialDAO filialDao = new FilialArquivo();
	Boolean editando;

	@FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tbcUf.setCellValueFactory(new PropertyValueFactory<>("uf"));
		tbcCidade.setCellValueFactory(new PropertyValueFactory<>("cidade"));
		tbcCnpj.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
		
		novoFilial();

	}

	

	@FXML
	void excluir(ActionEvent event) {
	 filialDao.excluir(filial);
			novoFilial();
	}

	@FXML
	void novo(ActionEvent event) {
		novoFilial();
	}

	@FXML
	void salvar(ActionEvent event) {

		
		populaFilial();
		

		if (editando) {
			filialDao.alterar(filial);
		} else {
			filialDao.inserir(filial);
		}
		
		
		populaFilial();

		if (!editando) {
			tblFilial.getItems().add(filial);
		}
		novoFilial();
	}

	@FXML
	void selecionaFilial(MouseEvent event) {
		if (tblFilial.getSelectionModel().getSelectedItem() != null) {
			filial = tblFilial.getSelectionModel().getSelectedItem();
			populaTela(filial);
			editando = true;
		}

	}

	void populaFilial() {
		this.filial = new FilialBuilder()
				.setCodigo(Integer.valueOf(tfCodigo.getText()))
				.setNome(tfNome.getText())
				.setCidade(tfCidade.getText())
				.setUf(tfUf.getText())
				.setCnpj(Integer.parseInt(tfCNPJ.getText()))
				.getFilial();
	}

	void populaTela(Filial filial) {
		tfCodigo.setText(filial.getCodigo().toString());
		tfNome.setText(filial.getNome());
		tfCidade.setText(filial.getCidade());
		tfUf.setText(filial.getUf());
		tfCNPJ.setText(String.valueOf(filial.getCnpj()));
	}
	void novoFilial() {
		tfCodigo.clear();
		tfNome.clear();
		tfCidade.clear();
		tfUf.clear();
		tfCNPJ.clear();
		
		filial = new Filial();
		editando = false;
		tblFilial.setItems(FXCollections.observableArrayList(filialDao.listar()));
	}
	
}
