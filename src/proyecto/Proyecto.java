package proyecto;

import java.util.ArrayList;
import java.util.List;

import muestra.Muestra;
import usuario.Usuario;

public class Proyecto {
	
	private String nombre;
	private String descripcion;
	private ArrayList<String> categorias = new ArrayList<String>();
	private ArrayList<Usuario> usuariosActivos = new ArrayList<Usuario>();
	private ArrayList<Muestra> muestras = new ArrayList<Muestra>();
	
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
	
	public Boolean tieneElTextoEnElTitulo(String texto) {
		return false;
	}

	public Boolean tieneLasCategorias(List<String> categorias2) {
		return false;
	}

}
