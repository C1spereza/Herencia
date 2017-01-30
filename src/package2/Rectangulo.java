package package2;

public class Rectangulo extends Figura{
	private double altura;
	private double base;
	
	public Rectangulo(double b, double a){
		
		base = b;
		altura = a;
		numLados = 4;
		numFigura = numFigura + 1;
	}
	
	public double perimetro(){
		return (base+altura)*2;
	}
	
	public String toString(){
		return "Datos del Rectangulo:" + "\n" +
				"-----------------------------" + "\n" +
				"Base = " + base + "\n" +
				"Altura = " + altura + "\n" +
				"Perimetro = " + perimetro() + "\n" +
				"Numero de lados =" + numLados + "\n" +
				"-----------------------------" + "\n" + 
				"Figuras Totales = " + numFigura;
	}

}
