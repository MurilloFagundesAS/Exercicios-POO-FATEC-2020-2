
public class Veiculo {
	
	private String marca;
	private String modelo;
	
	public void ligarCarro() {
		System.out.printf("O veiculo %s da %s foi ligado!", this.modelo,this.marca);
		System.out.println();
	}
	public void desligarCarro() {
		System.out.printf("O veiculo %s da %s foi desligado!", this.modelo,this.marca);
		System.out.println();
	}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca () {
		return this.marca;
	}
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo(String modelo) {
		return this.modelo;
	}
	
}
