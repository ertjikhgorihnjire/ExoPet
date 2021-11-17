package P;

public class Animal {
	
	protected String nome;
	protected String especie;
	protected String valor;
	
	public Animal(String nome, String especie, String valor) {
		
		this.nome = nome;
		this.especie = especie;
		this.valor = valor;
	}
	
	public void etiqueta(){
	
		System.out.println("Nome do Animal: " + nome);
		System.out.println("Espécie: " + especie);
		System.out.println("Preço: " + valor);
	}

}
