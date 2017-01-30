package package2;

public class Figura {
	//Cantidad de figuras creadas
	protected static int numFigura;
	
	//Cantidad de lados de la figura
	protected int numLados;
	
	protected double longitudLado;
	
	public double perimetro(){
		return numLados*longitudLado;
	}

}
