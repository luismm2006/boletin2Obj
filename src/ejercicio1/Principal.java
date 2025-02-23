package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(30);
		System.out.println(circulo.calcularArea());
		System.out.println(circulo.calcularPerimetro());

		Circulo circulo2 = new Circulo();
		System.out.println(circulo2.calcularArea());
		System.out.println(circulo2.calcularPerimetro());
		
		Circulo circulo3 = new Circulo(-4);
		System.out.println(circulo3.calcularArea());
		System.out.println(circulo3.calcularPerimetro());
	}
}
