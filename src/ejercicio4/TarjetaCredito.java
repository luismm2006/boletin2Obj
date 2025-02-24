package ejercicio4;

public class TarjetaCredito {
	private int crediticidad;
	private double gasto;
	
	public TarjetaCredito(int crediticidad, double gasto) {
		super();
		if (crediticidad < 1 || crediticidad > 10) {
			System.out.println("No está dentro de los valores posibles, se asignará el tope de los valores posibles por defecto");
			this.crediticidad = 10;
		}else {
			this.crediticidad = crediticidad;
		}
		if (gasto > 2000 || gasto < 1) {
			System.out.println("No está dentro de los valores posibles, se asignará el tope de los valores posibles por defecto");
			this.gasto = 2000;
		}else {
			this.gasto = gasto;			
		}
	}

	public int getCrediticidad() {
		return crediticidad;
	}

	public double getGasto() {
		return gasto;
	}

	
	
}
