package principal.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivo<T> {

	private String path;
	
	public ManipuladorArquivo(String path) {
		this.path = path;
	}
	
	public void gravar(List<T> dados){
		try (
				FileOutputStream file = new FileOutputStream(this.path); 
				ObjectOutputStream out = new ObjectOutputStream(file)
			) {
			out.writeObject(dados);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<T> recuperar(){
		try (FileInputStream file = new FileInputStream(this.path);
				ObjectInputStream in = new ObjectInputStream(file)) {
			return (List<T>) in.readObject(); 
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
