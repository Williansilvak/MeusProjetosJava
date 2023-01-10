package fundamentos.Desafios;
import java.util.Scanner;

public class DesafioAltura 
{
	public static void main(String[] args) 
	{
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println("Digite sua altura");
		double altura = Teclado.nextDouble();
		
		System.out.println("Digite seu peso");
		double peso = Teclado.nextDouble();
				
		double resultado = peso / (altura * altura);
		
		System.out.print("Resultado:%.2f" + resultado);
		
		Teclado.close();
		
		
	}
	
}
