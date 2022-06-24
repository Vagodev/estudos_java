package aulasClasseAbstratas;

public class principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.racaAnimal("Pastor");
		
		Moto  moto = new Moto();
		Carro carro = new Carro();
		
		
		moto.conduzir();
		carro.conduzir();
		

	}

}
