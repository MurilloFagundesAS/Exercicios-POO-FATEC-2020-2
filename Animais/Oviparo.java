
public class Oviparo extends Animal {
	private int qtdeOvos;
	private String genero;
	
	public Oviparo(int qtdeOvos, String genero) {
		this.qtdeOvos = qtdeOvos;
		this.genero = genero;
		System.out.printf("Construtor Oviparo (String, int): %s, %d (patas) ", this.genero, this.qtdeOvos);
	}
	
}
