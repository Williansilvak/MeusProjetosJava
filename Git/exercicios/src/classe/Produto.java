package classe;

public class Produto 
{
	String nome;
	double preco;
	static double desconto = 0.25;//0.9 90% de desconto,0.3 30% de desconto
	
	Produto()
	{
	}
	
	Produto(String nomeInicial, double precoInicial)
	{
		nome = nomeInicial;
		preco = precoInicial;				
	}	
	
	double precoComDesconto()
	{
	return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente)
	{
		return preco * (1- desconto + descontoDoGerente);
	}
	
}
 