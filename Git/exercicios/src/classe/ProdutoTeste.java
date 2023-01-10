package classe;

public class ProdutoTeste 
{
	public static void main(String[] args) 
	{
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1 retorna algo porque na classe produto ja tem o contrutor 
		//para retornar os valores
		
		var p2 = new Produto();//Produto esta sem retorno, pq (p2.nome) ja tem um valor
		p2.nome = "caneta preta";
		p2.preco = 12.56;
		
		
		Produto.desconto = 0.29;//Aqui pode alterar o desconto
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - Produto.desconto);
		double precoFinal2 = p2.preco * (1 - Produto.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
