package edu.co.caldas.ingenieria.ejerciciodeherencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Vehiculo carro = new Carro();
		Vehiculo bicicleta = new Bicicleta();

		Scanner in = new Scanner(System.in);

		int opcion;

		do {
			System.out.println("Vehiculos");
			System.out.println("======");
			System.out.println("1. Andar en bicicleta");
			System.out.println("2. Picar con la bicicleta");
			System.out.println("3. Andar con el carro");
			System.out.println("4. Quemar llantas con el carro");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del carro");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.print("Elige una opción (1-8): ");
			opcion = in.nextInt();

			switch (opcion) {
			case 1:
				bicicleta.avanza(10);
				break;
			case 2:
				System.out.println("Hemos picado en la bicicleta");
				break;
			case 3:
				carro.acelerar(10);
				break;
			case 4:
				System.out.println("Upsss, hemos quemado la llanta del carro");
				break;
			case 5:
				System.out.println("Los kilómetros recorridos por la bicicleta son: " + bicicleta.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println("Los kilómetros recorridos por el carro son: " + carro.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println("Los kilómetros totales recorridos por el vehículo son: " + Vehiculo.getKilometrosTotales());
				break;
			case 8:
				System.out.println("¡Vuelve pronto!");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (opcion != 8);

		in.close();
	}
}
