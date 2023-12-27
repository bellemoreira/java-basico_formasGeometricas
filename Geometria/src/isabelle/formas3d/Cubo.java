package isabelle.formas3d;


import isabelle.formas2d.Quadrado;
import isabelle.formasgeometricas.DimensaoVolumetrica;
import isabelle.formasgeometricas.Figura3D;

public class Cubo extends Figura3D implements DimensaoVolumetrica {

	private Quadrado quadrado;
	private double volume;
	private double areaTotal;
	
	public Cubo(String nome, String cor,double lado) {
		super(nome, cor);
		quadrado =  new Quadrado(nome, cor,lado);
	}

	
	public double calcularVolume() {
		 volume = Math.pow(quadrado.getLado(), 3);
		return volume;
	}
	
	public double calcularAreaTotal() {
		areaTotal = 6*Math.pow(quadrado.getLado(),2);
		return areaTotal; 
	}
	
	public String toString() {
		return  "Nome: "+ getNome() + " Cor: "+ getCor() + " Area Total: "+calcularAreaTotal() + " Volume: "+ calcularVolume();
	}

}
