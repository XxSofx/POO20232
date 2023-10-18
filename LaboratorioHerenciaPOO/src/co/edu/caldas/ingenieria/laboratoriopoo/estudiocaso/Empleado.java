package co.edu.caldas.ingenieria.laboratoriopoo.estudiocaso;

public class Empleado {

	private String nombre;

	private String cargo;

	private double salario;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String cargo, double salario) {
		super();
		this.nombre = nombre;
		this.cargo = cargo;
		this.salario = salario;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void trabajar() {
		System.out.println(nombre + " está trabajando en su puesto de " + cargo);
	}

	public double getSalario() {
		return salario;
	}
}
