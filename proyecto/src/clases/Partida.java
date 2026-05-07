package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Partida {
	ArrayList<Personaje> listaPersonajes=new ArrayList<>();
	ArrayList<Mago> listaMagos=new ArrayList<>();
	ArrayList<Guerrero> listaGuerreros=new ArrayList<>();
	ArrayList<Enano> listaEnanos=new ArrayList<>();
	ArrayList<Arquero> listaArqueros=new ArrayList<>();
	
	
	
	public Partida() {
		super();
	}

	
		public void crearPersonaje(String nombre, String clase) {
			if(clase.equals("Guerrero")) {
				Guerrero guerrero=new Guerrero(nombre,clase);
				listaPersonajes.add(guerrero);
				listaGuerreros.add(guerrero);
			} else if(clase.equalsIgnoreCase("Mago")) {
				Mago mago=new Mago(nombre,clase);
				listaPersonajes.add(mago);
				listaMagos.add(mago);
			} else if(clase.equalsIgnoreCase("Arquero")) {
				Arquero arquero=new Arquero(nombre,clase);
				listaPersonajes.add(arquero);
				listaArqueros.add(arquero);
			} else if(clase.equalsIgnoreCase("Enano")) {
				Enano enano=new Enano(nombre,clase);
				listaPersonajes.add(enano);
				listaEnanos.add(enano);
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
		
	//metodos para buscar y ver informacion
	
	public void listarPersonajes() {
		for (Personaje personaje:listaPersonajes) {
			System.out.println(personaje.toString());
		}
	}
	public void listarPorClase(String clase) {
		for (Personaje personaje:listaPersonajes) {
			if(personaje.getClase().equalsIgnoreCase(clase)) {
				System.out.println(personaje.toString());
			}
			
		}
	
	}
	public void buscarPersonaje(String nombre) {
		for(Personaje personaje:listaPersonajes) {
			if(personaje.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(personaje);
			}
		}
	}
	public void verNivel(Personaje enUso) {
		System.out.println("Eres nivel "+enUso.nivel);
		System.out.println("Te faltan "+enUso.expNecesaria+" puantos para subir al siguiente nivel");
	}	
	//metodo para saber cuanto dinero tienes
	
	public void verOro(String nombre) {
		for (Personaje personaje:listaPersonajes) {
			if(personaje.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Tu oro: "+personaje.getDinero());
			}
		}
	}
	
	
	//metodos para subir el nivel a los personajes
	// dependiendo de la clase
	public void subirMago(Mago mago, Hechizo hechizo) {
		mago.setNivel(+1);
		mago.setVida(+10);
		mago.setMana(+20);
		mago.setFuerza(+2);
		mago.setDefensa(+1);
		if(mago.getNivel()==2) {
			mago.setExpNecesaria(300);
		} else if (mago.getNivel()==3) {
			mago.setExpNecesaria(350);
		} else if(mago.getNivel()==4) {
			mago.setExpNecesaria(400);
		} else if(mago.getNivel()==5) {
			mago.setExpNecesaria(450);
		}
		if(mago.getNivel()==3) {
			mago.setHechizo(hechizo);
			System.out.println("Has aprendido el hechizo Bola de Fuego");
			System.out.println("Cuesta X de mana y hace X de daño al objetivo");
		}
	}
	public void subirGuerrero(Guerrero guerrero, Habilidad habilidad) {
		guerrero.setNivel(+1);
		guerrero.setVida(+10);
		guerrero.setMana(+20);
		guerrero.setFuerza(+2);
		guerrero.setDefensa(+1);
		if(guerrero.getNivel()==2) {
			guerrero.setExpNecesaria(300);
		} else if (guerrero.getNivel()==3) {
			guerrero.setExpNecesaria(350);
		} else if(guerrero.getNivel()==4) {
			guerrero.setExpNecesaria(400);
		} else if(guerrero.getNivel()==5) {
			guerrero.setExpNecesaria(450);
		}
		if(guerrero.getNivel()==3) {
			guerrero.setHabilidad(habilidad);
			System.out.println("Has aprendido la habilidad FURIA");
			System.out.println("Descarga una sucesion de golpes la cual cuesta X de mana y hace X de daño total");
		}
	}
	public void subirEnano(Enano enano, Habilidad habilidad) {
		enano.setNivel(+1);
		enano.setVida(+10);
		enano.setMana(+20);
		enano.setFuerza(+2);
		enano.setDefensa(+1);
		if(enano.getNivel()==2) {
			enano.setExpNecesaria(300);
		} else if (enano.getNivel()==3) {
			enano.setExpNecesaria(350);
		} else if(enano.getNivel()==4) {
			enano.setExpNecesaria(400);
		} else if(enano.getNivel()==5) {
			enano.setExpNecesaria(450);
		}
		if(enano.getNivel()==3) {
			enano.setHabilidad(habilidad);
			System.out.println("Has aprendido al habilidad Lanzamiento de Hacha");
			System.out.println("Lanzas tu hacha al enemigo para infringirle severos daños. Cuesta X de mana y hace X de daño");
			System.out.println("Acuerdate de recogerla despues");
		}
	}
	public void subirArquero(Arquero arquero, Habilidad habilidad) {
		arquero.setNivel(+1);
		arquero.setVida(+10);
		arquero.setMana(+20);
		arquero.setFuerza(+2);
		arquero.setDefensa(+1);
		if(arquero.getNivel()==2) {
			arquero.setExpNecesaria(300);
		} else if (arquero.getNivel()==3) {
			arquero.setExpNecesaria(350);
		} else if(arquero.getNivel()==4) {
			arquero.setExpNecesaria(400);
		} else if(arquero.getNivel()==5) {
			arquero.setExpNecesaria(450);
		}
		if(arquero.getNivel()==3) {
			arquero.setHabilidad(habilidad);
			System.out.println("Has aprendido la habilidad Disparo Precios");
			System.out.println("Agudizas tus sentidos para poder dar en un punto vital, haciendo gran daño. Cuesta X de mana y hace X de daño");
		}
	}
	
	//metodos para elegir personaje por clase y nombre
	//este personaje será el que se use en la partida
	public Mago elegirMago(String nombre, BastonMago baston1) {
		Mago mago=new Mago();
		for(Mago e:listaMagos) {
			if(e.getNombre().equalsIgnoreCase(nombre)) {
				mago.setNombre(nombre);
				mago.setClase("Mago");
				mago.setVidaMax(e.getVidaMax());
				mago.setVida(e.getVida());
				mago.setFuerza(e.getFuerza());
				mago.setDefensa(e.getDefensa());
				mago.setMana(e.getMana());
				mago.setArma(baston1);
				return mago;
			}
			
		}
		return null;
	}
	public Guerrero elegirGuerrero (String nombre,EspadaGuerrero espada1) {
		Guerrero guerrero=new Guerrero();
		for(Guerrero e:listaGuerreros) {
			if(e.getNombre().equalsIgnoreCase(nombre)) {
				guerrero.setNombre(nombre);
				guerrero.setClase("Mago");
				guerrero.setVidaMax(e.getVidaMax());
				guerrero.setVida(e.getVida());
				guerrero.setFuerza(e.getFuerza());
				guerrero.setDefensa(e.getDefensa());
				guerrero.setMana(e.getMana());
				guerrero.setArma(espada1);
				return guerrero;
			}
			
		}
		return null;
	}
	public Enano elegirEnano (String nombre, HachaEnano hacha1) {
		Enano enano=new Enano();
		for(Enano e:listaEnanos) {
			if(e.getNombre().equalsIgnoreCase(nombre)) {
				enano.setNombre(nombre);
				enano.setClase("Mago");
				enano.setVidaMax(e.getVidaMax());
				enano.setVida(e.getVida());
				enano.setFuerza(e.getFuerza());
				enano.setDefensa(e.getDefensa());
				enano.setMana(e.getMana());
				enano.setArma(hacha1);
				return enano;
			}
			
		}
		return null;
	}
	
	public Arquero elegirArquero (String nombre, Arco arco1) {
		Arquero arquero=new Arquero();
		for(Arquero e:listaArqueros) {
			if(e.getNombre().equalsIgnoreCase(nombre)) {
				arquero.setNombre(nombre);
				arquero.setClase("Mago");
				arquero.setVidaMax(e.getVidaMax());
				arquero.setVida(e.getVida());
				arquero.setFuerza(e.getFuerza());
				arquero.setDefensa(e.getDefensa());
				arquero.setMana(e.getMana());
				arquero.setArma(arco1);
				return arquero;
			}
			
		}
		return null;
	}

}
