package clases;


//estadisticas base para todos los personajes 
public class Personaje {
	String nombre;
	String clase;
	int nivel=1;
	int expNecesaria=100;
	int dinero=400;
	
	public Personaje(String nombre, String clase) {
		this.nombre=nombre;
		this.clase=clase;
		this.nivel=nivel;
		this.expNecesaria=expNecesaria;
		this.dinero=dinero;
	}
	public Personaje() {
		this.nombre=nombre;
		this.clase=clase;
		this.nivel=nivel;
		this.expNecesaria=expNecesaria;
		this.dinero=dinero;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	

	public int getExpNecesaria() {
		return expNecesaria;
	}


	public void setExpNecesaria(int expNecesaria) {
		this.expNecesaria = expNecesaria;
	}


	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", clase=" + clase + ", nivel=" + nivel + "]";
	}


	
	

}
