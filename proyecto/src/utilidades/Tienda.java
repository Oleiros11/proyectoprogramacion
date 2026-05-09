package utilidades;

import java.util.Scanner;

import clases.Arco;
import clases.Arquero;
import clases.BastonMago;
import clases.Enano;
import clases.EspadaGuerrero;
import clases.Guerrero;
import clases.HachaEnano;
import clases.Mago;

public class Tienda {
	public static void entrarTiendaMago(Mago mago,BastonMago baston2, Scanner input) {
		input.nextLine();
		if(baston2.getCantidad()==1) {
			System.out.println("¡¡Bienvenido a la tienda!!");
			System.out.println("Tenemos un bastón que igual te interesa");
			System.out.println(baston2.getNombre());
			System.out.println(baston2.getDescripcion());
			System.out.println("Cuesta "+baston2.getPrecio()+" de oro");
			System.out.println("¿Quieres comprarlo?(S/N)");
			System.out.println("Tu oro: "+mago.getDinero());
			String respuesta=input.nextLine();
			if(respuesta.equalsIgnoreCase("S")) {
				if(mago.getDinero()>baston2.getPrecio()) {
					System.out.println("¡Gracias por su compra!");
					mago.setArma(baston2);
					mago.setDinero(mago.getDinero()-baston2.getPrecio());
					baston2.setCantidad(0);
				} else {
					System.out.println("¡Lo siento! pero no tienes el dinero necesario");
				}
			} else {
				System.out.println("Una lástima, es muy buena arma");
			}
			System.out.println("¡Vuelva pronto!");
		} else {
			System.out.println("No tenemos nada nuevo para ofrecerle, ¡vuelva pronto!");
		}
		System.out.println("¡Vida y mana recuperados!");
	}
	public static void entrarTiendaArquero(Arquero arquero, Arco arco2,Scanner input) {
		input.nextLine();
		if(arco2.getCantidad()==1) {
			System.out.println("¡¡Bienvenido a la tienda!!");
			System.out.println("Tenemos un arco que igual te interesa");
			System.out.println(arco2.getNombre());
			System.out.println(arco2.getDescripcion());
			System.out.println("Cuesta "+arco2.getPrecio());
			System.out.println("¿Quieres comprarlo?(S/N)");
			System.out.println("Tu oro: "+arquero.getDinero());
			String respuesta=input.nextLine();
			if(respuesta.equalsIgnoreCase("S")) {
				if(arquero.getDinero()>arco2.getPrecio()) {
					System.out.println("¡Gracias por su compra!");
					arquero.setArma(arco2);
					arquero.setDinero(arquero.getDinero()-arco2.getPrecio());
					arco2.setCantidad(0);
				} else {
					System.out.println("¡Lo siento! pero no tienes el dinero necesario");
				}
			} else {
				System.out.println("Una lástima, es muy buena arma");
			}
			System.out.println("¡Vuelva pronto!");
		} else {
			System.out.println("No tenemos nada nuevo para ofrecerle, ¡vuelva pronto!");
		}
		System.out.println("¡Vida y mana recuperados!");
	}
	public static void entrarTiendaGuerrero(Guerrero guerrero, EspadaGuerrero espada2,Scanner input) {
		input.nextLine();
		if(espada2.getCantidad()==1) {
			System.out.println("¡¡Bienvenido a la tienda!!");
			System.out.println("Tenemos una espada que igual te interesa");
			System.out.println("Pero ten cuidado, ¡pesa mucho!");
			System.out.println(espada2.getNombre());
			System.out.println(espada2.getDescripcion());
			System.out.println("Cuesta "+espada2.getPrecio()+" de oro");
			System.out.println("¿Quieres comprarlo?(S/N)");
			System.out.println("Tu oro: "+guerrero.getDinero());
			String respuesta=input.nextLine();
			if(respuesta.equalsIgnoreCase("S")) {
				if(guerrero.getDinero()>espada2.getPrecio()) {
					System.out.println("¡Gracias por su compra!");
					guerrero.setArma(espada2);
					guerrero.setDinero(guerrero.getDinero()-espada2.getPrecio());
					espada2.setCantidad(0);
				} else {
					System.out.println("¡Lo siento! pero no tienes el dinero necesario");
				}
			} else {
				System.out.println("Una lástima, es muy buena arma");
			}
			System.out.println("¡Vuelva pronto!");
		} else {
			System.out.println("No tenemos nada nuevo para ofrecerle, ¡vuelva pronto!");
		}
		System.out.println("¡Vida y mana recuperados!");
	}
	public static void entrarTiendaEnano(Enano enano, HachaEnano hacha2,Scanner input) {
		input.nextLine();
		if(hacha2.getCantidad()==1) {
			System.out.println("¡¡Bienvenido a la tienda!!");
			System.out.println("Tenemos un hacha que igual te interesa");
			System.out.println(hacha2.getNombre());
			System.out.println(hacha2.getDescripcion());
			System.out.println("Cuesta "+hacha2.getPrecio()+" de oro");
			System.out.println("¿Quieres comprarlo?(S/N)");
			System.out.println("Tu oro: "+enano.getDinero());
			String respuesta=input.nextLine();
			if(respuesta.equalsIgnoreCase("S")) {
				if(enano.getDinero()>hacha2.getPrecio()) {
					System.out.println("¡Gracias por su compra!");
					enano.setArma(hacha2);
					enano.setDinero(enano.getDinero()-hacha2.getPrecio());
					hacha2.setCantidad(0);
				} else {
					System.out.println("¡Lo siento! pero no tienes el dinero necesario");
				}
			} else {
				System.out.println("Una lástima, es muy buena arma");
			}
			System.out.println("¡Vuelva pronto!");
		} else {
			System.out.println("No tenemos nada nuevo para ofrecerle, ¡vuelva pronto!");
		}
		System.out.println("¡Vida y mana recuperados!");
	}
}
