package controle;

import java.util.Scanner;

public class ifs 
{
	
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double nota = teclado.nextDouble();

		if(nota <= 10 && nota >= 7.0)
		{
			System.out.println("Aprovado");		
            System.out.println("Parabens agora vc tem um diploma");
		}
		
		boolean criterioRecuperacaoAtingido = nota < 7 && nota >= 4;
		if (criterioRecuperacaoAtingido) 
		{
			System.out.println("recuperacao");
		}
		
		boolean criterioReprovacaoAtingido  = nota < 4.5 && nota >=0;		
		if (criterioReprovacaoAtingido) 
		{
			System.out.println("Reprovado, estude mais ");
		}
		teclado.close();
		
	}

}
