package aulasClasseAbstratas;

public class Carro extends Veiculo {
	
	public int velocidadeMaxima = 200;
	public int lugares = 5;
	
	
	public Carro() {
		this.roda = 4;
		
	}

	@Override
	public void conduzir() {
		System.out.printf(" O veiculo carro com a velocidade m�xima %d e com %d lugares est� em movimento ", velocidadeMaxima, lugares);
		
	}

}
