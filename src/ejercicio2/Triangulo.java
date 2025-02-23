package ejercicio2;

public class Triangulo {
	private double longitudLado [];

	public Triangulo(double[] longitudLado) {
		super();
		this.setLongitudLado(longitudLado);
	}
	
	public Triangulo() {
		this.longitudLado = new double [] {1.0,1.0,1.0};
	}

	public double[] getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double[] longitudLado) {
		if (longitudLado != null && longitudLado.length == 3 && longitudLado[0] > 0 && longitudLado[1] > 0 && longitudLado[2] > 0) {
			this.longitudLado = longitudLado;
		}else {
			this.longitudLado = new double[] {1.0,1.0,1.0};
		}
	}
	public double calcularArea() {
		double s = (longitudLado[0]+longitudLado[1]+longitudLado[2])/2;
		return Math.sqrt(s * (s-longitudLado[0]) * (s-longitudLado[1]) * (s-longitudLado[2]));
	}
	public double calcularPerimetro() {
		return longitudLado[0]+longitudLado[1]+longitudLado[2];
	}
	public String tipoTriangulo() {
		String resultado = "";
		if (longitudLado[0] == longitudLado[1] && longitudLado[1] == longitudLado[2]) {
			resultado = "Es equilatero";
		}else if (longitudLado[0] == longitudLado[1] || longitudLado[1] == longitudLado[2] || longitudLado[0] == longitudLado[2]) {
			resultado = "Es isóceles";
		}else {
			resultado = "Es escaleno";
		}
		return resultado;
	}
}
