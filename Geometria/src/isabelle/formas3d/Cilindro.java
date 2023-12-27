package isabelle.formas3d;

import isabelle.formas2d.Circulo;
import isabelle.formasgeometricas.Constantes;
import isabelle.formasgeometricas.DimensaoVolumetrica;
import isabelle.formasgeometricas.Figura3D;

public class Cilindro extends Figura3D implements DimensaoVolumetrica {

	private double altura;
	private Circulo circulo;
	private double raio;
	private double volume;
	private double areaTotal;
	
	
	
	public Cilindro(String nome, String cor,double altura, double raio) {
		super(nome, cor);
		this.altura = altura;
		circulo = new Circulo(nome, cor, raio);
		this.raio= raio;
		
	}
	
	public double calcularVolume() {
		volume = circulo.calcularArea()*altura;
		return volume;
	}
	
	public double calcularAreaTotal() {
		areaTotal = 2*Constantes.PI*raio*altura + 2*circulo.calcularArea();
		return areaTotal; 
	}
	
	public String toString() {
		return  "Nome: "+ getNome() + " Cor: "+ getCor() + " Area Total: "+calcularAreaTotal() + " Volume: "+ calcularVolume();
	}
	
}
