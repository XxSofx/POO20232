package co.edu.caldas.ingenieria.laboratoriopoo.ejercicioherencia;

public class Limite extends Cuenta{

	private double limite; 

	public Limite(double saldoInicial) {
		super(saldoInicial);
		ajustarLimite();
	}

	public void ajustarLimite() {
		limite = obtenerSaldo() / 2;
		System.out.println("Nuevo límite ajustado: $" + limite);
	}

	@Override
	public void retiro(double cantidad) {
		if (cantidad > 0 && cantidad <= obtenerSaldo() && cantidad <= limite) {
			super.retiro(cantidad);
		} else {
			System.out.println("No es posible realizar el retiro. Saldo insuficiente, cantidad no válida o excede el límite.");
		}
	}
}




