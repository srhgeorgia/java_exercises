package exerciciosClasses;

public class Circulo extends FiguraGeometrica{
	  private double raio;

	    public Circulo(double raio) {
	        this.raio = raio;
	    }

	    double calcularArea() {
	        return Math.PI * raio * raio;
	    }
}
