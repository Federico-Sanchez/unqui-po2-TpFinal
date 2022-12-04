package desafio;

import java.time.LocalDate;

public class DesafioUsuario {
	
	private LocalDate momentoSuperado;
	private int voto;
	private Desafio desafio;
	private DesafioState estado;
	
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

	public DesafioUsuario(LocalDate momentoSuperado, int voto, Desafio desafio) {
		super();
		this.momentoSuperado = momentoSuperado;
		this.voto = voto;
		this.desafio = desafio;
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

	
}
