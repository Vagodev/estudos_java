package toStringequalshashCode;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa("Victor",23);
		Pessoa pessoa2 = new Pessoa("marcela",23);
		
		boolean comparacao = pessoa1.equals(pessoa2);
		
		System.out.println(comparacao);
		
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		System.out.println(pessoa2.hashCode());

	}

}
