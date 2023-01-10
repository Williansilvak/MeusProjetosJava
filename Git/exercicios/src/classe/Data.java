package classe;

public class Data 
{
	int dia;
	int mes; 
	int ano;
	
	Data()
	{
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);//Usando This como metodo
		
	}
	
	String obterDataFormatada()//melhor opcao por retornar string, e poder modificar
	{
	//this(1, 1, 1970);//n pode usar this em outro contrutor
		
		final String formato = "%d/%d/%d";//essa variavel só pode utilizar 
		//a partir de agora
		
		return String.format("Meu  proximo aniversario e ",formato
				+ "", dia, mes, ano);		
	}
	void opcaoDataFormatada() //void = ausencia de retorno, ele n retorna nada
	{
		System.out.printf("%d/%d/%d" , dia, mes,  ano);
		
	}
	
	Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
				
	}	
	
	void imprimirDataFormatada()
	{
		System.out.println(this.obterDataFormatada());
	}
	          //DESAFIO
	//contrutor que só recebe a da 01/01/1970 DATA DEFAUT
	//e o outro com dia mes e ano

}
