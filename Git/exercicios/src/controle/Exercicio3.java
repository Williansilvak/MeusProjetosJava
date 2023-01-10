package controle;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		int nota1 = teclado.nextInt();			
		System.out.println("Digite a segunda nota");
		int nota2 = teclado.nextInt();
		
		int media = (nota1 + nota2) / 2;
		
		System.out.println("Sua media e: "+ media);
		
		if (media >= 7 && media <= 10 )
		{
			System.out.println("Aprovado");
		}
		else if ( media >= 5 && media <= 6)
		{
			System.out.println("Recuperação");
		}
		else
		{
			System.out.println("Reprovado");
		}
		if (media < 0)
		{
			System.out.println("Nota invalida");
		}

		teclado.close();
		/*Scanner scanner = new Scanner(System.in);

		System.out.println("Nota Parcial 1: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Nota Parcial 2: ");
		double nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Sua média foi " + media + " e você está Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua média foi " + media + " e você está de Recuperação.");
		} else {
			System.out.println("Sua média foi " + media + " e você está Reprovado.");
		}

		scanner.close();*/
	}

}
