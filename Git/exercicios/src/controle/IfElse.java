package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"informe o numero: ");
		int numero = Integer.parseInt(valor);
		
		/*if(numero % 2 == 0) 
		{
			System.out.println("Numero par");
		}
		
		if(numero % 2 == 1) 
		{
			System.out.println("numero impar");
		}*/
		
		//se if não for % 2 == 0
		if(numero % 2 == 0)
		{
			System.out.println("Numero par");
		}
		//então else
		else 
		{
			System.out.println("Numero impar");
		}
	}

}
