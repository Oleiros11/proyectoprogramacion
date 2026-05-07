package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
	public void estadisticasMago(Mago mago) {
		System.out.println("Tu vida maxima es de "+mago.getVidaMax());
		System.out.println("Tu mana es de "+mago.getMana());
		System.out.println("Tu fuerza es de "+mago.getFuerza());
		System.out.println("Tu defensa es de "+mago.getDefensa());
		System.out.println("Eres nivel "+mago.getNivel()+" ahora");
	}
	public void estadisticasGuerrero(Guerrero guerrero) {
		System.out.println("Tu vida maxima es de "+guerrero.getVidaMax());
		System.out.println("Tu mana es de "+guerrero.getMana());
		System.out.println("Tu fuerza es de "+guerrero.getFuerza());
		System.out.println("Tu defensa es de "+guerrero.getDefensa());
		System.out.println("Eres nivel "+guerrero.getNivel()+" ahora");
	}
	public void estadisticasArquero(Arquero arquero) {
		System.out.println("Tu vida maxima es de "+arquero.getVidaMax());
		System.out.println("Tu mana es de "+arquero.getMana());
		System.out.println("Tu fuerza es de "+arquero.getFuerza());
		System.out.println("Tu defensa es de "+arquero.getDefensa());
		System.out.println("Eres nivel "+arquero.getNivel()+" ahora");
	}
	public void estadisticasEnano(Enano enano) {
		System.out.println("Tu vida maxima es de "+enano.getVidaMax());
		System.out.println("Tu mana es de "+enano.getMana());
		System.out.println("Tu fuerza es de "+enano.getFuerza());
		System.out.println("Tu defensa es de "+enano.getDefensa());
		System.out.println("Eres nivel "+enano.getNivel()+" ahora");
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
			System.out.println("Cuesta "+hechizo.getCostaMana()+" de mana y hace "+hechizo.getDamage()+" de daño al objetivo");
		}
		estadisticasMago(mago);
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
			System.out.println("Descarga una sucesion de golpes la cual cuesta "+habilidad.getCosteMana()+" de mana y hace "+
			habilidad.getDamage()+" daño total");
		}
		estadisticasGuerrero(guerrero);
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
			System.out.println("Lanzas tu hacha al enemigo para infringirle severos daños. Cuesta "+habilidad.getCosteMana()+" de mana"
					+ " y hace "+habilidad.getDamage()+" de daño");
			System.out.println("Acuerdate de recogerla despues");
		}
		estadisticasEnano(enano);
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
			System.out.println("Agudizas tus sentidos para poder dar en un punto vital, "
					+ "haciendo gran daño. Cuesta "+habilidad.getCosteMana()+" de mana y hace "+habilidad.getDamage()+" de daño");
			
		}
		estadisticasArquero(arquero);
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
	
	//metodo para el sistema de combate
	public void JuegoMago(Mago enUso,  Scanner input, Hechizo bola) {
		int rondas=0;
		int idEnemigo=0;
		int opcion=0;
		int damage=0;
		boolean estatusPartida=true;
		if(estatusPartida=true) {
		if(enUso.getNivel()==1) {
			idEnemigo=(int)(Math.random() * 10) + 1;
			if(idEnemigo>=1 && idEnemigo>=7) {
				Goblin goblin=new Goblin("Goblin","Goblin");
				System.out.println("¡Ha aparecido un Goblin enemigo!");
				do {
					System.out.println("¿Que quieres hacer?");
					System.out.println("1.- Atacar");
					System.out.println("2.- Habilidades");
					System.out.println("3.- Estatus");
					opcion=input.nextInt();
					if(opcion==1) {
						damage=((int)(Math.random() * enUso.getArma().getAtaque())+1)+enUso.getFuerza()-goblin.getDefensa();
						if(damage>0) {
							goblin.setVida(goblin.getVida()-damage);
							System.out.println("Atacas al Goblin");
							System.out.println("Haces "+damage+" de daño");
						}
						if(goblin.getVida()<=0) {
							System.out.println("El goblin enemigo ha muerto");
							System.out.println("Has conseguido "+goblin.getExpDada()+" puntos de experiencia y"
									+ goblin.oroDado+" de oro");
							enUso.setDinero(enUso.getDinero()+goblin.getOroDado());
							enUso.setExpNecesaria(enUso.getExpNecesaria()-goblin.getExpDada());
							if(enUso.getExpNecesaria()<=0) {
								System.out.println("¡¡Enhorabuena!! Has subido de nivel");
								subirMago(enUso,bola);
							}
						}
						else {
							System.out.println("El Goblin ataca de vuelta");
							damage=((int)(Math.random() * goblin.getAtaque())+1)+goblin.getFuerza()-enUso.getDefensa();
							if(damage>0) {
								enUso.setVida(enUso.getVida()-damage);
								System.out.println("El Goblin hace "+damage+" de daño");
								if(enUso.getVida()>0) {
									System.out.println("Te queda "+enUso.getVida()+" de vida");
								} else {
									System.out.println("¡Has muerto! Fin de la partida");
									estatusPartida=false;
								}
							}
						}
					} else if(opcion==2) {
						if(enUso.getHechizo()==null) {
							System.out.println("No tienes hechizos");
						} else {
							input.nextLine();
							System.out.println("¿Quieres usar el siguiente hechizo?(S/N)");
							System.out.println(enUso.getHechizo());
							String usar=input.nextLine();
							if(usar.equalsIgnoreCase("S")) {
								damage=bola.getDamage()-goblin.getVida();
								System.out.println("Ha hecho "+damage+"puntos de daño");
							}
						}
						if(goblin.getVida()<=0) {
							System.out.println("El goblin enemigo ha muerto");
							System.out.println("Has conseguido "+goblin.getExpDada()+" puntos de experiencia y"
									+ goblin.oroDado+" de oro");
							enUso.setDinero(enUso.getDinero()+goblin.getOroDado());
							enUso.setExpNecesaria(enUso.getExpNecesaria()-goblin.getExpDada());
							if(enUso.getExpNecesaria()<=0) {
								System.out.println("¡¡Enhorabuena!! Has subido de nivel");
								subirMago(enUso,bola);
							}
						}
						else {
							System.out.println("El Goblin ataca de vuelta");
							damage=((int)(Math.random() * goblin.getAtaque())+1)+goblin.getFuerza()-enUso.getDefensa();
							if(damage>0) {
								enUso.setVida(enUso.getVida()-damage);
								System.out.println("El Goblin hace "+damage+" de daño");
								if(enUso.getVida()>0) {
									System.out.println("Te queda "+enUso.getVida()+" de vida");
								} else {
									System.out.println("¡Has muerto! Fin de la partida");
									estatusPartida=false;
								}
							}
						} 
						
					}
					else if(opcion==3) {
						System.out.println("Te queda "+enUso.getVida()+"de vida y "+enUso.getMana()+" de mana");
						
					}
				} while(goblin.getVida()>0 && enUso.getVida()>0);
				
				if(idEnemigo>=7&&idEnemigo<=10) {
					Murcielago murcielago=new Murcielago("Murcielago","Murcielago");
					System.out.println("¡Ha aparecido un Murcielago enemigo!");
					do {
						System.out.println("¿Que quieres hacer?");
						System.out.println("1.- Atacar");
						System.out.println("2.- Hechizos");
						System.out.println("3.- Estatus");
						opcion=input.nextInt();
						if(opcion==1) {
							damage=((int)(Math.random() * enUso.getArma().getAtaque())+1)+enUso.getFuerza()-murcielago.getDefensa();
							if(damage>0) {
								murcielago.setVida(murcielago.getVida()-damage);
								System.out.println("Atacas al Murcielago");
								System.out.println("Haces "+damage+" de daño");
							}
							if(murcielago.getVida()<=0) {
								System.out.println("El murcielago enemigo ha muerto");
								System.out.println("Has conseguido "+murcielago.getExpDada()+" puntos de experiencia y"
										+ goblin.oroDado+" de oro");
								enUso.setDinero(enUso.getDinero()+murcielago.getOroDado());
								enUso.setExpNecesaria(enUso.getExpNecesaria()-murcielago.getExpDada());
								if(enUso.getExpNecesaria()<=0) {
									System.out.println("¡¡Enhorabuena!! Has subido de nivel");
									subirMago(enUso,bola);
								}
							}
							else {
								System.out.println("El Murcielago ataca de vuelta");
								damage=((int)(Math.random() * murcielago.getAtaque())+1)+murcielago.getFuerza()-enUso.getDefensa();
								if(damage>0) {
									enUso.setVida(enUso.getVida()-damage);
									System.out.println("El Murcielago hace "+damage+" de daño");
									if(enUso.getVida()>0) {
										System.out.println("Te queda "+enUso.getVida()+" de vida");
									} else {
										System.out.println("¡Has muerto! Fin de la partida");
										estatusPartida=false;
									}
								}
							}
						}
					} while(murcielago.getVida()>0 && enUso.getVida()>0);
					
				}
			}
			
			} else if(enUso.getNivel()==2) {
				
			} else if (enUso.getNivel()==3) {
				
			} else if (enUso.getNivel()==4) {
			
			} else if(enUso.getNivel()==5) {
				
			}
		}
		}
		
	

}
