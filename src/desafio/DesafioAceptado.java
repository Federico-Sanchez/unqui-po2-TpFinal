package desafio;

import usuario.DesafioDeUsuario;
import usuario.EstadoDesafioDeUsuario;

public class DesafioAceptado implements EstadoDesafioDeUsuario {

	@Override
	public boolean estaCompleto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getPorcentajeDeCompletitud(DesafioDeUsuario desafioDeUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

}