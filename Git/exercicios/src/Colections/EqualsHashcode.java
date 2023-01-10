package Colections;

import java.util.Date;

public class EqualsHashcode 
{
	public static void main(String[] args) 
	{

		Usuario Pessoa = new Usuario();
		Pessoa.Nome = "Pedro Souza";
		Pessoa.email = "pedraomlkzica@gmail.com";
		

		Usuario Pessoa2 = new Usuario();
		Pessoa2.Nome = "Pedro Souza";
		Pessoa2.email = "pedraomlkzica@gmail.com";
		
		
		System.out.println(Pessoa == Pessoa2);
		System.out.println(Pessoa.equals(Pessoa2));
		
		//System.out.println(Pessoa2.equals(new Date())); 		
		
	}		

}
