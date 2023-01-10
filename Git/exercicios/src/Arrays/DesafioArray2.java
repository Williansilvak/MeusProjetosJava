package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray2 {
	public static void main(String[] args) 
	{		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as suas notas");
		int quantidadeDeArrays = teclado.nextInt();
		
//aquu cria a array e fala q a quantidade de [] é igual a variavel (quantidadeDeArrays)
		double [] Notas = new double [quantidadeDeArrays];
		
//aqui fala enquanto tiver nota maior 0 ele vai continuar ++ se nota = 0 para o lop
		for (int Lop = 0; Lop < Notas.length; Lop +=1)
//int lop = da onde ele vai começar. do 0 ou 5 qual for o escolhido
		{
			System.out.println("informe a nota " + Lop);
//aqui substitui quantidadeDeArrays para colocar o numero das notas q é o (Lop)
			Notas[Lop] = teclado.nextDouble();
		}
		System.out.println(Arrays.toString(Notas));
		
		double SomaDasNotas = 0;
//Para cada nota um resumo
		for (double Resumo : Notas)
		{
//O resumo pega os numeros do Lop
			System.out.println(Resumo);						
			SomaDasNotas += Resumo;
			System.out.println(SomaDasNotas);
		}
		
		System.out.println("A média é" + (SomaDasNotas / Notas.length));
		

		teclado.close();		
		
	}

}
