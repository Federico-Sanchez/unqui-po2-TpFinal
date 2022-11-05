package proyecto;

import java.util.ArrayList;

import desafio.Desafio;
import muestra.Muestra;
import usuario.Usuario;

public class Proyecto {
	
	private String nombre;
	private String descripcion;
	private ArrayList<String> categorias = new ArrayList<String>();
	private ArrayList<Usuario> usuariosActivos = new ArrayList<Usuario>();
	private ArrayList<Muestra> muestras = new ArrayList<Muestra>();
	private ArrayList<Desafio> desafios = new ArrayList<Desafio>();
	
	public Proyecto(String nombre, String descripcion, ArrayList<String> categorias) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categorias = categorias;
	}

	public ArrayList<Muestra> getMuestras() {
		return muestras;
	}

	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}

	public ArrayList<Usuario> getUsuariosActivos() {
		return usuariosActivos;
	}

	public void agregarUsuario(Usuario usuario) {
		usuariosActivos.add(usuario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<String> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<String> categorias) {
		this.categorias = categorias;
	}

	public ArrayList<Desafio> getDesafios() {
		return desafios;
	}

	public void agregarDesafio(Desafio desafio) {
		this.desafios.add(desafio);
		notificarUsuarios(desafio);
	}
	
	public void notificarUsuarios(Desafio desafio) {
		for (Usuario usuario : this.usuariosActivos) {
			usuario.update(desafio);
		}
	}
		
}
