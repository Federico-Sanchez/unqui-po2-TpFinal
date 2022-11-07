package muestra;

import java.util.Date;

import desafio.Coordenada;
import usuario.Usuario;



public class Muestra {
	private Coordenada coordenadaGeografica;
	private Usuario usuario;
	private Date fechaYHora;
	
	
	
	public Muestra(Coordenada coordenadaGeografica, Usuario usuario, Date fechaYHora) {
		this.setCoordenadaGeografica(coordenadaGeografica);
		this.usuario = usuario;
		this.fechaYHora = fechaYHora;
	}
	
	
	public Date getFechaYHora() {
		return fechaYHora;
	}
	
	
	@SuppressWarnings("deprecation")
	public int getSoloHora() {
		return this.getFechaYHora().getHours();
	}
	
	
	@SuppressWarnings("deprecation")
	public int getSoloMinutos() {
		return this.getFechaYHora().getMinutes();
	}

	
	public String getHoraYMinutos() {
		return this.getSoloHora() + ":" + this.getSoloMinutos();
	}


	public Coordenada getCoordenadaGeografica() {
		return coordenadaGeografica;
	}


	public void setCoordenadaGeografica(Coordenada coordenadaGeografica) {
		this.coordenadaGeografica = coordenadaGeografica;
	}
}