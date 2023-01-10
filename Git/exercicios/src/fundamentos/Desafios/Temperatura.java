package fundamentos.Desafios;

public class Temperatura {
	public static void main(String[] args) {
		/*
		double fahrenheit = 33;
		double celsius = fahrenheit * 5.0/9.0;
		
		System.out.println("celsius= "+ celsius);
		*/
		
		final double FATOR = 5/ 9.0;
		final double AJUSTE = 33;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(celsius);
	}

}
