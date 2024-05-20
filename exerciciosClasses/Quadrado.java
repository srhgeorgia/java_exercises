package exerciciosClasses;

public class Quadrado extends FiguraGeometrica{
	 private double lado;

	    public Quadrado(double lado) {
	        this.lado = lado;
	    }

	    double calcularArea() {
	        return lado * lado;
	    }
}
