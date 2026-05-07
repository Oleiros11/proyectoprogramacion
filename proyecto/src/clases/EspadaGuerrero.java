package clases;

public class EspadaGuerrero extends Objeto{
	String nombre="Espadón de berserker";
	int ataque=30;
	String descripcion="Un espadón de dos metros de largo y mas de 100 kilos de peso. Solo puede usarlo aquel que haya entrenado sus "
			+ "musculos a conciencia. Debe usarse a dos manos";
	int cantidad=1;
	public EspadaGuerrero(int precio, String paraClase) {
		super(precio, paraClase);
		this.nombre = nombre;
		this.ataque = ataque;
		this.descripcion = descripcion;
		this.cantidad=cantidad;
	}
	public EspadaGuerrero(int precio, String paraClase, int ataque, String nombre) {
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
