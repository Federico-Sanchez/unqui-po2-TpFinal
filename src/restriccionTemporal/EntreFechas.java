package restriccionTemporal;

import java.util.Date;

import muestra.Muestra;



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


	@Override
	protected boolean estaEnFecha(Muestra muestra) {
		// TODO Auto-generated method stub
		return false;
	}
}