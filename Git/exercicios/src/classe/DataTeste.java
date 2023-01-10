package classe;

public class DataTeste 
{
	public static void main(String[] args) 
	{
		Data aniversario = new Data(28,05,2023);
		
		Data aniversario2 = new Data();		
		
		
		System.out.println(aniversario);
		System.out.println(aniversario2);
		
		System.out.println(aniversario);
		String dataformatada = aniversario.obterDataFormatada();
		
		System.out.println(dataformatada);//opção 1
		
		System.out.println(aniversario.obterDataFormatada());//opção 2
		
		aniversario.opcaoDataFormatada();//opção 3	
	
		
		
	}

}
