package isabelle.formas2d;

import isabelle.formasgeometricas.Constantes;
import isabelle.formasgeometricas.DimensaoSuperficial;
import isabelle.formasgeometricas.Figura2D;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	
	private double raio;
	

	public Circulo(String nome, String cor, double raio) {
		super(nome, cor);
		this.raio = raio;
	}	
	
	
	public double calcularArea() {
		 
		return raio*Constantes.PI;
	}
	
	public String toString() {
		return  "Nome: "+ getNome() + ". Cor: "+ getCor() + ". Area: "+calcularArea();
	}

	
}
