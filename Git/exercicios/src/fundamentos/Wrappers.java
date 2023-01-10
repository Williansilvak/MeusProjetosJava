package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//Todos são orientados a objetos
		// byte
		Byte b = 100;
				Short s = 1000;
				//Integer.perseInt(entrada.next());
				Integer i = 10000;//int em wrapper
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("false");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");		
				
	}

}
