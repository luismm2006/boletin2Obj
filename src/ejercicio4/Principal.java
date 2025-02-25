package ejercicio4;

public class Principal {
	public static void main(String[] args) {
		 TarjetaCredito tarjeta = new TarjetaCredito(8, 2500);
	        tarjeta.mostrarInfo();

	        tarjeta.comprar(500);
	        tarjeta.comprar(2000);
	        tarjeta.comprar(500);
	        tarjeta.comprar(2000);
	        tarjeta.mostrarInfo();

	        tarjeta.saldarCuenta();
	        tarjeta.mostrarInfo();
	}
}
