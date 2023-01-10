package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		           //System.out.println(2+3);
		
		int raio = 3;
		
		           //o  final vai dizer q esse vai ser o valor de pi indiscutivelmente
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.println("pi="+ area);
		
		raio = 10;
		area = pi* raio* raio;
		
		System.out.println("Area ="+ area + "m2");			
		 
	}

}
