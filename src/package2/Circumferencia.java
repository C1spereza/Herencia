package package2;

public class Circumferencia extends Figura{
	private double radio;
	private static double pi=3.14;
	
	public Circumferencia(double r){
		
		radio = r;
		
		numLados = 0;
		
		longitudLado = 0;
		
		numFigura = numFigura + 1;
	}
	
	public double perimetro(){
		return pi*radio*2;
	}
	
	public String toString(){
		return "Datos de la Circumferencia:" + "\n" +
				"-----------------------------" + "\n" +
				"Radio = " + radio + "\n" +
				"Perimetro = " + perimetro() + "\n" +
				"Numero de lados =" + numLados + "\n" +
				"Longitud del lado = " + longitudLado + "\n" +
				"-----------------------------" + "\n" + 
				"Figuras Totales = " + numFigura;
	}

}
