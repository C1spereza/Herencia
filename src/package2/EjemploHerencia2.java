package package2;
import miLibreria.Entrada;
import package1.Cuadrado;
import package1.Triangulo;

public class EjemploHerencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada();
		Circumferencia circumferencia;
		Rectangulo rectangulo;
		
		System.out.println("Introduccion de los datos del rectangulo: ");
		rectangulo = new Rectangulo(entrada.obtenerFloat("Dame la base:"), entrada.obtenerFloat("Dame la altura:"));
		
		System.out.println("Introduccion de los datos de la circumferencia: ");
		circumferencia = new Circumferencia(entrada.obtenerFloat("Dame el radio:"));
		
		
		System.out.println(rectangulo.toString());
		System.out.println("");
		System.out.println(circumferencia.toString());

	}

}
