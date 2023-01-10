package fundamentos.Operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 5.6;
		String reprovado = media >= 5.0 ? "em recuperacao." : "reprovado.";
		String resultado = media >= 7.0 ? "aprovado.": reprovado;
		/*String resultado = media >= 7.0 ?
		"aprovado.": media >= 5.0 ? "em recuperacao." : "reprovado.";*/
		
		
		System.out.println("O aluno esta " + resultado);
		
	
		
	}

}
