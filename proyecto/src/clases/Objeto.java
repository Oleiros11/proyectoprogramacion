package clases;

public class Objeto {
	int precio;
	String paraClase;
	public Objeto(int precio, String paraClase) {
		super();
		this.precio = precio;
		this.paraClase = paraClase;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getParaClase() {
		return paraClase;
	}
	public void setParaClase(String paraClase) {
		this.paraClase = paraClase;
	}
	@Override
	public String toString() {
		return "Objeto [precio=" + precio + ", paraClase=" + paraClase + "]";
	}
	
}
