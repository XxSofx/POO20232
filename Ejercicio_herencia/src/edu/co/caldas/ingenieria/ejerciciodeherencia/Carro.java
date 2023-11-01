package edu.co.caldas.ingenieria.ejerciciodeherencia;

public class Carro extends Vehiculo {

	private int cilindraje;
	private String modelo = "";
	private int velocidad = 0;

	public Carro() {

	}

	public Carro(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridos, int cilindraje, String modelo,
			int velocidad) {
		super(vehiculosCreados, kilometrosTotales, kilometrosRecorridos);
		this.cilindraje = cilindraje;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public void mover(int distancia) {
		super.mover(distancia);
	}

	@Override
	public void frenar(int velocidad) {
		this.velocidad -= velocidad;
		if (this.velocidad == 0) {
			System.out.println("El carro ha frenado");
		}
		super.calculoKilometros(velocidad);

	}

	@Override
	public void acelerar(int aumentoVelocidad) {
		this.velocidad += aumentoVelocidad;
		super.calculoKilometros(this.velocidad);
		System.out.println("El carro ha recorrido " + super.getKilometrosRecorridos() + " kilómetros");

	}

	@Override
	public void avanza(int velocidad) {
		
	}
}