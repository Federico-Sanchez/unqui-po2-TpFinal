package desafio;

import usuario.DesafioDeUsuario;
import usuario.EstadoDesafioDeUsuario;

public class DesafioCompletado implements EstadoDesafioDeUsuario {

	@Override
	public boolean estaCompleto() {
		return true;
	}
	

	@Override
	public float getPorcentajeDeCompletitud(DesafioDeUsuario desafioDeUsuario) {
		return 100;
	}
	
	

}
