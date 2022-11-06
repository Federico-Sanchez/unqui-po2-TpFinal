package Filtro;

import java.util.List;
import java.util.stream.Collectors;

import proyecto.Proyecto;

public class FiltroExcluirCategorias implements IFiltro{
	
	private List<String> categorias;

	public FiltroExcluirCategorias(List<String> categorias) {
		super();
		this.categorias = categorias;
	}

	@Override
	public List<Proyecto> filter(List<Proyecto> proyectos) {
		return proyectos.stream()
				.filter(proyecto -> !proyecto.tieneLasCategorias(getCategorias()))
				.collect(Collectors.toList());
	}

	public List<String> getCategorias() {
		return categorias;
	}

}
