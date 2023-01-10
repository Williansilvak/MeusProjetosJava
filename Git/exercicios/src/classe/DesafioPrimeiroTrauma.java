package classe;

public class DesafioPrimeiroTrauma 
{
//instancia
	int a = 3;//não pode mexer aqui
	static int b = 4;//algo statico pode acessar outro membro statico
	
	public static void main(String[] args) //membro statico
	{
		DesafioPrimeiroTrauma b = new DesafioPrimeiroTrauma();//precisa criar instancia
		//para acessar uma instancia
		
		System.out.println(b.a);
		
		System.out.println(b);//algo statico pode acessar outro membro statico
		
	}

}
