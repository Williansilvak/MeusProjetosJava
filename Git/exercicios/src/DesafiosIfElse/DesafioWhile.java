package DesafiosIfElse;

import java.util.Scanner;

public class DesafioWhile 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o que vc quer repetir");
		String repeticao = teclado.nextLine();
		
		while(repeticao == "domingo")
		{
			System.out.printf("domingo", repeticao);
			repeticao+=20;
		}
		
		
		teclado.close();
	}

}
