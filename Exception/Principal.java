package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		double numero ;
		
		
			System.out.println("Informe um numero");
		try {	
			numero = sc.nextDouble();
			System.out.println("Número informado é: " + numero);
			
		}catch(InputMismatchException exception){
			System.out.println("Tipo de entrada diferente do esperado");
			
		}
		

	}

}
