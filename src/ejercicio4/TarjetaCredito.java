package ejercicio4;

public class TarjetaCredito {
	private int crediticidad;
	private double gastoLimite;
	private double gastoAcumulado;
	
	public TarjetaCredito(int crediticidad, double gastoLimite) {
		super();
		if (crediticidad < 1 || crediticidad > 10) {
			System.out.println("No está dentro de los valores posibles, se asignará el tope de los valores posibles por defecto");
			this.crediticidad = 10;
		}else {
			this.crediticidad = crediticidad;
		}
		if (gastoLimite > 2000 || gastoLimite < 1) {
			System.out.println("No está dentro de los valores posibles, se asignará el tope de los valores posibles por defecto");
			this.gastoLimite = 2000;
		}else {
			this.gastoLimite = gastoLimite;			
		}
	}

	public int getCrediticidad() {
		return crediticidad;
	}

	public double getGastoLimite() {
		return gastoLimite;
	}

	public void comprar(double precio) {
		if (precio>=1) {
			gastoAcumulado += precio;
			if (gastoAcumulado>gastoLimite) {
				if (crediticidad>=1) {
					crediticidad --;
				}
				if (gastoLimite>=200) {
					gastoLimite -= 200;
				}else {
					gastoLimite = 0;
				}
				System.out.println("Has superado el limite!!");
			}
		}
        System.out.println("Compra realizada: " + precio + "€. Gasto total: " + gastoAcumulado + "€.");
        System.out.println("---------------------------------");

	}
	public void saldarCuenta() {
		gastoAcumulado = 0;
		System.out.println("Tu cuenta está saldada");
		System.out.println("---------------------------------");
	}
	public void mostrarInfo() {
		System.out.println("--- Información de la Tarjeta ---");
        System.out.println("Calificación Crediticia: " + crediticidad);
        System.out.println("Límite de Gasto: " + gastoLimite + "€");
        System.out.println("Gasto Acumulado: " + gastoAcumulado + "€");
        System.out.println("---------------------------------");
	}
}
