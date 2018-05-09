package principal;

import java.time.LocalDate;

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

public class ClienteController {


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
    
    private Cliente cliente;
    
    private boolean editando;
    
    private ClienteDAO clienteDAO = new ClienteArquivo();
    
    private Integer codigo = 0;
    
	@FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tbcDataCadastro.setCellValueFactory(new PropertyValueFactory<>("dataCadastro"));

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
    		cliente.setCodigo(codigo+1);
    		cliente.setNome(tfNome.getText());
    		cliente.setEmail(tfEmail.getText());
    		cliente.setTelefone(tfTelefone.getText());
    		cliente.setCpf(tfCPF.getText());
    		cliente.setCnh(tfCNH.getText());
    		cliente.setDataNascimento(dtNascimento.getValue());
    		cliente.setDataDeCadastro(LocalDate.now());
    }
    
    public void populaTela(Cliente cliente) {
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
    		tfNome.clear();
    		tfCPF.clear();
    		tfEmail.clear();
    		tfTelefone.clear();
    		tfCNH.clear();
    		dtNascimento.setValue(null);
    }


}
