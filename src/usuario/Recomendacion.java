package usuario;

import java.util.List;

import desafio.Desafio;


public interface  Recomendacion  {

	
	public Integer coincidenciaDesafio(Desafio desafio, Usuario usuario);

	public abstract List<Desafio> recomendarDesafios(List<Desafio> desafios2, Usuario usuario);
}