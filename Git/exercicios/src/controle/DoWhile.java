package controle;

import java.util.Scanner;

public class DoWhile 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String texto = "Sim";

		do 
		{
			System.out.println("Voce precisa falar"
					+ "\nas palavras magicas...");
			System.out.println("Quer sair? ");
			texto = teclado.nextLine();
			
		}
		while(!texto.equalsIgnoreCase("Sim"));
		System.out.println("Obrigado!");

		teclado.close();
	}

}
