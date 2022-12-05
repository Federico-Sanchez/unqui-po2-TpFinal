package usuario;

import java.util.ArrayList;

import java.util.List;

import muestra.Muestra;
import proyecto.Proyecto;
import desafio.DesafioUsuario;
import desafio.GestorDesafio;

public class Usuario {
	
	private String nombre;
	private PerfilUsuario perfil;
	private Recomendacion recomendacionJuego;
	private List <Proyecto> proyectos = new ArrayList<Proyecto>();
	private List <DesafioUsuario> desafios = new ArrayList<DesafioUsuario>(); 
	private List<Muestra> muestras = new ArrayList<Muestra>();
	private GestorDesafio gestorDesafio;
	

	public Usuario(String nombre,PerfilUsuario perfil,Recomendacion estado, GestorDesafio gestorDesafio) {
		this.nombre = nombre;
		this.perfil = perfil;
		this.recomendacionJuego = estado;
		this.gestorDesafio = gestorDesafio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public PerfilUsuario getPerfil() {
		return perfil;
	}
	
	public void setPerfil(PerfilUsuario nuevoPerfil) {
		this.perfil = nuevoPerfil;
	}

	public Recomendacion getRecomendacionJuego() {
		return recomendacionJuego;
	}

	public void setRecomendacionJuego(Recomendacion recomendacionJuego) {
		this.recomendacionJuego = recomendacionJuego;
	}

	public List<DesafioUsuario> getDesafios() {
		return desafios;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public List<Muestra> getMuestras() {
		return muestras;
	}
	
	public void agregarDesafio(DesafioUsuario desafio) {
		this.desafios.add(desafio);
	}

	public void deleteDesafio(DesafioUsuario desafio1) {
		desafios.remove(desafio1);

	}

	public void addProyecto(Proyecto proyecto) {
		proyectos.add(proyecto);
	}
	
	public void deleteProyecto(Proyecto proyecto) {
		proyectos.remove(proyecto);

	}
	
	public void addMuestra(Muestra muestra) {
		muestras.add(muestra);
		nuevaMuestraParaDesfios(muestra);
	}
	
	private void nuevaMuestraParaDesfios(Muestra muestra) {
		getDesafios().stream().forEach(desafio -> desafio.nuevaMuestra(muestra));
	}

	public List<DesafioUsuario> desafiosCompletados() {
		return gestorDesafio.desafiosCompletados(getDesafios());
	}
	
	public int porcentajeDeCompletitud() {
		return gestorDesafio.porcentajeDeCompletitud(getDesafios());
	}

	public DesafioUsuario desafioConMayorPuntaje() {
		DesafioUsuario mayorHastaAhora = desafios.get(0);
		for (DesafioUsuario d : desafios) {
			if(mayorHastaAhora.getVoto() <= d.getVoto()) {
				mayorHastaAhora = d;
			} 
		} return mayorHastaAhora; 
	}
	
}
