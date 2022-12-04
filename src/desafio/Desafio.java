package desafio;

import restriccionTemporal.RestriccionTemporal;

public class Desafio {
	
	private int cantidadDeMuestra;
	private int dificultad;
	private int recompensa;
	private Area area;
	private RestriccionTemporal restriccion;
	
	public Desafio(Area area, RestriccionTemporal restriccion, int cantidadDeMuestra, int dificultad, int recompensa) {
		this.cantidadDeMuestra = cantidadDeMuestra;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
		this.recompensa = recompensa;
		this.setRestriccion(restriccion);
	}

	public int getCantidadDeMuestra() {
		return cantidadDeMuestra;
	}
	
	public void setCantidadDeMuestra(int cantidadDeMuestra) {
		this.cantidadDeMuestra = cantidadDeMuestra;
	}

	public int getDificultad() {
		return dificultad;
	}

	public int getRecompensa() {
		return recompensa;
	}

	public void nuevaMuestra() {
		setCantidadDeMuestra(getCantidadDeMuestra() + 1);
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public RestriccionTemporal getRestriccion() {
		return restriccion;
	}

	public void setRestriccion(RestriccionTemporal restriccion) {
		this.restriccion = restriccion;
	}

}