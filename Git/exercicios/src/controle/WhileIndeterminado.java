package controle;

import java.util.Scanner;

public class WhileIndeterminado 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);

		String valor = "";
		
		//enquanto não for digitado a palavra (sair) continue executando o while inderteminado
		while (!valor.equalsIgnoreCase("sair"))
		{
			System.out.println("Voce diz: ");
			valor = teclado.nextLine();
		}

		teclado.close();
		
	}

}
