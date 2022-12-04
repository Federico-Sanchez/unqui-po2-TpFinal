package desafio;

import java.util.Date;

public class DuranteSemana extends RestriccionTemporal {
	
	@Override
	public boolean esRestriccion(Date fecha) {
		if (!(formatoDia().format(fecha) == "dom" || formatoDia().format(fecha) == "sáb")) {
			return true;
		} else {
			return false;
		}
	}
}
