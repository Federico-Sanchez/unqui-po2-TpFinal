package Filtro;

import java.util.List;
import java.util.stream.Collectors;

import proyecto.Proyecto;

public class FiltroIncluirCategorias implements IFiltro{
	
	private List<String> categorias;

	public FiltroIncluirCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

	public List<String> getCategorias() {
		return categorias;
	}

	@Override
	public List<Proyecto> filter(List<Proyecto> proyectos) {
		return proyectos.stream()
				.filter(proyecto -> proyecto.tieneLasCategorias(getCategorias()))
				.collect(Collectors.toList());
	}

}
