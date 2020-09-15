
public class TesteImpressora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impressora impressora1 = new Impressora();
		
		impressora1.exibir(10);
		impressora1.exibir(10, 10);
		impressora1.exibir(10, "String");
		impressora1.exibir("String", 10);
		impressora1.exibir(10, 10, "String");
		impressora1.exibir("String", "String", "String");
	

	}

}
