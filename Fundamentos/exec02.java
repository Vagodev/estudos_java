package Fundamentos;

import java.util.Scanner;

public class exec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 - A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, 
				ficou de recupera��o ou foi reprovado. 
				A m�dia de aprova��o � >= 7.0; 
				a m�dia de recupera��o � >= 5.0 e < 7.0; e 
				a m�dia do reprovado � < 5.0
		 */
		
		double nota1,nota2,nota3,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		nota1 = leia.nextDouble();
		
		System.out.println("Insira a segunda nota");
		nota2 = leia.nextDouble();
		
		System.out.println("Insira a terceira");
		nota3 = leia.nextDouble();
		
		 media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			System.out.println("Aluno aprovado, com a m�dia: "+media);
		} else if (media >= 5 ) {
			System.out.println("Aluno em recupera��o,com a m�dia: "+media);
		} else {
			System.out.println("Aluno reprovado,com a m�dia: "+media);
		}
		
		leia.close();
	}

}
