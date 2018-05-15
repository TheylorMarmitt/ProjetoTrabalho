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
import principal.dao.AluguelArquivo;
import principal.dao.AluguelDAO;
import principal.model.Aluguel;

public class DevolucaoController {

	 @FXML
	    private TableView<Aluguel> tblAlugados;

	    @FXML
	    private TableColumn<Aluguel, Number> tbcCodigo;

	    @FXML
	    private TableColumn<Aluguel, String> tbcCarro;

	    @FXML
	    private TableColumn<Aluguel, String> tbcCliente;

	    @FXML
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

	    @FXML
		private void initialize() {
			tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
			tbcCarro.setCellValueFactory(new PropertyValueFactory<>("carro"));
			tbcCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
			tbcDataLocacao.setCellValueFactory(new PropertyValueFactory<>("dataAluguel"));

			aluguel = new Aluguel();
			tblAlugados.setItems(FXCollections.observableArrayList(aluguelDao.listar()));
			
		}
	    
	    @FXML
	    void devolver(ActionEvent event) {
	    		aluguelDao.excluir(aluguel);
	    		aluguel.setDataDevolucao(LocalDate.now());
	    		Double valorTotal = aluguel.diasLocacao() * Double.parseDouble(tfValorTaxa.getText());
	    		LblValorTotal.setText(valorTotal.toString());
	    }
	
}
