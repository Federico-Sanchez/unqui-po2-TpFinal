package filtro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import proyecto.Proyecto;

public class FiltroOr extends FiltroCompuesto {


	@Override
	public List<Proyecto> filter(List<Proyecto> proyectos) {
		
		List<Proyecto> resultados = new ArrayList<Proyecto>();
		
		for (IFiltro filtro : this.getFiltros()) {
			List<Proyecto> newest = filtro
					.filter(proyectos)
					.stream()
					.filter(proyecto -> !resultados.contains(proyecto))
					.collect(Collectors.toList());
			
			resultados.addAll(newest);
		}
		
		return resultados;
	}
	
}
