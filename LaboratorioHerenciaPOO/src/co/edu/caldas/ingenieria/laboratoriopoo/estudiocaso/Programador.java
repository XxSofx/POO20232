package co.edu.caldas.ingenieria.laboratoriopoo.estudiocaso;

public class Programador extends Empleado{

	private String lenguaje;

	public Programador(String nombre, String cargo, double salario, String lenguaje) {
		super(nombre, cargo, salario);
		this.lenguaje = lenguaje;
	}

	public void programar() {
		System.out.println(getNombre() + " es un programador y está programando en " + lenguaje);
	}

}
