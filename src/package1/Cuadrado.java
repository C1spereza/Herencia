package package1;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(double l){
		
		lado = l;
		//Variable global
		numFigura = numFigura+1;
		//Atributo de Figura
		numLados = 4;
	}
	
	public double area(){
		return lado*lado;
	}
	
	public String toString(){
		return "Valores del Cuadrado\n"+
				"------------------------"+ "\n" +
				"Lado = " + lado + "\n" + 
				"Area = " + area() + "\n" +
				"Numero de lados = " + numLados + "\n" +
				"-------------------------" + "\n" +
				"Figuras Totales = " + numFigura;
	}

}

