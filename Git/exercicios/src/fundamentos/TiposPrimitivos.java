package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionario
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//Colocamos o (L) para dizer para o java que é uma variavel (Long)
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		//Colocamos o (F) para dizer para o java que é uma variavel (Float)
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; //True
		
		//Tipo caractere
		char status = 'A' ; //ativo
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha " + salario);
		System.out.println("Férias ?" + estaDeFerias);
		System.out.println("Status:" + status);
		
	}

}
