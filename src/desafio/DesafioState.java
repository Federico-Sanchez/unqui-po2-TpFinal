package desafio;

import muestra.Muestra;

public abstract class DesafioState {

	public Boolean estaCompletado() {
		return false;
	}

	public void votarDesafio(DesafioUsuario desafioUsuario, int voto) {};

	public void nuevaMuestra(DesafioUsuario desafioUsuario, Muestra muestra) {};

	public abstract int getPorcentajeDeCompletitud(DesafioUsuario desafioUsuario);
}
