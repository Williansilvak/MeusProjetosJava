package fundamentos.Desafios;

public class DesafioBhaskara 
{
	public static void main(String[] args) 
	{
		/*Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		utilizando a fórmula de Bhaskara.
		Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta*/
		
		int a = 6;
		int b = 5;
		int c = 12;
		
		int valorDelta = (b * b);
		int valor2 = a * c;
				
		int valor3 = 4 * valor2;
		
		int resultado = valorDelta - valor3;
		
		System.out.println("valordelta: " + valorDelta);
		System.out.println("valor2 " + valor2);
		System.out.println("valor3 " + valor3);
		
		System.out.println("Valor do delta é: "+ resultado);	
		

		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		scanner.close();*/
						
		
	}

}
