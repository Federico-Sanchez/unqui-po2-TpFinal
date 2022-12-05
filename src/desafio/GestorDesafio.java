package desafio;

import java.util.List;
import java.util.stream.Collectors;

public class GestorDesafio {

	public List<DesafioUsuario> desafiosCompletados(List<DesafioUsuario> desafios) {
		return desafios.stream().filter(desafio -> desafio.estaCompletado()).collect(Collectors.toList());
	}
	
	public int porcentajeDeCompletitud(List<DesafioUsuario> desafios) {
		return desafiosCompletados(desafios).size() / muestrasRequeridasTotales(desafios);
	}
	
	public int muestrasRequeridasTotales(List<DesafioUsuario> desafios) {
		return desafios.stream().mapToInt(desafio -> desafio.getDesafio().getCantidadDeMuestra()).sum();
	}

}
