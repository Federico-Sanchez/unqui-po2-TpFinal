package usuario;

import java.util.ArrayList;

import java.util.List;

import muestra.Muestra;
import proyecto.Proyecto;
import Desafio.Desafio;


public class Usuario {
	
	private String nombre;
	private String descripcion;
	private List <String> categorias = new ArrayList<String>();
	private List<Muestra> muestras = new ArrayList<Muestra>();
	private List <Proyecto> proyectos = new ArrayList<Proyecto>();
	private PerfilUsuario perfil;
	private Recomendacion estado;
	
	
	public Usuario(String nombre,String descripcion,List<String> categorias,PerfilUsuario perfil,Recomendacion estado) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categorias = categorias;
		this.perfil = perfil;
		this.estado = estado;
	}
	
	public void addProyecto(Proyecto proyecto) {
		proyectos.add(proyecto);
	}
	
	
	public void addMuestra(Muestra muestra) {
		muestras.add(muestra);
	}

	
	public List<Muestra> getMuestras() {
		return muestras;
	}


	
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	

	public PerfilUsuario getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilUsuario nuevoPerfil) {
		this.perfil = nuevoPerfil;
	}
	
	
	public void setEstado(Recomendacion estado) {
		this.estado = estado;
	}
	
	public Recomendacion getEstado() {
		return this.estado;
	}
	
	public List<Desafio> seleccionarDesafios(Proyecto proyectos) {
		return this.estado.seleccionarDesafio(proyectos);
	};
	
	public double coincidenciaDesafio(Desafio desafio) {
		return this.estado.coincidenciaDesafio(desafio, this);
	};
	
}
