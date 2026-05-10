package clases;


//clase para el personaje de clase mago
public class Mago extends Personaje{
	int vidaMax=30;
	int vida=30;
	int manaMax=100;
	int mana=100;
	int fuerza=5;
	int defensa=5;
	BastonMago arma;
	Hechizo hechizo;

	public Mago(String nombre, String clase) {
		super(nombre, clase);
		this.vidaMax=vidaMax;
		this.vida=vida;
		this.manaMax=manaMax;
		this.mana=mana;
		this.fuerza=fuerza;
		this.defensa=defensa;
		this.arma=arma;
		this.hechizo=hechizo;
	}
	public Mago() {
		super();
		this.vidaMax=vidaMax;
		this.manaMax=manaMax;
		this.vida=vida;
		this.mana=mana;
		this.fuerza=fuerza;
		this.defensa=defensa;
		this.arma=arma;
		this.hechizo=hechizo;
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
	

	public BastonMago getArma() {
		return arma;
	}
	public void setArma(BastonMago arma) {
		this.arma = arma;
	}
	
	public Hechizo getHechizo() {
		return hechizo;
	}
	public void setHechizo(Hechizo hechizo) {
		this.hechizo = hechizo;
	}
	
	public int getVidaMax() {
		return vidaMax;
	}
	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}
	
	public int getManaMax() {
		return manaMax;
	}
	public void setManaMax(int manaMax) {
		this.manaMax = manaMax;
	}
	@Override
	public String toString() {
		return " nombre="+ nombre + "[vida=" + vida + ", mana=" + mana + ", fuerza=" + fuerza + ", defensa=" + defensa + ", clase=" + clase + ", nivel=" + nivel + "]";
	}
	
	

}
