package fundamentos;

public class ConversaoTipoPrimitivos {
	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; //explícita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //explicita (CAST) como se vc falasse para o pc confiar em vc
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);
	}

}
