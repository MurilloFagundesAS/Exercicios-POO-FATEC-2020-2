
public class Gato extends Mamifero{
	
	private String nome;
	
	public Gato(String nome) {
		super(nome, 4);	
		this.nome = nome;
		System.out.println("Construtor Gato (String): " + this.nome);
	}
	
}
