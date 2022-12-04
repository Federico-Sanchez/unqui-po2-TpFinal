package desafio;

import coordenada.Coordenada;
import restriccionTemporal.RestriccionTemporal;
import usuario.Usuario;

public class Desafio {
	
	private int cantidadDeMuestra;
	private int dificultad;
	private int recompensa;
	
	public Desafio(Coordenada area, RestriccionTemporal restriccion, int cantidadDeMuestra, int dificultad, int recompensa) {
		this.cantidadDeMuestra = cantidadDeMuestra;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
	}

	public int getCantidadDeMuestra() {
		return cantidadDeMuestra;
	}

	public int getDificultad() {
		return dificultad;
	}

	public int getRecompensa() {
		return recompensa;
	}

}