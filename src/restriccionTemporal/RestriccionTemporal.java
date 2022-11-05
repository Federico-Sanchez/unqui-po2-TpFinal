package restriccionTemporal;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class RestriccionTemporal {

	
	public abstract boolean esRestriccion(Date fecha);
	
	
	public SimpleDateFormat formatoDia() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE"); //Formato para tomar el día
		return sdf;
	}
}