package principal;

import java.time.LocalDate;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import principal.dao.FilialArquivo;
import principal.dao.FilialDAO;
import principal.dao.VendedorArquivo;
import principal.dao.VendedorDAO;
import principal.model.Filial;
import principal.model.Vendedor;

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
    private TableView<?> tblVendedor;

    @FXML
    private TableColumn<?, ?> tbcCodigo;

    @FXML
    private TableColumn<?, ?> tbcNome;

    @FXML
    private Button btnAdicionar;
    
    @FXML
    private Button btnEditar;

    @FXML
    private Button btnRemover;
   
    @FXML
    private ComboBox<Filial> cbFilial;
    
    
    private VendedorDAO vendedorDAO = new VendedorArquivo(); 
    
    private boolean editando;
    
    
    @FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		populaCombo();
		novoVendedor();
	}
    
	private void populaCombo(){
		for(Vendedor vendedor: vendedorDAO.listar()){
			cbFilial.getItems().add(vendedor);
		}
	}

    @FXML
    void adicionarVendedor(ActionEvent event) {
    		populaVendedor();
    		if (editando) {
				vendedorDAO.alterar(vendedor);
			} else {
				vendedorDAO.inserir(vendedor);
			}
			
			
			populaVendedor();
	
			if (!editando) {
				tbCarro.getItems().add(carro);
			}
			novoCarro();
    }
    
    @FXML
    void editaVendedor(ActionEvent event) {

    }

    @FXML
    void removerVendedor(ActionEvent event) {
    		List<Vendedor> dados = filial.getVendedores();
    		dados.remove(vendedor);
    		filial.setVendedores(dados);
    		filialDAO.excluir(filial);
    		filialDAO.inserir(filial);
    }
    
    public void populaVendedor() {
    		vendedor.setCodigo(filial.getVendedores().size()+1);
    		vendedor.setCpf(tfCPF.getText());
    		vendedor.setDataNascimento(dtNascimento.getValue());
    		vendedor.setDataDeAdmissao(LocalDate.now());
    		vendedor.setDataDeDemissao(null);
    		vendedor.setEmail(tfEmail.getText());
    		vendedor.setNome(tfNome.getText());
    		vendedor.setTelefone(tfTelefone.getText());
    		filial = cbFilial.getValue();
    }
    
    public void populaTela(Vendedor vendedor) {
    		cbFilial.getSelectionModel().select(filial);
    		tfNome.setText(vendedor.getNome());
    		tfTelefone.setText(vendedor.getTelefone());
    		tfCPF.setText(vendedor.getCpf());
    		tfEmail.setText(vendedor.getEmail());
    		dtNascimento.setValue(vendedor.getDataNascimento());
    }
    
    @FXML
	void selecionaVendedor(MouseEvent event) {
		if (tblVendedor.getSelectionModel().getSelectedItem() != null) {
			vendedor = (Vendedor) tblVendedor.getSelectionModel().getSelectedItem();
			populaTela(vendedor);
			editando = true;
		}
	}
    
    void novoVendedor() {
    		cbFilial.setValue(null);
		tfNome.clear();
		tfTelefone.clear();
		tfCPF.clear();
		tfEmail.clear();
		dtNascimento.setValue(null);
		tblVendedor.setItems(FXCollections.observableArrayList(vendedorDAO.);
		
    }
	
}
