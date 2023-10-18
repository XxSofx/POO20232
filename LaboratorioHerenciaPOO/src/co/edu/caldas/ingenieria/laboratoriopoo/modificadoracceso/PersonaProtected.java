package co.edu.caldas.ingenieria.laboratoriopoo.modificadoracceso;

public class PersonaProtected {

	protected String nombre = "";

	protected int edad ;

	protected String numeroDocumento = "" ;

	protected String direccion = "";

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected String getNumeroDocumento() {
		return numeroDocumento;
	}

	protected void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
