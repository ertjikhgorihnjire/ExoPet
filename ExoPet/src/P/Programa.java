package P;

import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	/// Vari�veis
			String nome = " ";
				int idade = 0;
					boolean check = true;
						int dinheiro = 0;
							ArrayList<Animal> animais = new ArrayList<Animal>();
								Dono dono;
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite seu saldo banc�rio: ");
		dinheiro = sc.nextInt();
		
		
		dono = new Dono(nome, idade, check, dinheiro, animais);		/// Instancia��o
		System.out.println("\n" + "Nome: " + dono.nome);
		System.out.println("Idade: " + dono.idade);
		System.out.println("Licen�a: " + dono.check);			/// Status passagem de dados = ok
		System.out.println("Dinheiro: " + dono.dinheiro);
		
		sc.close();
	}
}


