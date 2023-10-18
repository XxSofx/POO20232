package co.edu.caldas.ingenieria.laboratoriopoo.ejercicioherencia;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1000);
		Limite cuentaConLimite = new Limite(2000000);

		cuenta.depositar(500);
		cuenta.retiro(300);
		System.out.println("Saldo de cuenta: $" + cuenta.obtenerSaldo());

		cuentaConLimite.depositar(800000);
		cuentaConLimite.retiro(1000000);
		cuentaConLimite.ajustarLimite();
		cuentaConLimite.retiro(70000);
		System.out.println("Saldo de cuenta con límite: $" + cuentaConLimite.obtenerSaldo());
	}

}
