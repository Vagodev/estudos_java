package Fundamentos;

import java.util.Scanner;

public class exec01 {

	public static void main(String[] args) {
		
		/* 
	    ALGORITMO:
		Uma pesquisa para uma empresa que perguntar�:
		1. Qual � o seu nome?;
		2. H� quanto tempo trabalha aqui?;
		3. Qual � o seu sal�rio atual?;
		CALCULAR:
		Se ele tiver mais de 10 anos de trabalho, o sal�rio dele aumentar� 10%. No final o 
		algoritmo deve mostrar o nome do funcion�rio e o sal�rio novo.
		  
		 * */
		
				
		String nome;
		int tempoTrabalho;
		float salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome?");		
		nome = leia.nextLine();
		
		System.out.println("Qual seu tempo de trabalho?");
		tempoTrabalho = leia.nextInt();
		
		System.out.println("Qual � seu sal�rio atual?");
		salario = leia.nextFloat();
		
		if(tempoTrabalho >= 10) {
			salario = (float) (salario + salario * 0.10);
			System.out.println("Nome: " + nome +" - "+ "Sal�rio Ajustado: " + salario);
			
		}else
		
			System.out.println("Voc� ainda n�o tem direito ao reajuste");
		
		leia.close();
		
	}
		
}
