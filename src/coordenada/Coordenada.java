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
		double distancia = calcularDistancia(getLatitud(), getLongitud(), area.getCoordenada().getLatitud(), area.getCoordenada().getLongitud());
		return distancia <= area.getRadio();
	}

	private double calcularDistancia(double latitud1, double longitud1, double latitud2, double longitud2) {
		double radioTierra = 6371;
		double dLat = Math.toRadians(latitud2 - latitud1);
		double dLon = Math.toRadians(longitud2 - longitud1);
		latitud1 = Math.toRadians(latitud1);
		latitud2 = Math.toRadians(latitud2);

		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(latitud1) * Math.cos(latitud2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		
		return radioTierra * c;
	}
}