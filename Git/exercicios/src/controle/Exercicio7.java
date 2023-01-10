package controle;

import java.util.Scanner;

public class Exercicio7 
{
	public static void main(String[] args) 
	{
		/*Scanner teclado = new Scanner(System.in);
		int sair;
		System.out.println("Digite o primeiro numero da soma");
		int num1 = teclado.nextInt();
		System.out.println("Digite o segundo numero da soma");
		int num2 = teclado.nextInt();
		int positivo = num1 + num2;
			
			if (num1 <0)
			{
			System.out.println("O numero digitado era negativo, falha na soma");
			sair = teclado.nextInt();
			}
			
			else
			{
				System.out.printf("O resultado da soma é: "+ positivo);
			}
		
			
		teclado.close();*/

		Scanner scanner = new Scanner(System.in);

		int calculo = 0;
		int numero = 1;

		while (numero >= 1) 
		{
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = scanner.nextInt();
			if (numero >= 1) 
			{
				calculo = calculo + numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", calculo);
			}
			else
			{
				System.out.println("Fim da soma, volte sempre :)");
			}
			
		}
		scanner.close();
		
	}

}
