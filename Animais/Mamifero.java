
public class Mamifero extends Animal {
	
	private String nome;
	private int patas;
	
	public Mamifero(String nome, int patas) {
		super(nome, patas);
		this.nome = nome;
		this.patas = patas;
		System.out.printf("Construtor Mamifero (String, int): %s, %d (patas) ", this.nome, this.patas);
	}

}
