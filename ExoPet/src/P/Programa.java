package P;

import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	/// Variáveis
		String nome = " ";
		int idade = 0;
		boolean check = true;
		String aux = " ";
		int dinheiro = 0;
		Dono dono = new Dono(nome, idade, check, dinheiro, animais);		/// Instanciação;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		dono.checkIdade(idade);

		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite seu saldo bancário: ");
		dinheiro = sc.nextInt();
		
		System.out.println("Você possui licença? (S/N)");
		aux = sc.nextLine();
			
			if(aux == "n" || aux == "N"){
				dono.setCheck();

			}
		
		
		System.out.println("\n" + "Nome: " + dono.nome);
		System.out.println("Idade: " + dono.idade);
		System.out.println("Licença: " + dono.check);			/// Status passagem de dados = ok
		System.out.println("Dinheiro: " + dono.dinheiro);
		
		
		
		System.out.println("Lista de Animais: ");
		System.out.println("------------------------");
		System.out.println("[1] Papagaio // R$4075,99");
		System.out.println("[2] Girafa // R$8720,99");
		System.out.println("[3] Elefante // R$10.380,99");
		System.out.println("[4] Coala // R$2120,99");
		System.out.println("[5] Crocodilo // R$7400,99");
		System.out.println("[6] Raposa // R$780,99");
		System.out.println("[7] Coruja // R$320,99");
		System.out.println("[8] Salamandra // R$100,99");
		System.out.println("[9] Corvo // R$920,99");
		
		sc.close();
	}
}


