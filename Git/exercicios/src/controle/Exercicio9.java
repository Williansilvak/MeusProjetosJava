package controle;

import java.util.Scanner;

public class Exercicio9 
{
	public static void main(String[] args) 
	{
		int numero;
		int tentativa;
		int continuar;
		int maiorNumero = 0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Digite os numeros\n ");
		
		do
		{
			System.out.printf("Comecou\n");
			tentativa = 0;
						
		do 
		{			
			tentativa++;
			System.out.printf("Tentativa %d: ", tentativa);
			numero = teclado.nextInt();	
			

			if (numero > maiorNumero) 
			{
				maiorNumero = numero;
			}
						
			
		}
		
		while (tentativa != 10);	

		System.out.printf("O maior valor foi: " + maiorNumero);
			System.out.println("\nSaindo");
			continuar = teclado.nextInt();				
			
		
		}
		
		
			while (continuar != 0);
		
		
		/*int maiorValor = 0;
		int contador = 0;

		do 
		{
			System.out.println("\nDigite um numero: ");
			int valor = teclado.nextInt();

			if (valor > maiorValor) 
			{
				maiorValor = valor;
			}

			contador++;
		} 
		while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);*/

		teclado.close();
		
	}

}
