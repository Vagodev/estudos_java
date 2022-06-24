package Fundamentos;

import java.util.Scanner;

public class exec04 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
			Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
		 */
		
		 int parcela = 5;
		double preco;
		double divisao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor da compra" );
		preco = leia.nextDouble();
		divisao = (preco / parcela);
		for(int i = 1; i <= parcela; i++) {
			System.out.println("Parcelas " + i + " - " + divisao);
		}
		leia.close();
	}

}
