package controle;

import java.util.Scanner;

public class Exercicio8 
{
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (int letra = 0; letra < letras.length; letra++) 
		{
			System.out.println(letras[letra]);
		}			
		

		teclado.close();
		
	}

}
