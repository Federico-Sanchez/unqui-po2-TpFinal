package duranteFinDeSemana;

import java.util.Date;

import restriccionTemporal.RestriccionTemporal;

public class DuranteFinDeSemana extends RestriccionTemporal {

	@Override
	public boolean esRestriccion(Date fecha) {
		if (formatoDia().format(fecha) == "dom" || formatoDia().format(fecha) == "sáb") {
			return true;
		} else {
			return false;
		}
	}
}
