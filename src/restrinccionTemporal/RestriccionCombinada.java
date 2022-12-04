package restrinccionTemporal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import muestra.Muestra;

public class RestriccionCombinada extends RestriccionTemporal {
	List<RestriccionTemporal> restricciones = new ArrayList<RestriccionTemporal>();
	


	public List<RestriccionTemporal> getRestricciones() {
		return restricciones;
	}
	
	
	public void agregarRestriccion(RestriccionTemporal restriccion) {
		this.getRestricciones().add(restriccion);
	}
	

	public void eliminarRestriccion(RestriccionTemporal restriccion) {
		this.getRestricciones().remove(restriccion);
	}
	
	
	@Override
	public boolean esRestriccion(Date fecha) {
		int cantidadDeRestricciones = 0;
		
		while (this.getRestricciones().size() > 0) {
			if (this.getRestricciones().get(0).esRestriccion(fecha)) {
				this.getRestricciones().remove(0);
				cantidadDeRestricciones =+ 1;
			}
			return (cantidadDeRestricciones > 0);
		}
		
		return (cantidadDeRestricciones > 0);
	}


	@Override
	protected boolean estaEnFecha(Muestra muestra) {
		// TODO Auto-generated method stub
		return false;
	}
	

}