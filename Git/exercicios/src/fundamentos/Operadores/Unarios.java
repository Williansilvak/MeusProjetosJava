package fundamentos.Operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);//Precedencia (++a 1 vai para 2) = (B) depois -- 
		System.out.println(a == b);//Aqui o -- ja foi processado entao B diminuiu o valor
		System.out.println(a);
		System.out.println(b);
		
	}

}
