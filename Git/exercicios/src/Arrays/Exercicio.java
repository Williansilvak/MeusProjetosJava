package Arrays;

import java.util.Arrays;

public class Exercicio 
{
	public static void main(String[] args) 
	{
		double notasAluno1 [] = new double [3];
		
		System.out.println(Arrays.toString(notasAluno1));
		
		notasAluno1 [0] = 8;
		notasAluno1[1] = 7.5;
		notasAluno1[2] = 6.2;
		
		System.out.println(Arrays.toString(notasAluno1));
		
		double total = 0;
		int lop = 0;
		
		for (lop = 0; lop < notasAluno1.length; lop++)
		{
			total += notasAluno1[lop];
		}
		System.out.println(total / notasAluno1.length);
		
	}

}
