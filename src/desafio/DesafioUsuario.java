package desafio;

import java.time.LocalDate;
import java.util.Date;

import coordenada.Coordenada;
import muestra.Muestra;
import usuario.Usuario;

public class DesafioUsuario {
	
	private LocalDate momentoSuperado;
	private int voto;
	private Desafio desafio;
	private DesafioState estado;
	private Usuario usuario;
	private int MuestrasRecolectadas;
	
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

	public void votar(int voto) {
		getEstado().votarDesafio(this, voto);
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
	
	public int muestrasCompatibles() {
		return (int) getUsuario()
				.getMuestras()
				.stream()
				.filter(muestra -> esCompatibleCon(muestra))
				.count();
	}

	public void nuevaMuestra(Muestra muestra) {
		getEstado().nuevaMuestra(this, muestra);
	}
	
	public Boolean esCompatibleCon(Muestra muestra) {
		return estaDentroDelArea(muestra.getCoordenadaGeografica())
				&& estaDentroDeLaFecha(muestra.getFechaYHora());
	}

	private boolean estaDentroDeLaFecha(Date fechaYHora) {
		return getDesafio().getRestriccion().esRestriccion(fechaYHora);
	}

	private boolean estaDentroDelArea(Coordenada coordenadaGeografica) {
		return coordenadaGeografica.estaDentroDelArea(getDesafio().getArea());
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public int getMuestrasRecolectadas() {
		return MuestrasRecolectadas;
	}

	public void setMuestrasRecolectadas(int muestrasRecolectadas) {
		MuestrasRecolectadas = muestrasRecolectadas;
	}

	public void incrementarMuestrasRecolectadas() {
		setMuestrasRecolectadas(getMuestrasRecolectadas() + 1);
	}

	public boolean esUltimaMuestra() {
		return getMuestrasRecolectadas() == desafio.getCantidadDeMuestra();
	}

}
