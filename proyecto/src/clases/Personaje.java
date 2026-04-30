package clases;

public class Personaje {
	String nombre;
	String clase;
	int nivel=1;
	
	public Personaje(String nombre, String clase) {
		this.nombre=nombre;
		this.clase=clase;
		this.nivel=nivel;
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


	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", clase=" + clase + ", nivel=" + nivel + "]";
	}


	
	

}
