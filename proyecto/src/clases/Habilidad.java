package clases;

public class Habilidad {
	String nombre;
	int damage;
	int costeMana;
	String clase;
	public Habilidad(String nombre, int damage, int costeMana, String clase) {
		super();
		this.nombre = nombre;
		this.damage = damage;
		this.costeMana = costeMana;
		this.clase = clase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getCosteMana() {
		return costeMana;
	}
	public void setCosteMana(int costeMana) {
		this.costeMana = costeMana;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	

}
