package controle;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ano ");
		int ano = teclado.nextInt();
		
		/*int calculo = ano / 4;
		
		if (calculo == 505)
		{
		System.out.println("ñ" + calculo);
		}
		else
		{
			System.out.println("ñ");
		}*/
		
		boolean bissexto = ano % 4 == 0;//Ainda não sei para que essa parte (&& ((ano % 100) != 0 || ano % 400 == 0)
		
		if (bissexto == true)
		{
			System.out.println(ano + " é um ano bissexto");
		}
		else 
		{
			System.out.println(ano + " não é um ano bissexto");			
		}

		teclado.close();
		
		
	}

	
}
