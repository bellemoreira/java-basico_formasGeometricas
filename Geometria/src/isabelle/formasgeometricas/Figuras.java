package isabelle.formasgeometricas;

import java.util.ArrayList;

import isabelle.formas2d.Circulo;
import isabelle.formas2d.Quadrado;
import isabelle.formas2d.Triangulo;
import isabelle.formas3d.Cilindro;
import isabelle.formas3d.Cubo;
import isabelle.formas3d.Piramide;


public class Figuras {

	
	public static void main(String[]args) {
		
		

		Circulo circulo =  new Circulo("circulo", "verde",5.4);                   // raio
		Quadrado quadrado =  new Quadrado("quadrado","azul",4.0);               // lado
		Triangulo triangulo =  new Triangulo("triangulo","rosa",2.0,3.0);       // base e altura
		Piramide piramide =  new Piramide("piramide","preto",2.0,3.0);          // altura e lado
		Cubo cubo =  new Cubo("cubo","vermelho",3.0);                         // lado
		Cilindro cilindro =  new Cilindro("cilindro","amarelo",2.0,3.0);        // altura e raio
		
		
        ArrayList<FiguraGeometrica> figuras =  new ArrayList<FiguraGeometrica>();	
		
		figuras.add((FiguraGeometrica)circulo);
		figuras.add((FiguraGeometrica)quadrado);
		figuras.add((FiguraGeometrica)triangulo);
		figuras.add((FiguraGeometrica)cubo);
		figuras.add((FiguraGeometrica)cilindro);
		figuras.add((FiguraGeometrica)piramide);
	
		for(FiguraGeometrica figura: figuras) {
			
		  System.out.println(figura.toString());}
	}
	
		
	
}

