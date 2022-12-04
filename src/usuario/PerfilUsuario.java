package usuario;

import java.util.List;

import desafio.Desafio;

public interface PerfilUsuario {

	public List<Desafio> recomendarDesafios(Preferencia preferencia);
}