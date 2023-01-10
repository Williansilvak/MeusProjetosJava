package controle;

import java.util.Scanner;

public class Exercicios4 
{
	public static void main(String[] args) 
	{
		/*Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numero = teclado.nextInt();
		int calculo = numero / numero (&& (numero / 1));
		System.out.println("Calculo: "+ calculo);
		
		if (calculo == numero)
		{
			System.out.println("Esse numero é primo");
		}
		else
		{
			System.out.println("Esse numero nao é primo");
		}	
				

		teclado.close();*/
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		scanner.close();
		
		//ESTÁ ERRADO

	}

	
}
