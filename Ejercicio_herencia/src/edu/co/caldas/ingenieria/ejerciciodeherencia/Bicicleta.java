package edu.co.caldas.ingenieria.ejerciciodeherencia;

public class Bicicleta extends Vehiculo{

	private String marca = "";
	private String color = "";
	private int velocidad = 0;

	public Bicicleta() {

	}

	public Bicicleta(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridos, String marca,
			String color, int velocidad) {
		super(vehiculosCreados, kilometrosTotales, kilometrosRecorridos);
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
			System.out.println("La bicicleta ha frenado");
		}
		super.calculoKilometros(velocidad);
	}

	@Override
	public void avanza (int velocidad) {
		this.velocidad += velocidad;
		super.calculoKilometros(velocidad);
		System.out.println("La bicicleta ha recorrido" + super.getKilometrosRecorridos() + "Kilometros");
	}

	@Override
	public void acelerar(int aumentoVelocidad) {		
	}
	
	

}