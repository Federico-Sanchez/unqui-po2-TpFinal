package entreFechas;

import java.util.Date;

import restriccionTemporal.RestriccionTemporal;

public class EntreFechas extends RestriccionTemporal {
	private Date fechaInicio;
	private Date fechaDeFin;
	
	
	
	public EntreFechas(Date fechaInicio, Date fechaDeFin) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaDeFin = fechaDeFin;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public Date getFechaDeFin() {
		return fechaDeFin;
	}

	
	@Override
	public boolean esRestriccion(Date fecha) {
		if (fecha.after(this.getFechaInicio()) && fecha.before(this.getFechaDeFin())) {
			return true;
		} else {
			return false;
		}
	}
}