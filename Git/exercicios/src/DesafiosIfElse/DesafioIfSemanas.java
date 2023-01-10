package DesafiosIfElse;

import java.util.Scanner;

public class DesafioIfSemanas 
{
	public static void main(String[] args) 
	{
		//Dimingo = 1
		//Quarta = 4
		//terca = 3
		//Segunda = 2
		//quinta = 5
		//Sexta = 6
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do dia da Semana: ");
		
		String dia = teclado.next();
		/*int Numero = teclado.nextInt();
		
		
		if (Numero < 1 || Numero > 7)
		{
			System.out.println("Esse numero e invalido");
		}
		else if (Numero == 1)
		{
			System.out.println("Esse numero indica que é Domingo");
		}
		else if (Numero == 2)
		{
			System.out.println("Esse numero indica que é Segunda");
		}
		else if (Numero == 3)
		{
			System.out.println("Esse numero indica que é Terca");
		}
		else if (Numero == 4)
		{
			System.out.println("Esse numero indica que é Quarta");
		}
		else if (Numero == 5)
		{
			System.out.println("Esse numero indica que é Quinta");
		}
		else if (Numero == 6)
		{
			System.out.println("Esse numero indica que é Sexta");
		}
		else if (Numero == 7)
		{
			System.out.println("Esse numero indica que e Ssabado");
		}
		
		System.out.println("\nVoce descobriu que dia e !!!!");*/
		
		//aqui usa o equals para ignorar as letras maiusculas
		if ("domingo".equalsIgnoreCase(dia)) 
		{
			System.out.println(1);		
		}
		else if("segunda".equalsIgnoreCase(dia))
		{
			System.out.println(2);			
		}
		else if("terça".equalsIgnoreCase(dia)
				|| "terca".equalsIgnoreCase(dia))
		{
			System.out.println(3);
		}
		else
		{
			System.out.println("Dia invalido!");
		}
		teclado.close();
		
	}

}
