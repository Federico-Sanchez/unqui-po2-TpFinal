package desafio;

import java.time.LocalDate;

import usuario.Usuario;

public class DesafioUsuario {
	
	private LocalDate momentoSuperado;
	private int voto;
	private Desafio desafio;
	private DesafioState estado;
	private Usuario usuario;
	
	public DesafioUsuario(LocalDate momentoSuperado, int voto, Desafio desafio, Usuario usuario) {
		this.momentoSuperado = momentoSuperado;
		this.voto = voto;
		this.desafio = desafio;
		this.usuario = usuario;
	}
	
	public LocalDate getMomentoSuperado() {
		return momentoSuperado;
	}

	public void setMomentoSuperado(LocalDate momentoSuperado) {
		this.momentoSuperado = momentoSuperado;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public Desafio getDesafio() {
		return desafio;
	}

	public void setDesafio(Desafio desafio) {
		this.desafio = desafio;
	}

	public DesafioState getEstado() {
		return estado;
	}

	public void setEstado(DesafioState estado) {
		this.estado = estado;
	}

	public Boolean estaCompletado() {
		return getEstado().estaCompletado();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public int getPorcentajeDeCompletitud() {
		return muestrasCompatibles() / getDesafio().getCantidadDeMuestra();
	}

	private int muestrasCompatibles() {
		return (int) getUsuario()
				.getMuestras()
				.stream()
				.filter(muestra -> muestra.esCompatibleCon(this))
				.count();
	}

}
