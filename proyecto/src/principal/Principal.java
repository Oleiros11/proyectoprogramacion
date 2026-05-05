package principal;

import java.util.Scanner;

import clases.Guerrero;
import clases.Mago;
import clases.Partida;

public class Principal {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Partida partida1=new Partida();
		String nombre;
		String clase;
		partida1.crearPersonaje("Gandalf", "Mago");
		partida1.crearPersonaje("Aragorn", "Guerrero");
		partida1.crearPersonaje("Gimli", "Enano");
		partida1.crearPersonaje("Legolas", "Arquero");
		int numero=0;
		do {
		System.out.println("¿Que quieres hacer?");
		System.out.println("1.- Jugar");
		System.out.println("2.- Crear personaje");
		System.out.println("3.- Ver personajes");
		System.out.println("4.- Borrar personajes");
		
		numero=input.nextInt();
		switch (numero){
			case 1:
			input.nextLine();
			System.out.println("¿Con que clase quieres jugar?");
		
		clase=input.nextLine();
		if(clase.equalsIgnoreCase("Mago")) {
			System.out.println("¿Que personaje quieres usar?");
			partida1.listarPorClase(clase);
			nombre=input.nextLine();
			Mago enUso=new Mago();
			enUso=partida1.elegirMago(nombre);
			System.out.println("¡Personaje elegido!");
			
		} else if (clase.equalsIgnoreCase("Guerrero")) {
			System.out.println("¿Que personaje quieres usar?");
			partida1.listarPorClase(clase);
			nombre=input.nextLine();
			Guerrero enUso=new Guerrero();
			partida1.elegirGuerrero(nombre);
			System.out.println("¡Personaje elegido!");
		} else if(clase.equalsIgnoreCase("Enano")) {
			System.out.println("¿Que personaje quieres usar?");
			partida1.listarPorClase(clase);
			nombre=input.nextLine();
			partida1.elegirEnano(nombre);
			System.out.println("¡Personaje elegido!");
		} else if(clase.equalsIgnoreCase("Arquero")) {
			System.out.println("¿Que personaje quieres usar?");
			partida1.listarPorClase(clase);
			nombre=input.nextLine();
			partida1.elegirArquero(nombre);
			System.out.println("¡Personaje elegido!");
		} else {
			System.out.println("No existe esa clase");
		} 
		break;
		
			
			case 2:
			input.nextLine();
		System.out.println("¿Que clase quieres que tenga tu personaje?");
		clase=input.nextLine();
		System.out.println("¿Que nombre quieres ponerle al personaje?");
		nombre=input.nextLine();
		partida1.crearPersonaje(nombre, clase);
		break;
		
		
		
			case 3:
		System.out.println("¿Que quieres hacer?");
		System.out.println("1.- Ver todos los personajes");
		System.out.println("2.- Ver personaje por clase");
		System.out.println("3.- Buscar personaje");
		numero=input.nextInt();
		
		break;
		
			case 4:
		input.nextLine();
		System.out.println("¿Que personaje quieres eliminar?");
		partida1.listarPersonajes();
		nombre=input.nextLine();
		partida1.eliminarPersonaje(nombre);
		System.out.println("Personaje eliminado");
		break;
		
		
		
			
		
		
			
		
			
			
		
			
			
			
			
		
		
		
		
		
		
		
		}
		} while (numero!=20);
		input.close();
	}

}
