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
	public void entrarTiendaMago(Mago mago,BastonMago baston2, Scanner input) {
		if(baston2.getCantidad()==1) {
			System.out.println("¡¡Bienvenido a la tienda!!");
			System.out.println("Tenemos un bastón que igual te interesa");
			baston2.toString();
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
	}
	public void entrarTiendaArquero(Arquero arquero, Arco arco2) {
		System.out.println("¡¡Bienvenido a la tienda!!");
	}
	public void entrarTiendaGuerrero(Guerrero guerrero, EspadaGuerrero espada2) {
		System.out.println("¡¡Bienvenido a la tienda!!");
	}
	public void entrarTiendaEnano(Enano enano, HachaEnano hacha2) {
		System.out.println("¡¡Bienvenido a la tienda!!");
	}
}
