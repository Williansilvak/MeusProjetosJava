package fundamentos.Desafios;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		//6*(3+2)ao quadrado / 3*2, - , (1-5)* (2-7) ao quadrado /2
		//resultado 150 - 100 elevado a 3 , e 10 elevado a 3
		//resultado 50 ao cubo / 10 ao cubo 
		//resultado final 125
		
		
		/*int num1 = (3 + 2)* 6; //quebrei a formula por parte e fiz o calculo
		int formula1 = (int) Math.pow(num1, 2); //elevei o resultado do num1 a 2 potencia, eu poderia ter feito tudo junto com num1 em 1 só variavel
		int divi1 = 3 * 2; //fiz a divisao da formula
		int resultado1 = formula1 / divi1; // fiz a divisao do resultado da formula1 com o da divi1
		
		int num2 = (1 - 5); //quebrei a formula e fiz a subtracao
		int formula2 = (2 - 7) * num2; //quebrei outra parte da formula e multipliquei o resultado com o resultado do num2
		int divi2 = (int) Math.pow(2 , 2);//fiz isso para descobri o resultado de 2 elevado a 2
		int resultado2 = (int) Math.pow(formula2, 2)/ divi2;//aqui fiz o calculo da formula2 elevado a 2 e depois divido o resultado da divi2 com o da formula2 elevado a 2
		
		int juncao = 150 - 100;// peguei o resultado1 e o resultado2 e subtrai
		int expoentes = (int) Math.pow(juncao, 3);//peguei a juncao e elevei ao cubo
		int expoentes2 = (int) Math.pow(10,3);//quebrei a formula e separei o 10 elevado ao cubo e auqi descubro o resultado de 10 elevado ao cubo
		int divi3 = expoentes / expoentes2;// aqui faz a divisao do expoentes e expoentes2 assim dando o resultado de toda a formula
		int resultado3 = divi3;
		
							
		System.out.println(resultado1);		
		System.out.println(resultado2);
		System.out.println(resultado3);*/
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
	
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10,3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);			
		
					
	}

}
