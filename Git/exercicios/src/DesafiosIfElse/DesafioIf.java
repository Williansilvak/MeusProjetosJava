package DesafiosIfElse;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a nota");
		double nota = teclado.nextDouble();
			
		// não usar (;) em estruturas de controle (tem uma exceção)
		if(nota >= 9.0);
			
		{
			System.out.println("aprovado");
		
		}
		
		{
		
			System.out.println("voce é fera");
		}	
		
		
		teclado.close();
	}

}
