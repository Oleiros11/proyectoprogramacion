package clases;

public class Orco extends Enemigo{
	int vida=100;
	int fuerza=20;
	int defensa=10;
	int ataque=10;
	int oroDado=150;
	int expDada=200;
	public Orco(String nombre, String raza) {
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
	
	
	
}
