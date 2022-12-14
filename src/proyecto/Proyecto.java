package proyecto;

import java.util.ArrayList;
import java.util.List;

import muestra.Muestra;
import usuario.Usuario;

public class Proyecto {
	
	private String nombre;
	private String descripcion;
	private List<String> categorias;
	private List<Usuario> usuariosActivos = new ArrayList<Usuario>();
	private List<Muestra> muestras = new ArrayList<Muestra>();
	
	public Proyecto(String nombre, String descripcion, List<String> categorias) {
		setNombre(nombre);
		setDescripcion(descripcion);
		setCategorias(categorias);
	}

	public List<Muestra> getMuestras() {
		return muestras;
	}

	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}

	public List<Usuario> getUsuariosActivos() {
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

	public List<String> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}
	
	public Boolean tieneElTextoEnElTitulo(String texto) {
		return this.getNombre() == texto;
	}

	public Boolean tieneLasCategorias(List<String> categoriasRecibidas) {
		
		int cantidadDeCategorias = categoriasRecibidas.size();
		int categoriasContenidas = 0;
		for (int i = 0; i < categoriasRecibidas.size(); i++) {
			if (this.getCategorias().contains(categoriasRecibidas.get(i))) {
				categoriasContenidas = categoriasContenidas + 1;
			}
			
		}
		return cantidadDeCategorias == categoriasContenidas;
	}

}