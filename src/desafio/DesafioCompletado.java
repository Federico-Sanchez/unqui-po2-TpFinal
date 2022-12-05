package desafio;

public class DesafioCompletado extends DesafioState {

	@Override
	public boolean estaCompletado() {
		return true;
	}

	@Override
	public void votarDesafio(DesafioUsuario desafioUsuario, int voto) {
		desafioUsuario.setVoto(voto);
	}

	@Override
	public int getPorcentajeDeCompletitud(DesafioUsuario desafioUsuario) {
		return 100;
	}
	
}
