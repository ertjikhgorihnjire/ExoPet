package P;

import java.util.ArrayList;
import java.util.Scanner;

public class Dono {
	
	protected String nome;
	protected int idade;
	protected boolean check; // Licen�a
	protected int dinheiro;
	protected ArrayList<Animal> animais;
	public Scanner sc = new Scanner(System.in);
	
	public Dono(String nome, int idade, boolean check, int dinheiro, ArrayList<Animal> animais) {		/// Inicializando tudo
		
		this.nome = nome;
		this.idade = idade;
		this.check = check;
		this.dinheiro = dinheiro;
		this.animais = new ArrayList<Animal>();
		
	}
	
	public void checkIdade(int idade){		//// Checa a idade do comprador

		if(idade <= 17){

			System.out.println("É necessário ter 18 anos ou mais para adquirir animais.");
			System.exit(0);

		}

	}

	public void checkAuto(String bool){		/// Verificação de licenciamento

		if(bool == "n" || bool == "N"){

			setCheck();

		}
	}

	public void setCheck(){

		System.out.println("Gostaria de fazer sua licença agora? (S/N)");
		getCheck(sc.nextLine());
		
	}

	public void getCheck(String aux){

		if(aux == "n" || aux == "N"){

			System.out.println("Não podemos prosseguir sem o usuário ter licença.");
			System.exit(0);

		}else if(aux == "s" || aux == "S"){

			System.out.println("Aprovamos sua licença! Podemos continuar...");

		}else{

			System.out.println("Erro: Comando Inválido. Retornando...");
			setCheck();

		}

	}

	public void setAnimais(ArrayList<Animal> animais) {
		
		
		
	}

}
