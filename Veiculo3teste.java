
public class Veiculo3teste {

	public static void main(String[] args) {
		Veiculo3 carro1 = new Veiculo3("Marca1", "Modelo1");
		Veiculo3 carro2 = new Veiculo3("Marca2", "Modelo2");
		
		carro1.ligarCarro();
		carro1.desligarCarro();
		
		System.out.println();
		carro2.desligarCarro();
		

	}

}