package principal;

import java.util.Scanner;

import clases.Partida;

public class Principal {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Partida partida1=new Partida();
		System.out.println("¿Que clase quieres que sea tu personaje? (Mago, Guerrero, Arquero, Enano)");
		String clase=input.nextLine();
		System.out.println("¿Que nombre quieres darle?");
		String nombre=input.nextLine();
		partida1.crearPersonaje(nombre, clase);
		partida1.listarPersonajes();
		System.out.println("¿Que clase quieres que sea tu personaje? (Mago, Guerrero, Arquero, Enano)");
		clase=input.nextLine();
		System.out.println("¿Que nombre quieres darle?");
		nombre=input.nextLine();
		partida1.crearPersonaje(nombre, clase);
		partida1.listarPersonajes();
		partida1.eliminarPersonaje(nombre);
		partida1.listarPersonajes();
		
		input.close();
	}

}
