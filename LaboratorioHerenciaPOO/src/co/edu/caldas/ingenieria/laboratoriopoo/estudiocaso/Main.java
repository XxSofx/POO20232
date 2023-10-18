package co.edu.caldas.ingenieria.laboratoriopoo.estudiocaso;

public class Main {
	
    public static void main(String[] args) {
        Gerente miGerente = new Gerente("Sofia", "Gerente de Proyecto", 75000, "Desarrollo");
        Programador miProgramador = new Programador("Maria Fernanda", "Programador Senior", 60000, "Java");

        System.out.println(miGerente.getNombre() + " gana un salario de $" + miGerente.getSalario() + " al año.");
        miGerente.trabajar();
        miGerente.gestionar();

        System.out.println(miProgramador.getNombre() + " gana un salario de $" + miProgramador.getSalario() + " al año.");
        miProgramador.trabajar();
        miProgramador.programar();
    }

}
