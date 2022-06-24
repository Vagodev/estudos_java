package interfacePoliformismo;

public class Quadrado extends Figura {
	
	
	public Quadrado() {
		
	}
	
	public Quadrado(double altura, double base) {
		this.altura = altura;
		this.base = base;
		
	}
	
	@Override
	public void calcularArea() {
		double area = this.altura * this.base;
		System.out.println(" A area do quadrado é de " + area);
	}

}
