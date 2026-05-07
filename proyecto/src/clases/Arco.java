package clases;

public class Arco extends Objeto{
	String nombre="Arco de Lorien";
	int ataque=25;
	String descripcion="Arco legado de generación a generación. El simple hecho de contemplarlo es todo un honor. "
			+ "Se puede sentir el poder élfico a traves de su cuerda";
	int cantidad=1;
	public Arco(int precio, String paraClase) {
		super(precio, paraClase);
		this.nombre = nombre;
		this.ataque = ataque;
		this.descripcion = descripcion;
		this.cantidad=cantidad;
	}
	public Arco(int precio, String paraClase, int ataque, String nombre) {
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
