package area;

import coordenada.Coordenada;

public class Area {
	private Coordenada coordenada;
	private double radio;
	
	
	
	public Area(Coordenada coordenada, double radio) {
		super();
		this.coordenada = coordenada;
		this.radio = radio;
	}
	
	
	public Coordenada getCoordenada() {
		return coordenada;
	}
	

	public double getRadio() {
		return radio;
	}
	
}
