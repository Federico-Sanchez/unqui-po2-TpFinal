package desafio;

import coordenada.Coordenada;
import muestra.Muestra;
import restrinccionTemporal.RestriccionTemporal;

public class Desafio {
	
	private Coordenada area;
	private RestriccionTemporal restriccion;
	private int cantidadDeMuestra;
	private int dificultad;
	private int recompensa;
	
	public Desafio(Coordenada area, RestriccionTemporal restriccion, int cantidadDeMuestra, int dificultad, int recompensa) {
		super();
		this.area = area;
		this.restriccion = restriccion;
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

	public Boolean estaCompletado() {
		return porcentajeDeCompletitud() == 100;
	}
	
	public int porcentajeDeCompletitud() {
		//calcular porcentaje
		return 0;
	}

}