package principal;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import principal.dao.AluguelArquivo;
import principal.dao.AluguelDAO;
import principal.dao.CarroArquivo;
import principal.dao.CarroDAO;
import principal.dao.ClienteArquivo;
import principal.dao.ClienteDAO;
import principal.dao.FilialArquivo;
import principal.dao.FilialDAO;
import principal.dao.VendedorArquivo;
import principal.dao.VendedorDAO;
import principal.model.Aluguel;
import principal.model.Carro;
import principal.model.Cliente;
import principal.model.Filial;
import principal.model.Vendedor;

public class AlugarController {

    @FXML
    private ComboBox<Carro> cbcarro;

    @FXML
    private ComboBox<Vendedor> cbVendedor;

    @FXML
    private ComboBox<Filial> cbFilial;

    @FXML
    private TableView<Cliente> tblCliente;

    @FXML
    private TableColumn<Cliente, Number> tbcCodigo;

    @FXML
    private TableColumn<Cliente, String> tbcNome;

    @FXML
    private Button btnAlugar;
    
    @FXML
    private TextField tfCodigo;

    @FXML
    private Label lblMensagem;
    
    Aluguel aluguel;
    private AluguelDAO aluguelDao = new AluguelArquivo();
    private CarroDAO carroDao = new CarroArquivo();
    private VendedorDAO vendedorDao = new VendedorArquivo();
    private FilialDAO filialDao = new FilialArquivo();
    private ClienteDAO clienteDao = new ClienteArquivo();
    
    
    @FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		populaComboCarro();
		populaComboFilial();
		populaComboVendedor();
		novoAluguel();
	}

    private void populaComboCarro(){
		for(Carro carro : carroDao.listar()){
			cbcarro.getItems().add(carro);
		}
	}
    
    private void populaComboVendedor(){
		for(Vendedor vendedor: vendedorDao.listar()){
			cbVendedor.getItems().add(vendedor);
		}
	}
    
    private void populaComboFilial(){
		for(Filial filial: filialDao.listar()){
			cbFilial.getItems().add(filial);
		}
	}
    
    
    @FXML
    void selecionaCliente(MouseEvent event) {
    		if (tblCliente.getSelectionModel().getSelectedItem() != null) {
    			aluguel.setCliente(tblCliente.getSelectionModel().getSelectedItem());
    		}
    }
    
    @FXML
    void Alugar(ActionEvent event) {
    		populaAluguel();
 
    		if(aluguel.getCarro() == null || aluguel.getCodigo() == null) {
    			lblMensagem.setText("Erro de aluguel. Campos em falta");
    		}else if(aluguel.getCarro().getDisponivel() == false){
    			lblMensagem.setText("Carro Indisponível");	
    		}else {
    			lblMensagem.setText("Aluguel realizado com Sucesso");
    			aluguelDao.inserir(aluguel);
    			aluguel.getCarro().setDisponivel(false);
    			carroDao.inserir(aluguel.getCarro());
    		}
    		novoAluguel();
    		
    }
    
    
    void populaAluguel() {
    		aluguel.setCodigo(Integer.parseInt(tfCodigo.getText()));
    		aluguel.setCarro(cbcarro.getValue());
    		aluguel.setFilial(cbFilial.getValue());
    		aluguel.setVendedor(cbVendedor.getValue());
    		aluguel.setDataAluguel(LocalDate.now());
    		aluguel.setDataDevolucao(null);
    }
    
    void novoAluguel(){
    		cbcarro.getSelectionModel().clearSelection();
    		cbVendedor.getSelectionModel().clearSelection();
    		cbFilial.getSelectionModel().clearSelection();
		tblCliente.setItems(FXCollections.observableArrayList(clienteDao.listar()));
    }

}
