package Fundamentos;

import java.util.Scanner;

public class exec01 {

	public static void main(String[] args) {
		
		/* 
	    ALGORITMO:
		Uma pesquisa para uma empresa que perguntará:
		1. Qual é o seu nome?;
		2. Há quanto tempo trabalha aqui?;
		3. Qual é o seu salário atual?;
		CALCULAR:
		Se ele tiver mais de 10 anos de trabalho, o salário dele aumentará 10%. No final o 
		algoritmo deve mostrar o nome do funcionário e o salário novo.
		  
		 * */
		
				
		String nome;
		int tempoTrabalho;
		float salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");		
		nome = leia.nextLine();
		
		System.out.println("Qual seu tempo de trabalho?");
		tempoTrabalho = leia.nextInt();
		
		System.out.println("Qual é seu salário atual?");
		salario = leia.nextFloat();
		
		if(tempoTrabalho >= 10) {
			salario = (float) (salario + salario * 0.10);
			System.out.println("Nome: " + nome +" - "+ "Salário Ajustado: " + salario);
			
		}else
		
			System.out.println("Você ainda não tem direito ao reajuste");
		
		leia.close();
		
	}
		
}
