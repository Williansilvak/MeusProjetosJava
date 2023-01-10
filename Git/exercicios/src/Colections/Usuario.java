package Colections;

public class Usuario 
{
	String Nome;
	String email;
	
	public boolean equals(Object Procurador) 
	{
		if(Procurador instanceof Usuario)
		{
		
		Usuario outro = (Usuario) Procurador;		
		boolean nomeIgual = outro.Nome.equals(this.Nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		}
		else 
		{
			return false;
		}
		
	}

}
