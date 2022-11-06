package sistema;

import java.util.ArrayList;
import java.util.List;

import Filtro.IFiltro;
import proyecto.Proyecto;

public class Sistema {
	
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();

	public Sistema(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void agregarProyecto(Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}

	public List<Proyecto> buscar(IFiltro filtroMock) {
		return filtroMock.filter(this.getProyectos());
	}
}
