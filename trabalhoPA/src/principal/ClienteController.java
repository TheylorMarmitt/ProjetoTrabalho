package principal;

import java.time.LocalDate;

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
import principal.dao.ClienteArquivo;
import principal.dao.ClienteDAO;
import principal.model.Cliente;
import principal.model.ClienteBuilder;

public class ClienteController {


    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfCPF;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfCNH;

    @FXML
    private DatePicker dtNascimento;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnNovo;

    @FXML
    private Button btnExcluir;

    @FXML
    private TableView<Cliente> tblCliente;

    @FXML
    private TableColumn<Cliente, Integer> tbcCodigo;

    @FXML
    private TableColumn<Cliente, String> tbcNome;

    @FXML
    private TableColumn<Cliente, LocalDate> tbcDataCadastro;
    
    private Cliente cliente = new Cliente();
    
    private boolean editando;
    
    private ClienteDAO clienteDAO = new ClienteArquivo();
    
	@FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tbcDataCadastro.setCellValueFactory(new PropertyValueFactory<>("dataDeCadastro"));

		novoCliente();
	}

    @FXML
    void salvar(ActionEvent event) {
    		populaCliente();
    		if(editando) {
    			clienteDAO.alterar(cliente);
    		}else {
    			clienteDAO.inserir(cliente);
    		}
    		novoCliente();
    		tblCliente.refresh();
    }
    
    @FXML
    void novo(ActionEvent event) {
    		novoCliente();
    }
    
    @FXML
    void excluir(ActionEvent event) {
    		clienteDAO.excluir(cliente);
    		novoCliente();
    }
    
    public void populaCliente() {
    		this.cliente = new ClienteBuilder()
    				.setCodigo(Integer.valueOf((tfCodigo.getText())))
    				.setNome(tfNome.getText())	
    				.setEmail(tfEmail.getText())
    				.setTelefone(tfTelefone.getText())
    				.setCpf(tfCPF.getText())
    				.setCnh(tfCNH.getText())
    				.setDataNascimento(dtNascimento.getValue())
    				.setDataDeCadastro(LocalDate.now())
    				.getCliente();

    }
    
    public void populaTela(Cliente cliente) {
    		tfCodigo.setText(cliente.getCodigo().toString());
    		tfNome.setText(cliente.getNome());
    		tfCPF.setText(cliente.getCpf());
    		tfCNH.setText(cliente.getCnh());
    		tfEmail.setText(cliente.getEmail());
    		tfTelefone.setText(cliente.getTelefone());
    		dtNascimento.setValue(cliente.getDataNascimento());

    }
    
    @FXML
	void selecionaCliente(MouseEvent event) {
		if (tblCliente.getSelectionModel().getSelectedItem() != null) {
			cliente = tblCliente.getSelectionModel().getSelectedItem();
			populaTela(cliente);
			editando = true;
		}
	}
    
    void novoCliente() {
    		tfCodigo.clear();
    		tfNome.clear();
    		tfCPF.clear();
    		tfEmail.clear();
    		tfTelefone.clear();
    		tfCNH.clear();
    		dtNascimento.setValue(null);
    		tblCliente.setItems(FXCollections.observableArrayList(clienteDAO.listar()));
    }
}