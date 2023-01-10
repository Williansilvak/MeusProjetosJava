package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 100000;
		System.out.println(num1.toString());
		
		int num2 = 1000000;
		System.out.println(Integer.toString(num2,num1));	
		
		System.out.println((""+ num1));
		
		
	}

}
