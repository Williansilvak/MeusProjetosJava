package fundamentos.Desafios;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// 1 trabalho V TV 32
		// 2 trabalhos V TV 50
		// comprando a tv 32 e 50 a familia vai tomar sorvete
		//trabalho de ter e de quinta F, se n tomou sorte ficou = triste
		
		/*boolean trabalhoterca = true;
		boolean trabalhoquinta = true;
		boolean tvs = trabalhoterca && trabalhoquinta;
		
		
		System.out.println("Trabalhei na terça");
		System.out.println(trabalhoterca);
		System.out.println("\nTrabalhei na quinta");
		System.out.println(trabalhoquinta);
		System.out.println("\nComprei TV 32");
		System.out.println(!trabalhoterca);	
		System.out.println("\nComprei TV 50");
		System.out.println(!trabalhoquinta);	
		System.out.println("\nComprei uma TV de 32 e uma de 50");
		System.out.println(tvs);*/
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//operador unario
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Esta mais saudavel? " + maisSaudavel);
						
	}

}
