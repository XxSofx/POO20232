package co.edu.caldas.ingenieria.laboratoriopoo.modificadoracceso;

public class PersonaPrivate {

	private String nombre = "";

	private int edad ;

	private String numeroDocumento = "" ;

	private String direccion = "";

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	private String getNumeroDocumento() {
		return numeroDocumento;
	}

	private void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}	

	public static void main(String[] args){
		/*
		 * Aunque este en private, estamos en la misma clase, esto hace
		 * que se pueda acceder a los metodos y atributos sin restriccion
		 * */
		PersonaPrivate p = new PersonaPrivate();
		p.setNombre("Sofia");
		System.out.println(p.getNombre());
		p.edad = (int) 23;
		System.out.println(p.edad);
	}

}
