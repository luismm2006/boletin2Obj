package ejercicio1;

public class Circulo {
	private double radio;
	private static final double PI = 3.1416;
	public Circulo(double radio) {
		super();
		this.setRadio(radio);
	}
	public Circulo() {
		this.radio = 1;
	}

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		if (radio >= 0) {
			this.radio = radio;
		}else {
			this.radio = 1;
		}
		
	}
	public double calcularArea() {
		return PI * radio * radio;
	}
	public double calcularPerimetro() {
		return 2 * PI * radio;
	}
}
