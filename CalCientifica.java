public class CalCientifica {
	
	double y;
	
	public double raiz(int x) {
		double y = Math.sqrt(x);
		return y;
	}
	
	public double raiz(double x) {
		double y = Math.sqrt(x);
		return y;
	}
	
	public double raiz(String x) {
		int numeroX = Integer.parseInt(x);
		y = Math.sqrt(numeroX);
		return y;
	}

	public double potencia(int a, int b) {
		return Math.pow(a, b);
	}
	
	public double potencia(String s1, String s2) {
		double d1 = Integer.parseInt(s1);
		double d2 = Integer.parseInt(s2);
		return Math.pow(d1, d2);
	}
	
	public double potencia(int a, double b) {
		y = Math.pow(a, b);
		return y;
	}


}
