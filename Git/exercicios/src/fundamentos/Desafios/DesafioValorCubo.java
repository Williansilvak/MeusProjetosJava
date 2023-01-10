package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioValorCubo 
{
	public static void main(String[] args) 
	{
		//Criar um programa que leia um valor e 
		//apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor1 = teclado.nextInt();
		
		int quadrado = (int) Math.pow(valor1, 2);
		int cubo = (int) Math.pow(valor1,3);
		
		/*System.out.println("Resultado ao quadrado e: "+ quadrado);
		System.out.println("Resultado ao Cubo e: "+ cubo);*/
		
		System.out.printf("O valor ao quadrado e: " + quadrado +
				 "\nO valor ao cubo e: " + cubo);
		
		teclado.close();
				
	}

}
