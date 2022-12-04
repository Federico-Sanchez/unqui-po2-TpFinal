package restrinccionTemporal;

import java.text.SimpleDateFormat;
import java.util.Date;

import muestra.Muestra;

public abstract class RestriccionTemporal {

public abstract boolean esRestriccion(Date fecha);
	
	public SimpleDateFormat formatoDia() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE"); //Formato para tomar el día
		return sdf;
	}


	protected abstract boolean estaEnFecha(Muestra muestra);
}