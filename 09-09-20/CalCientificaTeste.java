
public class CalCientificaTeste {

	public static void main(String[] args) {
		CalCientifica cientifica = new CalCientifica();
		
		System.out.println(cientifica.raiz(49));
		System.out.println(cientifica.raiz(64));
		System.out.println(cientifica.raiz("100"));
		System.out.println(cientifica.potencia(3, 2.0));
		System.out.println(cientifica.potencia(3, 3));
		System.out.println(cientifica.potencia("4", "2"));

	}

}
