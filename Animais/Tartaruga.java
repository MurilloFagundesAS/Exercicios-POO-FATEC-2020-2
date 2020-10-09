
public class Tartaruga extends Oviparo{
	
	private int qtdeOvos;
	private String genero;
	
	public Tartaruga(int qtdeOvos, String genero) {
		super(qtdeOvos, genero);
		this.qtdeOvos = qtdeOvos;
		this.genero = genero;
		System.out.printf("Construtor Oviparo (String, int): %s, %d (patas) ", this.genero, this.qtdeOvos);
	}

}
