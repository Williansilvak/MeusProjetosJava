package fundamentos.Operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);//and (e)
		System.out.println(condicao1 || condicao2);//or (ou)
		System.out.println(condicao1 ^ condicao2);//ou exclusivo, um é verdadeiro e o outro é falso
		System.out.println(!condicao1);//negação sempre vai ser ao contrario
		System.out.println(!condicao2);//negação sempre vai ser ao contrario
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
