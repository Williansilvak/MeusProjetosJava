package classe.Desafio;

public class Pessoa 
{
	String nome;
	double peso;
	
	Pessoa (String nome, double peso)
	{
		this.nome = nome;
		this.peso = peso;
	}
		
	void comer(Comida comeu)
	{
		if(comeu != null)
		{
			this.peso += comeu.peso;
		}
	}
	
	String apresentar()
	{
		return "Ola sou o " + nome + " e estou pesando " + peso;
		
	}
	

}
