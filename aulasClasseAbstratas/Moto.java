package aulasClasseAbstratas;

public class Moto extends Veiculo {
	
	public String cor = "Verde";
	public String marca = "Yamaha";
	
	public Moto () {
		this.roda = 2;
		
	}

	@Override
	public void conduzir() {
		System.out.printf(" O veiculo de cor %s e de marcar %s está em movimento",cor,marca);
		
	}

}
