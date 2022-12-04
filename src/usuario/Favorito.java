package usuario;

import java.util.ArrayList;
import java.util.List;

import desafio.Desafio;

public class Favorito implements  Recomendacion{

	
	
	
	
	public Integer coincidenciaDesafio(Desafio desafio, Usuario usuario) {
		Desafio desafioDeUsuarioConMayorPuntaje = usuario.desafioConMayorPuntaje().getDesafio(); 
		int similitud = this.diferenciaSimilitud(desafio.getCantidadDeMuestra(), desafioDeUsuarioConMayorPuntaje.getCantidadDeMuestra()) + 
						this.diferenciaSimilitud(desafio.getDificultad(), desafioDeUsuarioConMayorPuntaje.getDificultad()) + 
						this.diferenciaSimilitud(desafio.getRecompensa(), desafioDeUsuarioConMayorPuntaje.getRecompensa()); 
		return similitud / 3; 
	}  
	
	

	public List<Desafio> recomendarDesafios(List<Desafio> desafios, Usuario usuario) {
		ArrayList<Desafio> desafiosRecomendados = new ArrayList<Desafio>();
		desafiosRecomendados.addAll(desafios);
		desafiosRecomendados.sort((d1, d2) -> coincidenciaDesafio(d1,usuario).compareTo(coincidenciaDesafio(d2,usuario)));
		return desafiosRecomendados.stream().limit(5).toList();
	}

	public int diferenciaSimilitud(Integer numero1,Integer numero2) {
		return Math.abs(numero1 - numero2);
	}

}

