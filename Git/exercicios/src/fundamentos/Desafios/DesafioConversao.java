package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao 
{
	public static void main(String[] args) 
	{
		//Scanner
		//3 string NexLine 3 ultimos salrios de um funcionario e calcular 
		//pode usar ponto ou virgula
		//somar o salario dividir por 3 e da media
		//converter string no valor numerico
		
		/*Scanner teclado = new Scanner(System.in);		
		String janeiro = JOptionPane.showInputDialog(
				"Digite o Salario de janeiro");		
		String fevereiro = JOptionPane.showInputDialog(
				"Digite o Salario de fevereiro");		
		String marco = JOptionPane.showInputDialog(
				"Digite o Salario de março");				
		System.out.println(janeiro + fevereiro + marco);		
		double mes1 = Double.parseDouble(janeiro);
		double mes2 = Double.parseDouble(fevereiro);
		double mes3 = Double.parseDouble(marco);		
		double soma = mes1 + mes2 + mes3;
		System.out.println("Soma e: " + soma);
		System.out.println(
				"Valor do salario dos 3 meses e: " + soma / 3);		
		String nome = teclado.nextLine();		
		System.out.println("\n nome = "+ nome);
		teclado.close();	
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário");
		//na string está falando, aquilo que recebi em entrada .next
		String valor1= entrada.next().replace(",",".");//replace para substituir algo 
		
		System.out.println("Informe o segundo salário");
		String valor2= entrada.next().replace(",",".");
		
		System.out.println("Informe o terceiro salário");
		String valor3= entrada.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3; 
		System.out.println("A média dos salarios é" + media);
		
		entrada.close();
				
	}

}
