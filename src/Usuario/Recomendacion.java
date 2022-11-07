package usuario;

import java.util.List;

import desafio.Desafio;
import proyecto.Proyecto;


public abstract class  Recomendacion {
	
	  public int cantidadDeMuestras;
	  public int dificultad;
	  public int recompensa;
		
	
	

	public Recomendacion(int cantidadDeMuestras, int dificultad, int recompensa) {
		super();
		this.cantidadDeMuestras = cantidadDeMuestras;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
	}

	public abstract  List<Desafio> seleccionarDesafio(Proyecto proyectos);
	

	public double coincidenciaDesafio(Desafio desafio,Usuario usuario) {
		return Math.abs(desafio.getCantidadDeMuestra()- usuario.getPerfil().getCantidadDeMuestrasARecolectar()) + 
			   Math.abs(desafio.getDificultad() - this.perfil.getDificultad()) + 
			   Math.abs(desafio.getRecompensa() - this.perfil.getRecompensa()); 
	};
	
}
