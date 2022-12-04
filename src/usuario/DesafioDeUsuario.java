package usuario;

import java.util.Date;

import desafio.Desafio;

public class DesafioDeUsuario {
	private int voto;
	//private Date momentoDeSuperacion; // revisar
	private Desafio desafio;
	private EstadoDesafioDeUsuario estadoDesafioDeUsuario;
	//private float porcentajeDeCompletitud; // revisar
	
	
	
	public DesafioDeUsuario(int voto, Date momentoDeSuperacion, Desafio desafio, float porcentajeDeCompletitud) {
		super();
		this.voto = voto;
		//this.momentoDeSuperacion = momentoDeSuperacion;
		this.desafio = desafio;
		this.estadoDesafioDeUsuario = new DesafioEspera();
		//this.porcentajeDeCompletitud = porcentajeDeCompletitud;
	}
	
	
	
	
	
	public EstadoDesafioDeUsuario getEstadoDesafioDeUsuario() {
		return estadoDesafioDeUsuario;
	}





	public float getPorcentajeDeCompletitud() {
		return this.estadoDesafioDeUsuario.getPorcentajeDeCompletitud(this);
	}



	public void cambiarDeEstado(EstadoDesafioDeUsuario estadoDesafioDeUsuario) {
		this.estadoDesafioDeUsuario = estadoDesafioDeUsuario;
	}
	
	
	
	
}