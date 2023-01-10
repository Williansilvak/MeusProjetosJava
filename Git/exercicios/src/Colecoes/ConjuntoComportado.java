package Colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado 
{
	public static void main(String[] args) 
	{
		//Set <String> Lista = new HashSet<String>();
		Set <String> Lista = new TreeSet<String>();
		
		//vai dar erro pq definimos a variavel como String
		//Lista.add(1.2);
		
		Lista.add("Ana");
		Lista.add("Lilian");
		Lista.add("Beatriz");
		Lista.add("Will");
		Lista.add("Vando");
		
		for (String Mostrar : Lista)
		{
			System.out.println();
			System.out.println(Mostrar);
		}
		
		
		Set <Integer> Numeros = new TreeSet<>();
		Numeros.add(1);
		Numeros.add(2);
		Numeros.add(3);
		Numeros.add(4);
		Numeros.add(5);
		
		for (int MostrarNums : Numeros)
		{
			System.out.println();
			System.out.println(MostrarNums);
		}
		
	}

}
