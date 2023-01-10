package tentativa1;

import java.util.Scanner;

public class TesteCase 
{
	public static void main(String[] args) 
	{
		
		
		Scanner teclado = new Scanner(System.in);
		double preco;
		int Dinheiro = 10;
		String continuar = "Sim";	


		System.out.println("Numero dos produtos"
				+ "\nChiclete = 1"
				+ "\nRefrigerante = 2"
				+ "\nPao Frances = 3"
				+ "\nQueijo = 4");
				
		System.out.println("Digite o numero do produto");
		int Padaria = teclado.nextInt();

		System.out.println("Voce tem" + Dinheiro);
				
	do
	{			
		switch (Padaria)
		{
		
		case 1:
			System.out.println("Voce digitou o numero do Chiclete");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Chiclete = %.2f ", preco);
			System.out.println("\nQuer continuar ?");
			continuar = teclado.next();			
			continue;

		case 2:
			System.out.println("Voce digitou o numero do Refrigerante");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Refrigerante = %s ", preco);
			System.out.println("\nQuer continuar ?");
			continuar = teclado.next();
			break;

		case 3:
			System.out.println("Voce digitou o numero do Pao Frances");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Pao Frances = %s", preco);
			System.out.println("Quer continuar ?");
			continuar = teclado.next();	
			break;

		case 4:
			System.out.println("Voce digitou o numero do Queijo 200 gr");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Queijo 200 gr = %s", preco);
			System.out.println("Quer continuar ?");
			continuar = teclado.next();	
			break;

		case 5:
			System.out.println("Voce digitou o numero do Presunto 200 gr");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Presunto 200 gr = ", preco);
			System.out.println("Quer continuar ?");
			continuar = teclado.next();	
			break;

		case 6:
			System.out.println("Voce digitou o numero do Bolo de Chocolate");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Bolo de Chocolate = ", preco);
			System.out.println("Quer continuar ?");
			continuar = teclado.next();	
			break;

		case 7:
			System.out.println("Voce digitou o numero do Pao de Forma");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Pao de Forma = ", preco);
			System.out.println("Quer continuar ?");
			continuar = teclado.next();	
			break;

		case 8:
			System.out.println("Voce digitou o numero do Pao de banha");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Pao de banha = ", preco);
			System.out.println("Quer continuar ?");
			continuar = teclado.next();	
			break;

		case 9:
			System.out.println("Voce digitou o numero do Salgadinho");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Salgadinho = ", preco);			
			break;

		case 10:
			System.out.println("Voce digitou o numero do Coxinha");
			System.out.println("\nDigite o valor da compra");
			preco = teclado.nextDouble();
			System.out.printf("Coxinha = ", preco);
			break;

		}
	}

	while (continuar == "Sim");
	
	if (continuar == "Sim")
	{
		
		
	}

				
			
		teclado.close();	
		
	}

}
