package co.edu.caldas.ingenieria.laboratoriopoo.estudiocaso;

public class Gerente extends Empleado {

	private String area;

	public Gerente(String nombre, String cargo, double salario, String area) {
		super(nombre, cargo, salario);
		this.area = area;
	}

	public void gestionar() {
		System.out.println(getNombre() + " es un gerente del departamento de " + area);
	}

}
