package clases;

//clase para el equipamiento del mago
public class BastonMago extends Objeto{
	String nombre="Bastón de jade";
	int ataque=20;
	String descripcion="Un bastón hecho del más puro jade que solo puede manejar alguien que conecte con su magia interior";
	int cantidad=1;
	public BastonMago(int precio, String paraClase) {
		super(precio, paraClase);
		this.nombre = nombre;
		this.ataque = ataque;
		this.descripcion = descripcion;
		this.cantidad=cantidad;
	}
	public BastonMago(int precio, String paraClase, int ataque, String nombre) {
		super(precio, paraClase);
		this.nombre = nombre;
		this.ataque = ataque;
		this.descripcion = descripcion;
		this.cantidad=cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return nombre+". "+descripcion+"Cuesta "+precio+" de oro";
	}
	
	
	
}
