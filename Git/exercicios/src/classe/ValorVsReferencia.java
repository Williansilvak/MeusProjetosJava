package classe;

public class ValorVsReferencia
{
	public static void main(String[] args) 
	{
		double a = 2;
		double b = a;//fez a junção dos valores
		
		a++;//fez a separação dos valores
		b--;//fez a separação dos valores
		
		System.out.println(a+" "+b);
		
		
		
		Data d1 = new Data ();//e esse vai ser excluido apos a mudança
		Data d2 = d1;//atribuição por referencia (objeto)
		
		d2.dia = 5;
		d1.mes = 7;
		
		System.out.println(d2.dia);
		System.out.println(d1.mes);
		
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d2.dia);
		System.out.println(d1.mes);
	}
	
	static void voltarDataParaValorPadrao(Data d)
	{
		d.dia = 1;
		d.mes = 1;
		d.ano  = 1970;
	}
}
