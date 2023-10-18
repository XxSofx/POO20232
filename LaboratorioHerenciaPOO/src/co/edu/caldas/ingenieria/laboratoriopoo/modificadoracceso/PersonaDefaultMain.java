package co.edu.caldas.ingenieria.laboratoriopoo.modificadoracceso;

public class PersonaDefaultMain {

	public static void main(String[] args) {
		PersonaDefault personDefault = new PersonaDefault();
		personDefault.nombre = "Sofia";
		personDefault.setEdad((int) 23);
		System.out.println(personDefault.nombre);
		System.out.println(personDefault.getEdad());
	}

}
