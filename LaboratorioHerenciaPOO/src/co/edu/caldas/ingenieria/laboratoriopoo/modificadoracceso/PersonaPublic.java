package co.edu.caldas.ingenieria.laboratoriopoo.modificadoracceso;

public class PersonaPublic {

	public String nombre = "";

	public int edad ;

	public String numeroDocumento = "" ;

	public String direccion = "";	

	public PersonaPublic() {
		// TODO Auto-generated constructor stub
	}

	public PersonaPublic(String nombre, int edad, String numeroDocumento, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numeroDocumento = numeroDocumento;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
