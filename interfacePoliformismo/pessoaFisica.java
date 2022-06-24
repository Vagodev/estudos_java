package interfacePoliformismo;

public class pessoaFisica implements tipoPessoa {

	@Override
	public void calularDesconto(double valor) {
		double valorFinal =  (valor * 0.10);
		System.out.println(valor - valorFinal);
		
	}
	
	

}
