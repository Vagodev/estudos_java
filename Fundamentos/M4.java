package Fundamentos;

public class M4 implements Arma {

	@Override
	public void Atirar() {
		System.out.println("Gastou 30 balas");
		
	}

	@Override
	public void Recarregar() {
		System.out.println("Voc� vai gastar 2 segundos para recarregar");
		
	}
	
	public void Silenciar() {
		System.out.println("Silenciar");
	}

}
