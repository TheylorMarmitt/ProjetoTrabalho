package principal;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
import principal.model.Aluguel;
import principal.model.Carro;

public class DevolucaoController {

		@FXML
	    private TableView<Aluguel> tblAlugados;

	    @FXML
	    private TableColumn<Aluguel, Number> tbcCodigo;

	    @FXML
	    private TableColumn<Aluguel, String> tbcCarro;

	    @FXML
	    private TableColumn<Aluguel, String> tbcCliente;
	    
	    @FXML // adicional
	    private TableColumn<Aluguel, LocalDate> tbcDataLocacao;
	     
	    @FXML
	    private Button btnDevolucao;

	    @FXML
	    private Label LblValorTotal;
	    
	    @FXML
	    private TextField tfValorTaxa;
	    
	    Aluguel aluguel;
	    private AluguelDAO aluguelDao = new AluguelArquivo();
	    boolean editando;
	    
	    private CarroDAO carroDao = new CarroArquivo();
	    

	    @FXML
		private void initialize() {
			tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
			tbcCarro.setCellValueFactory(new PropertyValueFactory<>("carro"));
			tbcCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
			tbcDataLocacao.setCellValueFactory(new PropertyValueFactory<>("dataAluguel"));
			
			novoAluguel();
		}
	    
	    @FXML
	    void devolver(ActionEvent event) {
	    		aluguel.setDataDevolucao(LocalDate.now());
	    		for(Carro carro : carroDao.listar()){
	    			if(carro.equals(aluguel.getCarro())) {
	    				carro.setDisponivel(true);
	    				carroDao.alterar(carro);
	    			}
	    		}
	    		aluguelDao.excluir(aluguel);
	    		Double valorTotal = (Double.parseDouble(tfValorTaxa.getText()) * aluguel.diasLocacao()) + aluguel.getCarro().getValor() ;
	    		LblValorTotal.setText(valorTotal.toString());

	    }
	    
	    void novoAluguel() {
	    		aluguel = new Aluguel();
	    		tblAlugados.setItems(FXCollections.observableArrayList(aluguelDao.listar()));
	    }
	    

	    @FXML
	    void selecionaAlugado(MouseEvent event) {
			if (tblAlugados.getSelectionModel().getSelectedItem() != null) {
				aluguel = tblAlugados.getSelectionModel().getSelectedItem();
				editando = true;
			}
	    }
	    
	    
	
}
