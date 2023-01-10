package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola Mundo" .charAt(2)); 
		
		String s = "boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "@@@");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.equals("boa tardE"));
		
		var nome = "Pedro";
		var sobrenome = "santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome);
		System.out.println("idade: "+ idade);
		System.out.println("salario: "+ salario);
		System.out.println("frase qualquer".contains("qual"));
		
	}

}
