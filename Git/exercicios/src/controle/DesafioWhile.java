package controle;

import java.util.Scanner;

public class DesafioWhile 
{
	public static void main(String[] args) 
	{
		/*Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a nota");
		int nota = teclado.nextInt();
		
		String texto = "Sim";

		do 
		{
			System.out.println("Voce quer adicionar mais notas ?");
			System.out.println("Ou quer sair? ");
			texto = teclado.nextLine();
			
		}
		while(!texto.equalsIgnoreCase("Sim"));
		System.out.println("Continue inserindo notas");
		System.out.println("Nota atual"+ nota);
		nota = teclado.nextInt();
		
		while(nota= 1;)

		teclado.close();*/
		
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1)
		{
			System.out.println("Informe a nota: ");
			nota = teclado.nextDouble();				
		
		if(nota <=10 && nota >= 0)
		{
			total += nota;
			quantidadeDeNotas++;			
		}else if (nota != -1)
		{
			System.out.println("Nota Invalida!!!");
		}
		}
		//calculo da media
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media);

		

		teclado.close();
	}

}
