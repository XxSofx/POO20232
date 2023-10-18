package co.edu.caldas.ingenieria.laboratoriopoo.ejercicioherencia;

public class Cuenta {

	private double saldoActual;

	public Cuenta(double saldoInicial) {
		saldoActual = saldoInicial;
	}

	public void depositar(double cantidad) {
		if (cantidad > 0) {
			saldoActual += cantidad;
			System.out.println("Depósito de $" + cantidad + " realizado. Nuevo saldo: $" + saldoActual);
		} else {
			System.out.println("La cantidad de depósito debe ser mayor que 0.");
		}
	}

	public void retirar(double cantidad) {
		if (cantidad > 0 && cantidad <= saldoActual) {
			saldoActual -= cantidad;
			System.out.println("Retiro de $" + cantidad + " realizado. Nuevo saldo: $" + saldoActual);
		} else {
			System.out.println("No es posible realizar el retiro. Saldo insuficiente o cantidad no válida.");
		}
	}

	public double obtenerSaldo() {
		return saldoActual;
	}

	public void retiro(double cantidad) {
		// TODO Auto-generated method stub
		
	}

}
