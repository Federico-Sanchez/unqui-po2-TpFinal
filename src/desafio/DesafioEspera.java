package desafio;

import usuario.DesafioDeUsuario;
import usuario.EstadoDesafioDeUsuario;

public class DesafioEspera implements EstadoDesafioDeUsuario {

	@Override
	public boolean estaCompleto() {
		return false;
	}

	@Override
	public float getPorcentajeDeCompletitud(DesafioDeUsuario desafioDeUsuario) {
		return 0;
	}

}
