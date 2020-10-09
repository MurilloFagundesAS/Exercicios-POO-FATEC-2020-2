
public class Cachorro extends Mamifero{
	
	private String nome;
	
	public Cachorro(String nome) {
		super(nome, 4);
		this.nome = nome;
		System.out.println("Construtor Cachorro (String): " + this.nome);
		
	}
	
	

}
