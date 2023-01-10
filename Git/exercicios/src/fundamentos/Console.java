package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.println(" \n\nBom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		//aqui no Scanner vai ler tudo que a pessoa digitar no teclado
		Scanner entrada = new Scanner(System.in);		
		//vai pegar a frase escrita com letras e preparar para proxima linha
		System.out.println("digite seu nome: ");		
		String nome = entrada.nextLine();
		
		System.out.println("\n nome = "+ nome);
		
		entrada.close();
		
	}

}
