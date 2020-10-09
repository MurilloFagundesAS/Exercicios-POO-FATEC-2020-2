
public class Veiculo2 {

	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo();
		Veiculo carro2 = new Veiculo();
		
		carro1.setMarca("Marca1");
		carro1.setModelo("Modelo1");
		carro1.ligarCarro();
		carro1.desligarCarro();
		
		System.out.println();
		carro2.setMarca("Marca2");
		carro2.setModelo("Modelo2");
		carro2.ligarCarro();
		carro2.desligarCarro();
		

	}

}
