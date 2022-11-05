package usuario;

import java.util.List;
import java.util.stream.Stream;

import desafio.Desafio;
import proyecto.Proyecto;

public class PreferenciasEnJuego extends Recomendacion{

	
	
	

	

	public PreferenciasEnJuego(int cantidadDeMuestras, int dificultad, int recompensa) {
		super(cantidadDeMuestras, dificultad, recompensa);
	}

	
	
	@Override
	public List<Desafio> seleccionarDesafio(Proyecto proyectos ) {
		return null;
	}






	
}
