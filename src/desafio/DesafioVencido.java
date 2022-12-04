package desafio;

import usuario.EstadoDesafioDeUsuario;

public class DesafioVencido implements EstadoDesafioDeUsuario {

	@Override
	public boolean estaCompleto() {
		return false;
	}

	@Override
	public float getPorcentajeDeCompletitud(DesafioDeUsuario desafioDeUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

}