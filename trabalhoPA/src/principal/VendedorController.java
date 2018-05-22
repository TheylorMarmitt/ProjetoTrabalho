package principal;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import principal.dao.VendedorArquivo;
import principal.dao.VendedorDAO;
import principal.model.Vendedor;
import principal.model.VendedorBuilder;

public class VendedorController {

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfCPF;

    @FXML
    private TextField tfEmail;

    @FXML
    private DatePicker dtNascimento;

    @FXML
    private TableView<Vendedor> tblVendedor;

    @FXML
    private TableColumn<Vendedor, Number> tbcCodigo;

    @FXML
    private TableColumn<Vendedor, String> tbcNome;
    
    @FXML
    private TextField tfCodigo;

    @FXML
    private Button btnAdicionar;
    
    @FXML
    private Button btnEditar;

    @FXML
    private Button btnRemover;
   
    
    Vendedor vendedor; 
    
    private VendedorDAO vendedorDao = new VendedorArquivo(); 
    
    private boolean editando;
    
    
    @FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		vendedor = new Vendedor();

		novoVendedor();
	}
    
    @FXML
    void adicionarVendedor(ActionEvent event) {
    		populaVendedor();
    		if (editando) {
			vendedorDao.alterar(vendedor);
		} else {
			vendedorDao.inserir(vendedor);
		}
		novoVendedor();
		tblVendedor.refresh();
    }
    
    @FXML
    void editaVendedor(ActionEvent event) {
    		novoVendedor();
    }

    @FXML
    void removerVendedor(ActionEvent event) {
    		vendedorDao.excluir(vendedor);
    		novoVendedor();
    }
    
    public void populaVendedor() {
    		this.vendedor = new VendedorBuilder()
    				.setCodigo(Integer.parseInt(tfCodigo.getText()))
    				.setNome(tfNome.getText())
    				.setTelefone(tfTelefone.getText())
    				.setCpf(tfCPF.getText())
    				.setEmail(tfEmail.getText())
    				.setDataNascimento(dtNascimento.getValue())
    				.getVendedor();

    }
    
    public void populaTela(Vendedor vendedor) {
    		tfCodigo.setText(vendedor.getCodigo().toString());
    		tfNome.setText(vendedor.getNome());
    		tfTelefone.setText(vendedor.getTelefone());
    		tfCPF.setText(vendedor.getCpf());
    		tfEmail.setText(vendedor.getEmail());
    		dtNascimento.setValue(vendedor.getDataNascimento());
    }
    
    @FXML
	void selecionaVendedor(MouseEvent event) {
		if (tblVendedor.getSelectionModel().getSelectedItem() != null) {
			vendedor = tblVendedor.getSelectionModel().getSelectedItem();
			populaTela(vendedor);
			editando = true;
		}
	}
    
    void novoVendedor() {
    		
    		tfCodigo.clear();
		tfNome.clear();
		tfTelefone.clear();
		tfCPF.clear();
		tfEmail.clear();
		dtNascimento.setValue(null);
		tblVendedor.setItems(FXCollections.observableArrayList(vendedorDao.listar()));
    }
	
}
