package clases;

public class Goblin extends Enemigo{
	int vida;
	int fuerza;
	int defensa;
	public Goblin(String nombre, String raza, int vida, int fuerza, int defensa) {
		super(nombre, raza);
		this.vida = vida;
		this.fuerza = fuerza;
		this.defensa = defensa;
	}
	

}
