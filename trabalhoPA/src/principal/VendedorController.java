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
    
    private Vendedor vendedor;
    
    private Filial filial;
    
    private FilialDAO filialDAO = new FilialArquivo();
    
    private Integer codigo; 
    
    private boolean editando;
    
    
    @FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		populaCombo();
		novoVendedor();
	}
    
	private void populaCombo(){
		for(Filial filial: filialDAO.listar()){
			cbFilial.getItems().add(filial);
		}
	}

    @FXML
    void adicionarVendedor(ActionEvent event) {
    		populaVendedor();
    		if(editando) {
    			// pega a lista vendedor da filial
    			List<Vendedor> dados = filial.getVendedores();
    			for (Vendedor vendedores : dados) {
    				if (vendedores.equals(dados)) {
    					dados.remove(vendedores);
    					dados.add(vendedor);
    					break;
    				}
    			}
    			filial.setVendedores(dados);
    			// exclui e filial atual do arquivo
    			filialDAO.excluir(filial);
    			// add a nova filial no arquivo
    			filialDAO.inserir(filial);
    		}else {
    			List<Vendedor> dados = filial.getVendedores();
    			dados.add(vendedor);
    			filial.setVendedores(dados);
    			filialDAO.excluir(filial);
    			filialDAO.inserir(filial);
    		}
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
    		vendedor.setCodigo(codigo + 1);
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
		//tblVendedor.setItems(FXCollections.observableArrayList(filial.getVendedores()));
    }
	
}
