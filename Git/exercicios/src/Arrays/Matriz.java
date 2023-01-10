package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos alunos ? ");
		int TamanhoDaTurma = teclado.nextInt();
		System.out.println("Quantas notas por aluno");
		int QntDeNotas = teclado.nextInt();
		int Lop1;
		int Lop2;
		double total = 0;
		double media;
		
		
		double [] [] NotasAlunos = new double [TamanhoDaTurma] [QntDeNotas];
		
		for ( Lop1 = 0; Lop1 < NotasAlunos.length; Lop1++)
		{
		for (Lop2 = 0; Lop2 < NotasAlunos[Lop1].length; Lop2++)
		{
			System.out.printf("Informe a nota %d do aluno %d :" , Lop2 + 1 , Lop1 + 1);
			NotasAlunos[Lop1] [Lop2] = teclado.nextDouble();
			total += NotasAlunos[Lop1][Lop2];			
		}
		}
		media = total / (TamanhoDaTurma * QntDeNotas );
		System.out.println("Média da turma é" + media);		
		
		for (double Revisao []: NotasAlunos)
		{
			System.out.println(Arrays.toString(Revisao));
			
		}
		

		teclado.close();
		
	}

}
