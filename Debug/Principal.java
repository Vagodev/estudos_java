package Debug;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero = 0 ;
		int resultado = 1;
		
		System.out.println("Insira um numero");
		numero = leia.nextInt();
		int numeroImpresso = numero;
		
		if(numero <= 0) {
			System.out.println("o número não pode ser negativo! ou igual a 0");
			
		}else {
			while(numero > 0) {
				resultado = resultado * numero;
				numero --;				
			}
			System.out.printf("O fatorial de %d é %d", numeroImpresso,resultado);
		}
		leia.close();		
	}

}
