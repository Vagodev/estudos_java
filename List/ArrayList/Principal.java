package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal extends Produtos{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produtos> list = new ArrayList<>();
		
		System.out.println("Quantos produtos deseja cadastrar");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Produto " + (i+1)+" : ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			
			Produtos produto = new Produtos(nome,preco);
			list.add(produto);
				
		}
		System.out.println();
		System.out.println("===== lista de produtos =====");
		for(Produtos produto : list) {
			System.out.println(produto);
			
		}
		
		sc.close();		
		
		
	}
}
