package restrinccionTemporal;

import java.util.Date;

import muestra.Muestra;

public class DuranteSemana extends RestriccionTemporal {
	@Override
	public boolean esRestriccion(Date fecha) {
		if (formatoDia().format(fecha) == "dom" || formatoDia().format(fecha) == "sáb") {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected boolean estaEnFecha(Muestra muestra) {
		// TODO Auto-generated method stub
		return false;
	}
}