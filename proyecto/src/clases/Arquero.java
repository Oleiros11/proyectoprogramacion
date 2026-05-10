package clases;


//clase para el personaje de clase arquero
public class Arquero extends Personaje {
	int vidaMax=40;
	int vida=40;
	int manaMax=60;
	int mana=60;
	int fuerza=10;
	int defensa=7;
	Arco arma;
	Habilidad habilidad;

	public Arquero(String nombre, String clase) {
		super(nombre, clase);
		this.vidaMax=vidaMax;
		this.vida=vida;
		this.manaMax=manaMax;
		this.mana=mana;
		this.fuerza=fuerza;
		this.defensa=defensa;
		this.arma=arma;
		this.habilidad=habilidad;
	}

	public Arquero() {
		super();
		this.vidaMax=vidaMax;
		this.vida=vida;
		this.manaMax=manaMax;
		this.mana=mana;
		this.fuerza=fuerza;
		this.defensa=defensa;
		this.arma=arma;
		this.habilidad=habilidad;
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
	

	public Arco getArma() {
		return arma;
	}

	public void setArma(Arco arma) {
		this.arma = arma;
	}
	

	public Habilidad getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(Habilidad habilidad) {
		this.habilidad = habilidad;
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
