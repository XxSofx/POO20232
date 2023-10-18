package co.edu.caldas.ingenieria.laboratoriopoo.encapsulamiento;

public class PersonaTest {

	public static void main(String[] args) {
		Persona persona = new Persona("Sofia", 23);

		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
	}
}
