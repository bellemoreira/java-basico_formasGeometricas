package isabelle.formas2d;

import isabelle.formasgeometricas.DimensaoSuperficial;
import isabelle.formasgeometricas.Figura2D;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	
	private double lado;
	
	public Quadrado(String nome, String cor,double lado) {
		super(nome, cor);
		
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	
	public String toString() {
		return  "Nome: "+ getNome() + ". Cor: "+ getCor() + ". Area: "+calcularArea();
	}

}
