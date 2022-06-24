package interfacePoliformismo;

public class pessoaJuridica implements tipoPessoa {

	@Override
	public void calularDesconto(double valor) {
		double valorFinal =  (valor * 0.15);
		System.out.println(valor - valorFinal);
		
	}

}
