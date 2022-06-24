package Fundamentos;

import java.util.Scanner;

public class exec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Crie um programa que troque os valores que estão armazenados nas variáveis nome1 e nome2.
			A variável nome1 armazenara o valor “mestre do universo”. A variável nome2 receberá um valor informado pelo usuário.
			Altere os valores das variáveis e exiba a soma da variável nome1 com o valor da variável nome2.
		 */
		
		String nome1 = "mestre do universo";
		String nome2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um nome ");
		nome2 = leia.nextLine();
		
		nome1 = nome2;
		nome2 = nome1;
		
		System.out.println(nome1 +" " + nome2);

	}

}
