package clases;


//clase para el tipo de enemigo goblin
public class Goblin extends Enemigo{
	int vida=20;
	int fuerza=2;
	int defensa=4;
	int ataque=6;
	int oroDado=15;
	int expDada=250;
	public Goblin(String nombre, String raza) {
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
		return "Goblin [vida=" + vida + ", fuerza=" + fuerza + ", defensa=" + defensa + ", ataque=" + ataque
				+ ", oroDado=" + oroDado + ", expDada=" + expDada + "]";
	}
	
	
	

}