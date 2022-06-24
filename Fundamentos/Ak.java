package Fundamentos;

public class Ak implements Arma{

	String cor;

	@Override
	public void Atirar() {
		System.out.println("Gastou 25 balas");
		
	}

	@Override
	public void Recarregar() {
		System.out.println("Você vai gastar 2 segundos para recarregar");
		
	}
	
	//construtor
	public Ak(String cor) {
		
		this.cor = cor;
		
	}
	
	public Ak() {
		
	}

}
