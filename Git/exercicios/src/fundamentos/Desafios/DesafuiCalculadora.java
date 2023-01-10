package fundamentos.Desafios;

import java.util.Scanner;

public class DesafuiCalculadora 
{
	
	public static void main(String[] args)
	{
		// ler num1
		// Ler num2
		// + - * / %		
								
		Scanner Teclado = new Scanner(System.in);
				
		System.out.println("Digite um numero");
		double num1 = Teclado.nextDouble();
		
		System.out.println("Digite o segundo numero");
		double num2 = Teclado.nextDouble();
		
		System.out.println("Escolha a operacao entre +,-,*,% ");
		String operacao = Teclado.next();	
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 1;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		//%.2f mostrou a variavel resultado, esse codigo é para dar o espaço 
		//certo e mostrar 2 casas de 00 depois da virgula
		//mordulo é para ver se o numero é impar ou par
		System.out.printf("%.2f %s %.2f = %.2f",
				num1,operacao,num2,resultado);		
		Teclado.close();		
				
	}

}
