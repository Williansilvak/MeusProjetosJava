package Colecoes;

import java.util.ArrayList;

public class Lista 
{
	public static void main(String[] args) 
	{
		ArrayList<Usuario> lista = new ArrayList();
		
		Usuario Pessoas = new Usuario("Ana");
		
		lista.add(Pessoas);
		
		lista.add(new Usuario("Carlos"));

		lista.add(new Usuario("Carlos"));

		lista.add(new Usuario("Carlos"));

		lista.add(new Usuario("Carlos"));

		lista.add(new Usuario("Carlos"));
		
		for (Usuario Resumo : lista)
		{
			System.out.println(Resumo);
		}
		
	}

}
