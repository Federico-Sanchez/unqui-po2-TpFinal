package usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import desafio.Desafio;
import proyecto.Proyecto;

public class PreferenciasEnJuego implements Recomendacion{

	
	
		public Integer coincidenciaDesafio(Desafio desafio, Usuario usuario) {
		return Math.abs(desafio.getCantidadDeMuestra() - usuario.getPerfil().getCantidadDeMuestras()) + 
			   Math.abs(desafio.getDificultad()		   - usuario.getPerfil().getDificultad()) 		  + 
			   Math.abs(desafio.getRecompensa()        - usuario.getPerfil().getRecompensa());
		}


		public List<Desafio> recomendarDesafios(List<Desafio> desafios, Usuario usuario) {
			ArrayList<Desafio> desafiosRecomendados = new ArrayList<Desafio>();
			desafiosRecomendados.addAll(desafios);
			desafiosRecomendados.sort((d1, d2) -> coincidenciaDesafio(d1,usuario).compareTo(coincidenciaDesafio(d2,usuario)));
			return desafiosRecomendados.stream().limit(5).toList();
		}

}
