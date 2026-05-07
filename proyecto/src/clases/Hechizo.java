package clases;

public class Hechizo {
	String nombre;
	int damage;
	int costaMana;
	String clase;
	public Hechizo(String nombre,int damage, int costaMana, String clase) {
		this.nombre=nombre;
		this.damage = damage;
		this.costaMana = costaMana;
		this.clase=clase;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getCostaMana() {
		return costaMana;
	}
	public void setCostaMana(int costaMana) {
		this.costaMana = costaMana;
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
	@Override
	public String toString() {
		return "Hechizo [nombre=" + nombre + ", damage=" + damage + ", costaMana=" + costaMana + ", clase=" + clase
				+ "]";
	}
	
	
}
