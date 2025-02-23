package ejercicio2;

public class Principal {
	public static void main(String[] args) {
        Triangulo[] triangulos = new Triangulo[10];

        triangulos[0] = new Triangulo(new double[] {3.0, 3.0, 3.0}); // Triángulo equilátero
        triangulos[1] = new Triangulo(new double[] {4.0, 4.0, 6.0}); // Triángulo isósceles
        triangulos[2] = new Triangulo(new double[] {5.0, 6.0, 7.0}); // Triángulo escaleno
        triangulos[3] = new Triangulo(new double[] {5.0, 12.0, 13.0}); // Triángulo rectángulo
        triangulos[4] = new Triangulo(new double[] {6.0, 6.0, 10.0}); // Triángulo isósceles
        triangulos[5] = new Triangulo(new double[] {1.0, 1.0, 1.0}); // Triángulo equilátero
        triangulos[6] = new Triangulo(new double[] {7.0, 24.0, 25.0}); // Triángulo rectángulo
        triangulos[7] = new Triangulo(new double[] {10.0, 10.0, 15.0}); // Triángulo isósceles
        triangulos[8] = new Triangulo(new double[] {8.0, 15.0, 17.0}); // Triángulo rectángulo
        triangulos[9] = new Triangulo(new double[] {6.0, 8.0, 10.0}); // Triángulo rectángulo

        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i] != null) { 
                System.out.println("Triángulo " + (i + 1) + ":");
                double[] lados = triangulos[i].getLongitudLado();
                System.out.println("Lados: " + lados[0] + ", " + lados[1] + ", " + lados[2]);
                System.out.println("Clasificación: " + triangulos[i].tipoTriangulo());
                System.out.println("Perímetro: " + triangulos[i].calcularPerimetro());
                System.out.println("Área: " + triangulos[i].calcularArea());
                System.out.println();
            }
        }
    }
}
