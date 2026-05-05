package principal;

import java.util.Scanner;

import clases.Partida;

public class Principal {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Partida partida1=new Partida();
		partida1.crearPersonaje("Gandalf", "Mago");
		partida1.crearPersonaje("Aragorn", "Guerrero");
		partida1.crearPersonaje("Gimli", "Enano");
		partida1.crearPersonaje("Legolas", "Arquero");
		partida1.listarPersonajes();
		System.out.println("¿Que personaje quieres elegir?");
		String nombre=input.nextLine();
		
		input.close();
	}

}
