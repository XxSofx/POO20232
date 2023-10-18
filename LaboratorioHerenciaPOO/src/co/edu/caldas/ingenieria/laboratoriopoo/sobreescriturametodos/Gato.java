package co.edu.caldas.ingenieria.laboratoriopoo.sobreescriturametodos;

public class Gato extends Animal{
	
	// Zona de constructores
	
		public Gato() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Gato(String especie, String tamaño, int edad, String nombre) {
			super(especie, tamaño, edad, nombre);
			// TODO Auto-generated constructor stub
		}

		//métodos que realiza el perro
		
		public void maullar() {
			System.out.println("El gato esta maullando");
		}

		@Override
		public void dormir() {
			System.out.println("El gato esta durmiendo");
		}

		@Override
		public void comer() {
			System.out.println("El gato esta comiendo");		
		}

		@Override
		public void mover () {
			System.out.println("El gato se esta moviendo");
		}
		
		@Override
		public void jugar () {
			System.out.println("El gato esta jugando");
		}

}
