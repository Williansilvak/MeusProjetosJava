package classe.Desafio;

public class Jantar 
{
	public static void main(String[] args) 
	{
		Comida prato1 = new Comida("Parmegiana", 0.222);
		Comida prato2 = new Comida("Lasanha", 0.400);
		
		Pessoa Humano = new Pessoa("Will", 74.0);
		
		System.out.println(Humano.apresentar());
		Humano.comer(prato1);
		
		System.out.println(Humano.apresentar());
		Humano.comer(prato2);
		
		System.out.println(Humano.apresentar());
		
		
	}

}
