package clases;

public class Arquero extends Personaje {
	int vida=40;
	int mana=60;
	int fuerza=10;
	int defensa=7;

	public Arquero(String nombre, String clase) {
		super(nombre, clase);
		this.vida=vida;
		this.mana=mana;
		this.fuerza=fuerza;
		this.defensa=defensa;
	}
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
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

	@Override
	public String toString() {
		return " nombre="+ nombre + "[vida=" + vida + ", mana=" + mana + ", fuerza=" + fuerza + ", defensa=" + defensa + ", clase=" + clase + ", nivel=" + nivel + "]";
	}
	

}
