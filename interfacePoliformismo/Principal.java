package interfacePoliformismo;

public class Principal {

	public static void main(String[] args) {
		pessoaFisica pf = new pessoaFisica();
		pessoaJuridica pj = new pessoaJuridica();
		Triangulo tr = new Triangulo(10,20);
		Quadrado qd = new Quadrado(50,50);
		
		tr.calcularArea();
		qd.calcularArea();
		
		pf.calularDesconto(550);
		pj.calularDesconto(550);
		

	}

}
