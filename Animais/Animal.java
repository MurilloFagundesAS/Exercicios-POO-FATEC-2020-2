
public class Animal {
	private String nome;
	private int patas;
	
	
	public Animal () {
		System.out.println("Construtor Animal Padrão");
	}
	public Animal (String nome) {
		this.nome = nome;
		System.out.println("Construtor Animal (String): " + this.nome);
	}
	public Animal(String nome, int patas) {
		this.nome = nome;
		this.patas = patas;
		System.out.printf("Construtor Animal (String, int): %s, %d (patas) ", this.nome, this.patas);
	}

}
