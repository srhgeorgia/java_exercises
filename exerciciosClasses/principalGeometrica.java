package exerciciosClasses;

public class principalGeometrica {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(5);
		Quadrado quadrado = new Quadrado(4);
		Triangulo triangulo = new Triangulo(3, 6);

		System.out.println("Área do círculo: " + circulo.calcularArea());
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		System.out.println("Área do triângulo: " + triangulo.calcularArea());
	}
}
