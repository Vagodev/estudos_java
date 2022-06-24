package Fundamentos;

public class Jogador  {

	public static void main(String[] args) {
		
		
		Ak ak = new Ak();
		M4 m4 = new M4();
		
		ak.Atirar();
		m4.Atirar();
		
		ak.cor="Dourado";
		
	System.out.println(ak.cor);

	}
}