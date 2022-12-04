package coordenada;

import desafio.Area;

public class Coordenada {
	private double latitud;
	private double longitud;
	
	
	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public boolean estaDentroDelArea(Area area) {
		double diferenciaCoordenada = getLatitud() - getLatitud();
		double diferenciaArea = area.getCoordenada().getLatitud() - area.getCoordenada().getLatitud();

		return (Math.pow(2, diferenciaCoordenada) + Math.pow(2, diferenciaArea)) <= area.getRadio();
	}
}