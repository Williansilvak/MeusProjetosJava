package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashSet Conjunto = new HashSet();
		
		Conjunto.add(1.2); // Double
		Conjunto.add(true);//Boolean
		Conjunto.add("teste");//String t minusculo
		Conjunto.add(1);//Int
		Conjunto.add("x");
		
		System.out.println("Tamanho do conjunto e "+ Conjunto.size());
		
		Conjunto.add("teste");
		Conjunto.add('x');

		System.out.println("Tamanho do conjunto e "+ Conjunto.size());
		System.out.println(Conjunto.remove("teste"));
		System.out.println(Conjunto.remove("Teste"));
		System.out.println(Conjunto.remove('x'));
		System.out.println("Tamanho do conjunto e "+ Conjunto.size());
		
		

		System.out.println(Conjunto.contains('x'));
		System.out.println(Conjunto.contains(1));
		System.out.println(Conjunto.contains(true));
		
		Set ConjuntoDeNums = new HashSet();
		
		ConjuntoDeNums.add(1);
		ConjuntoDeNums.add(2);
		ConjuntoDeNums.add(3);
		
		System.out.println(ConjuntoDeNums);
		System.out.println(Conjunto);
		
		//conjunto.addll(ConjuntoDeNums); // uniao entre dois conjuntos
		Conjunto.retainAll(ConjuntoDeNums);
		System.out.println(Conjunto);
		
		Conjunto.clear();
		System.out.println(Conjunto);
		
		
		
		
		
		
		
		
		
		
		
	}

}
