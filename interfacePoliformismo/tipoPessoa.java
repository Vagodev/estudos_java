package interfacePoliformismo;


/*
 * NTERFACE
Devemos montar um algoritimo para realizar o desconto de uma compra.
Crie uma interface com nome "TipoPessoa" com o atributo valor, e um metodo calcular desconto
Para pessoa fisica o desconto é de 10%
Para pessoa Juridica o desconto é de 15%

sabendo que o produto é R$ 550,00, qual o valor final do produto para cada tipo de pessoa?
 */

public interface tipoPessoa {
	
	public double valor = 0;
	
	public  void  calularDesconto(double valor);
	

}
