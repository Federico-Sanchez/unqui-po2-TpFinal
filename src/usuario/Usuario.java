package usuario;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import muestra.Muestra;
import proyecto.Proyecto;
import desafio.Desafio;
import desafio.DesafioUsuario;


public class Usuario {
	
	private String nombre;
	private List<Muestra> muestrasRecolectadas = new ArrayList<Muestra>();
	private PerfilUsuario perfilUsuario;
	private Preferencia preferencia;
	private List <DesafioUsuario> desafiosAceptados = new ArrayList<DesafioUsuario>(); 
	
	public Usuario(String nombre, PerfilUsuario perfilUsuario, Preferencia estado) {
		this.setNombre(nombre);
		this.perfilUsuario = perfilUsuario;
		this.preferencia = estado;
	}
	
	public void addMuestra(Muestra muestra) {
		muestrasRecolectadas.add(muestra);
	}
	
	
	public List<Muestra> getMuestras() {
		return muestrasRecolectadas;
	}

	public PerfilUsuario getPerfil() {
		return perfilUsuario;
	}

	public void setPerfil(PerfilUsuario nuevoPerfil) {
		this.perfilUsuario = nuevoPerfil;
	}
	
	
	public void setEstado(Preferencia estado) {
		this.preferencia = estado;
	}
	
	public Preferencia getEstado() {
		return this.preferencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
