package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 
{
	public static void main(String[] args) 
	{
		/*System.out.println("Jogo da advinhação de 0 a 100:");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero para advinhar");
		int tentativa = teclado.nextInt();
		
		int contador;		
		for (contador =0; contador <= 100; contador++)
			System.out.println(contador);
		
		int sorteado = contador = tentativa;
		
		
		switch (sorteado)		
		{
		case 50:
		System.out.println("escolheu numero certo");
		}
		
		
		if (tentativa > contador )
		{
			if (tentativa < contador)
			{
				System.out.println("Escolheu um numero menor que o sorteado");
			}		
		
			System.out.println("Escolheu um numero maior que o sorteado");
		}
		teclado.close();*/
		
		Scanner teclado = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numeroEscolhido;
				
		
		do {			
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo! Sera que consegue me vencer?");
			tentativas = 0;			

			do 
			{				
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numeroEscolhido = teclado.nextInt();				
				
				if (tentativas >= 10)
				{
					System.out.printf("\nInfelizmente atingiu o limite de tentativas ");
					continuar = teclado.nextInt();
					teclado.close();
					
				}
				if (numeroEscolhido > numeroSorteado) 
				{
					System.out.printf("\nO numero sorteado e menor que %d\n\n", numeroEscolhido);
				} 				
				else if (numeroEscolhido < numeroSorteado) 					
				{
					System.out.printf("\nO numero sorteado e maior que %d\n\n", numeroEscolhido);
				}					
				else 
				{
					System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
				}				
			}			 
			
			while (numeroEscolhido != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = teclado.nextInt();	
		}
		
		while (continuar != 0);
		teclado.close();		
		
  }
	
}
