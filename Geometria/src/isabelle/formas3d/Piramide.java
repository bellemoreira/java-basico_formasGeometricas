package isabelle.formas3d;

import isabelle.formas2d.Quadrado;
import isabelle.formasgeometricas.DimensaoVolumetrica;
import isabelle.formasgeometricas.Figura3D;

public class Piramide extends Figura3D implements DimensaoVolumetrica {
	
	private double altura;
	private Quadrado quadrado;
	private double volume;
	private double areaTotal;
	

	public Piramide(String nome, String cor, double altura, double lado) {
		super(nome, cor);
		this.altura = altura;
		quadrado = new Quadrado(nome, cor, lado);
	}

	public double calcularVolume() {
		volume = (quadrado.calcularArea() + altura)/3;
		return volume;
	}
	
	public double calcularAreaTotal() {
		areaTotal = quadrado.calcularArea() + 2*quadrado.getLado()*
				( Math.sqrt(Math.pow(altura, 2)+ Math.pow(quadrado.getLado()/2, 2)) );
		return areaTotal; 
	}
	
	public String toString() {
		return  "Nome: "+ getNome() + " Cor: "+ getCor() + " Area Total: "+calcularAreaTotal() + " Volume: "+ calcularVolume();
	}
}
