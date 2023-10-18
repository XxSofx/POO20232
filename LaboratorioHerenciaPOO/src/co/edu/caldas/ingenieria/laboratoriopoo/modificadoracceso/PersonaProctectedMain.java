package co.edu.caldas.ingenieria.laboratoriopoo.modificadoracceso;


public class PersonaProctectedMain {

	public static void main(String[] args) {

		PersonaProtected personaProtected = new PersonaProtected();
		personaProtected.nombre = "Sofia";
		personaProtected.setEdad((int) 23);
		System.out.println(personaProtected.nombre);
		System.out.println(personaProtected.getEdad());
	}

}
