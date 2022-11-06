package filtro;

import java.util.List;

import proyecto.Proyecto;

public interface IFiltro {

	public List<Proyecto> filter(List<Proyecto> proyectos);
}