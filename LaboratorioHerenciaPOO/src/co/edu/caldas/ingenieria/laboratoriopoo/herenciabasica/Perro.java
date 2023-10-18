package co.edu.caldas.ingenieria.laboratoriopoo.herenciabasica;

public class Perro extends Animal  {
	
	//Zona de constructores
	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String especie, String tamaño, int edad, String nombre) {
		super(especie, tamaño, edad, nombre);
		// TODO Auto-generated constructor stub
	}
	
	//métodos que realiza el perro
	
	public void ladrar() {
		System.out.println("El perro ladro");
	}
	
	
	public void dormir() {
		System.out.println("El gato esta durmiendo");
	}
	
	
	public void comer() {
		System.out.println("El gato esta comiendo");		
	}

	
	public void mover () {
		System.out.println("El animal se esta moviendo");
	}

}
