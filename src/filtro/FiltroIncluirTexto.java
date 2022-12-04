package filtro;

import java.util.List;
import java.util.stream.Collectors;
import proyecto.Proyecto;

public class FiltroIncluirTexto implements IFiltro {
	
	private String texto;

	public FiltroIncluirTexto(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public List<Proyecto> filter(List<Proyecto> proyectos) {
		return proyectos.stream()
				.filter(proyecto -> proyecto.tieneElTextoEnElTitulo(this.getTexto()))
				.collect(Collectors.toList());
	}

}