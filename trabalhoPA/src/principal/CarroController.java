package principal;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import principal.dao.CarroArquivo;
import principal.dao.CarroDAO;
import principal.model.Carro;
import principal.model.CarroBuilder;

public class CarroController {

	@FXML
	private TextField tfCodigo;

	@FXML
	private TextField tfAno;
	@FXML
	private TextField tfMarca;

	@FXML
	private TextField tfValor;

	@FXML
	private TextField tfModelo;

	@FXML
	private TextField tfCor;

	@FXML
	private TextField tfPlaca;

	@FXML
	private TableView<Carro> tbCarro;

	@FXML
	private TableColumn<Carro, Number> tbcCodigo;

	@FXML
	private TableColumn<Carro, String> tbcMarca;

	@FXML
	private TableColumn<Carro, Double> tbcValor;

	@FXML
	private TableColumn<Carro, String> tbcModelo;

	@FXML
	private TableColumn<Carro, String> tbcCor;

	@FXML
	private TableColumn<Carro, String> tbcPlaca;

	@FXML
	private CheckBox ckbDisponivel;

	@FXML
	private TableColumn<Carro, Boolean> tbcDisponivel;

	@FXML
	private TableColumn<Carro, Number> tbcAno;

	Carro carro;
	private CarroDAO carroDao = new CarroArquivo();
	Boolean editando;

	@FXML
	private void initialize() {
		tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		tbcAno.setCellValueFactory(new PropertyValueFactory<>("ano"));
		tbcMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
		tbcValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
		tbcModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
		tbcCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
		tbcPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
		tbcDisponivel.setCellValueFactory(new PropertyValueFactory<>("disponivel"));
		carro = new Carro();
		tbCarro.setItems(FXCollections.observableArrayList());

		novoCarro();
	}

	@FXML
	void excluir(ActionEvent event) {
		carroDao.excluir(carro);
		novoCarro();
	}

	@FXML
	void novo(ActionEvent event) {
		novoCarro();
	}

	@FXML
	void salvar(ActionEvent event) {

		populaCarro();

		if (editando) {
			carroDao.alterar(carro);
		} else {
			carroDao.inserir(carro);
		}

		populaCarro();

		if (!editando) {
			tbCarro.getItems().add(carro);
		}
		novoCarro();
		tbCarro.refresh();
	}

	@FXML
	void selecionaCarro(MouseEvent event) {
		if (tbCarro.getSelectionModel().getSelectedItem() != null) {
			carro = tbCarro.getSelectionModel().getSelectedItem();
			populaTela(carro);
			editando = true;
		}

	}

	void populaCarro() {
		this.carro = new CarroBuilder().setCodigo(Integer.valueOf(tfCodigo.getText())).setMarca(tfMarca.getText())
				.setModelo(tfModelo.getText()).setValor(Double.parseDouble(tfValor.getText())).setCor(tfCor.getText())
				.setPlaca(tfPlaca.getText()).setAno(Integer.parseInt(tfAno.getText()))
				.setDisponivel(ckbDisponivel.isSelected()).getCarro();
	}

	void populaTela(Carro carro) {
		tfCodigo.setText(carro.getCodigo().toString());
		tfAno.setText(carro.getAno().toString());
		tfMarca.setText(carro.getMarca());
		tfModelo.setText(carro.getModelo());
		tfCor.setText(carro.getCor());
		tfPlaca.setText(carro.getPlaca());
		tfValor.setText(carro.getValor().toString());

		if (carro.getDisponivel()) {
			ckbDisponivel.setSelected(true);
		}

	}

	void novoCarro() {
		tfCodigo.clear();
		tfMarca.clear();
		tfModelo.clear();
		tfPlaca.clear();
		tfValor.clear();
		tfCor.clear();
		tfPlaca.clear();
		tfAno.clear();
		carro = new Carro();
		editando = false;
		ckbDisponivel.setSelected(false);
		tbCarro.setItems(FXCollections.observableArrayList(carroDao.listar()));
	}

}
