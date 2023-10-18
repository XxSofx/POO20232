package co.edu.caldas.ingenieria.laboratoriopoo.herenciabasica;

public class Animal {

	private String especie;

	private String tamaño;

	private int edad;

	private String nombre;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String especie, String tamaño, int edad, String nombre) {
		super();
		this.especie = especie;
		this.tamaño = tamaño;
		this.edad = edad;
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void comer() {
		System.out.println("El animal esta comiendo");		
	}

	public void dormir() {
		System.out.println("El animal esta durmiendo");
	}

	public void mover() {
		System.out.println("El animal se esta moviendo");
	}
}
