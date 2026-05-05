package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Partida {
	ArrayList<Personaje> listaPersonajes=new ArrayList<>();
	
	public Partida() {
		super();
	}

	
		public void crearPersonaje(String nombre, String clase) {
			if(clase.equals("Guerrero")) {
				Guerrero guerrero=new Guerrero(nombre,clase);
				listaPersonajes.add(guerrero);
			} else if(clase.equalsIgnoreCase("Mago")) {
				Mago mago=new Mago(nombre,clase);
				listaPersonajes.add(mago);
			} else if(clase.equalsIgnoreCase("Arquero")) {
				Arquero arquero=new Arquero(nombre,clase);
				listaPersonajes.add(arquero);
			} else if(clase.equalsIgnoreCase("Enano")) {
				Enano enano=new Enano(nombre,clase);
				listaPersonajes.add(enano);
			} else {
				System.out.println("No existe esa clase");
			}
			
		}
		public void eliminarPersonaje(String nombre) {
			Iterator<Personaje> iterador=listaPersonajes.iterator();
			while (iterador.hasNext()) {
				Personaje personaje=iterador.next();
				if(personaje.getNombre().equalsIgnoreCase(nombre)) {
					iterador.remove();
				}
			}
		}
		
	
	public void listarPersonajes() {
		for (Personaje personaje:listaPersonajes) {
			System.out.println(personaje.toString());
		}
	}

	
	//metodos para subir el nivel de los personajes
	public void subirMago(Mago mago) {
		mago.setNivel(+1);
		mago.setVida(+10);
		mago.setMana(+20);
		mago.setFuerza(+2);
		mago.setDefensa(+1);
	}
	public void subirGuerrero(Guerrero guerrero) {
		guerrero.setNivel(+1);
		guerrero.setVida(+10);
		guerrero.setMana(+20);
		guerrero.setFuerza(+2);
		guerrero.setDefensa(+1);
	}
	public void subirEnano(Enano enano) {
		enano.setNivel(+1);
		enano.setVida(+10);
		enano.setMana(+20);
		enano.setFuerza(+2);
		enano.setDefensa(+1);
	}
	public void subirArquero(Arquero arquero) {
		arquero.setNivel(+1);
		arquero.setVida(+10);
		arquero.setMana(+20);
		arquero.setFuerza(+2);
		arquero.setDefensa(+1);
	}
	
	public Personaje elegirPersonaje(String nombre) {
		for (Personaje personaje:listaPersonajes) {
			if(personaje.getNombre().equalsIgnoreCase(nombre)) {
				return personaje;
			}
		}
		return null;
	}
}
