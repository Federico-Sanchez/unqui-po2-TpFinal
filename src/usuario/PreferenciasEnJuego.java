package usuario;

import java.util.ArrayList;
import java.util.List;
import desafio.Desafio;

public class PreferenciasEnJuego implements Recomendacion{

	
	
		public Integer coincidenciaDesafio(Desafio desafio, Usuario usuario) {
		return (desafio.getCantidadDeMuestra() - usuario.getPerfil().getCantidadDeMuestras()) + 
			   (desafio.getDificultad()		   - usuario.getPerfil().getDificultad()) 		  + 
			   (desafio.getRecompensa()        - usuario.getPerfil().getRecompensa());
		}


		public List<Desafio> recomendarDesafios(List<Desafio> desafios, Usuario usuario) {
			ArrayList<Desafio> desafiosRecomendados = new ArrayList<Desafio>();
			desafiosRecomendados.addAll(desafios);
			desafiosRecomendados.sort((d1, d2) -> coincidenciaDesafio(d1,usuario).compareTo(coincidenciaDesafio(d2,usuario)));
			return desafiosRecomendados.stream().limit(5).toList();
		}

}
