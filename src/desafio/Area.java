package desafio;

import coordenada.Coordenada;

public class Area {
	
	private Coordenada coordenada;
	private Double radio;
	
	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Area(Coordenada coordenada, int radio) {
		setCoordenada(coordenada);;
		setRadio((double) radio);;
	}
}
