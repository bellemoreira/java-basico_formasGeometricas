package isabelle.formas2d;

import isabelle.formasgeometricas.DimensaoSuperficial;
import isabelle.formasgeometricas.Figura2D;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	
	private double base;
	private double altura;
	

	public Triangulo(String nome, String cor, double base, double altura) {
		super(nome, cor);
		this.base = base;
		this.altura = altura;
		
	}

	
	public double calcularArea() {
	
		return base*altura/2;
	}
	
	public String toString() {
		return  "Nome: "+ getNome() + ". Cor: "+ getCor() + ". Area: "+calcularArea();
	}
}
