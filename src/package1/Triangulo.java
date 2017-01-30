package package1;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	
	public Triangulo(double b, double a){
		
		base = b;
		altura = a;
		//Variable global
		numFigura = numFigura+1;
		//Atributo de Figura
		numLados = 3;
	}
	
	public double area(){
		return base*altura/2;
	}
	
	public String toString(){
		return "Valores del Triangulo\n"+
				"------------------------"+ "\n" +
				"Base = " + base + "\n" + 
				"Altura = " + altura + "\n" +
				"Area = " + area() + "\n" +
				"Numero de lados = " + numLados + "\n" +
				"-------------------------" + "\n" +
				"Figuras Totales = " + numFigura;
	}

}
