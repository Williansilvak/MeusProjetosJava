package fundamentos.Operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2+3);
		
		var x = 34.56;
		double y = 2.2;	
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);//colocando numeros quebrados
		System.out.println(a / (float) b);// float tem uma precisao menor
		
		
		//operador modulo, o resto da divisao
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
		
		
		
	}

}
