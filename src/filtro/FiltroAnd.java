package filtro;

import java.util.ArrayList;
import java.util.List;

import proyecto.Proyecto;

public class FiltroAnd extends FiltroCompuesto  {

	public FiltroAnd() {
		this.filtros = new ArrayList<IFiltro>();
	}
	
	@Override
	public List<Proyecto> filter(List<Proyecto> proyectos) {
		List<Proyecto> resultados = proyectos;

		for(IFiltro filtros : this.getFiltros()) {
			resultados = filtros.filter(resultados);
		}

		return resultados;		
	}

}
