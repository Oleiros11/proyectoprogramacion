package clases;

public class Guerrero extends Personaje{
	int vidaMax=50;
	int vida=50;
	int manaMax=50;
	int mana=50;
	int fuerza=15;
	int defensa=10;
	EspadaGuerrero arma;
	Habilidad habilidad;

	public Guerrero(String nombre, String clase) {
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
	public Guerrero() {
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
	

	public EspadaGuerrero getArma() {
		return arma;
	}
	public void setArma(EspadaGuerrero arma) {
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
