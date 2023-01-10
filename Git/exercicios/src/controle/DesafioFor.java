package controle;

public class DesafioFor 
{
	public static void main(String[] args) {
		
		//Equals é para limitar até a quantidade de "#" que vc colocou, aqui foi 7
		//O i+= "#" é para ir adicionando de 1 em 1 até atingir o equals
		for(String i = "#"; !i.equals("#######"); i += "#")
		{
			System.out.println(i);			
		}
		
		//o "#" que foi adicionada foi para delimitar o limite de #, aqui foi 6
		//V+= é o incremento, sempre vai adicionar #
		
		for (String v = "#"; !v.equals("######"); v += "#")
		{
			System.out.println(v);
		}
	}

}
