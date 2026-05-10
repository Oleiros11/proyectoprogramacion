package clases;


//clase para el tipo de enemigo Dragon 
public class Dragon extends Enemigo{
	int vida=200;
	int fuerza=40;
	int defensa=10;
	int ataque=20;
	int oroDado=15;
	int expDada=9000;
	public Dragon(String nombre, String raza) {
		super(nombre, raza);
		this.vida = vida;
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.ataque = ataque;
		this.oroDado = oroDado;
		this.expDada = expDada;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getOroDado() {
		return oroDado;
	}
	public void setOroDado(int oroDado) {
		this.oroDado = oroDado;
	}
	public int getExpDada() {
		return expDada;
	}
	public void setExpDada(int expDada) {
		this.expDada = expDada;
	}
	@Override
	public String toString() {
		return "Dragon [vida=" + vida + ", fuerza=" + fuerza + ", defensa=" + defensa + ", ataque=" + ataque
				+ ", oroDado=" + oroDado + ", expDada=" + expDada + "]";
	}
	
	
}
