package P;

import java.util.ArrayList;

public class Dono {
	
	protected String nome;
	protected int idade;
	protected boolean check; // Licença
	protected int dinheiro;
	protected ArrayList<Animal> animais;
	
	public Dono(String nome, int idade, boolean check, int dinheiro, ArrayList<Animal> animais) {		/// Inicializando tudo
		
		this.nome = nome;
		this.idade = idade;
		this.check = check;
		this.dinheiro = dinheiro;
		this.animais = new ArrayList<Animal>();
		
	}
	
	public void setAnimais(ArrayList<Animal> animais) {
		
		
		
	}

}
