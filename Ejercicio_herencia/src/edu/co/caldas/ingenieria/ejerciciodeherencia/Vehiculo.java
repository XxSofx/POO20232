package edu.co.caldas.ingenieria.ejerciciodeherencia;

public abstract class Vehiculo {
	private int vehiculosCreados = 0;
	private static int kilometrosTotales = 0;
	private int kilometrosRecorridos;

	public Vehiculo() {

	}

	public Vehiculo(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridos) {
		this.vehiculosCreados = vehiculosCreados;
		this.kilometrosTotales = kilometrosTotales;
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public void mover(int distancia) {
		kilometrosRecorridos += distancia;
		kilometrosTotales += distancia;
	}

	public abstract void avanza(int velocidad);

	public abstract void frenar(int velocidad);

	public abstract void acelerar(int aumentoVelocidad);

	public void calculoKilometros(int velocidad) {
		int distancia = velocidad * 10;
		setKilometrosRecorridos(getKilometrosRecorridos() + distancia);
	}

	public int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public void setVehiculosCreados(int vehiculosCreados) {
		this.vehiculosCreados = vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public void setKilometrosTotales(int kilometrosTotales) {
		this.kilometrosTotales = kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

}