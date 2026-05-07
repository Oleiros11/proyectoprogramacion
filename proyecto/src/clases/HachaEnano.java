package clases;

public class HachaEnano extends Objeto{
	String nombre="Hacha de alcón tormentoso";
	int ataque=20;
	String descripcion="Hacha de corto alcance, pero mortal en las manos adecuadas. Cuado se blande, se levanta una corriente de viento"
			+ "a su alrededor";
	int cantidad=1;
	public HachaEnano(int precio, String paraClase) {
		super(precio, paraClase);
		this.nombre = nombre;
		this.ataque = ataque;
		this.descripcion = descripcion;
		this.cantidad=cantidad;
	}
	public HachaEnano(int precio, String paraClase, int ataque, String nombre) {
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
