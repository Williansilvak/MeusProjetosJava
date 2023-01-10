package controle;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numero = teclado.nextInt();
		
		if (numero >= 0 && numero <=10) 
		{
			if (numero % 2 == 0) 
		{
				
			System.out.println("O numero " + numero + " esta entre 0 e 10 e "
					+ "é um par.");
		}
		
		else 
		{
			System.out.println("O numero " + numero + " esta entre 0 e 10 mas não "
					+ "é um par.");
		}
		}
		else 
		{
			System.out.println("O numero " + numero + "não está entre  0 e 10.");
		}
		

		teclado.close();
		//tive dificuldade com relação as chaves
		//tive dificuldade em lembrar o codigo, para verificar True or False

		
	}

}
