package controle;

import java.util.Scanner;

public class IfElseIf 
{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digita a nota: ");
		
		double nota =  teclado.nextDouble();
		 if (nota > 10 || nota < 0)
		 {
			 System.out.println("Nota Invalida");
		 }
		 //entao se
		 else if (nota >= 8.1)
		 {
			 System.out.println("Conceito A");
		 }
		 else if (nota >= 6.1)
		 {
			 System.out.println("Conceito B");			 
		 }
		 else if (nota >= 5.1)
		 {
			 System.out.println("Conceito C");
		 }
		 else if (nota >= 4.1)
		 {
			 System.out.println("Conceito D");			 
		 }
		 else if (nota >= 3.1)
		 {
			 System.out.println("Conceito E");
		 }
		 else if (nota >= 2.1)
		 {
			 System.out.println("Conceito F");			 
		 }
		 
		 System.out.println("Fim");
		teclado.close();
	}

}
