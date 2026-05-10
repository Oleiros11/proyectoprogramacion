package clases;


//clase con las estadisticas comunes de todos los enemgios 
public class Enemigo {
	String nombre;
	String raza;
	public Enemigo(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "Enemigo [nombre=" + nombre + ", raza=" + raza + "]";
	}
	
	
}
