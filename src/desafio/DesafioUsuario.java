package desafio;

import java.util.Date;

import coordenada.Coordenada;
import muestra.Muestra;
import usuario.Usuario;

public class DesafioUsuario {
	
	private Date momentoSuperado;
	private int voto;
	private Desafio desafio;
	private DesafioState estado;
	private Usuario usuario;
	private int MuestrasRecolectadas;
	
	public DesafioUsuario(Desafio desafio, Usuario usuario) {
		setDesafio(desafio);
		setUsuario(usuario);
		this.estado = new DesafioIncompleto();
		this.voto = 0;
	}
	
	public Date getMomentoSuperado() {
		return momentoSuperado;
	}

	public void setMomentoSuperado(Date date) {
		this.momentoSuperado = date;
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

	private void setDesafio(Desafio desafio) {
		this.desafio = desafio;
	}

	public DesafioState getEstado() {
		return estado;
	}

	public void setEstado(DesafioState estado) {
		this.estado = estado;
	}

	public boolean estaCompletado() {
		return getEstado().estaCompletado();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	private void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public int getPorcentajeDeCompletitud() {
		return getEstado().getPorcentajeDeCompletitud(this);
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
	
	public boolean esCompatibleCon(Muestra muestra) {
		return estaDentroDelArea(muestra.getCoordenadaGeografica())
				&& estaDentroDeLaFecha(muestra.getFechaYHora());
	}

	public boolean estaDentroDeLaFecha(Date fechaYHora) {
		return getDesafio().getRestriccion().esRestriccion(fechaYHora);
	}

	public boolean estaDentroDelArea(Coordenada coordenadaGeografica) {
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
