package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalcularTriangulo 
{
	public static void main(String[] args) 
	{
//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		/*int a = 4;
		int b = 3;
		int c = 5;
		
		int s = a + b + c;
		
		System.out.println("A area do triangulo é igual: " + s /2);*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo: ");
		int base = teclado.nextInt();
		
		System.out.println("Digite a altura: ");
		int altura = teclado.nextInt();
		
		int area = (base * altura) / 2;
		
		System.out.print("A area do triangulo e: " + area);
		
		teclado.close();
		
		
	}

}
