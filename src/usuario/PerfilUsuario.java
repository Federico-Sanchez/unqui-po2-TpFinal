package usuario;


public class PerfilUsuario {
	private int cantidadDeMuestrasARecolectar;
	private int dificultad;
	private int recompensa;
	
	
	
	public PerfilUsuario(int  cantidadDeMuestrasARecolectar,int dificultad,int recompensa) {
		this.cantidadDeMuestrasARecolectar = cantidadDeMuestrasARecolectar;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
	}
	

	
	
	public int getCantidadDeMuestrasARecolectar() {
		return cantidadDeMuestrasARecolectar;
	}
	
	
	public int getDificultad() {
		return dificultad;
	}
	
	
	public int getRecompensa() {
		return recompensa;
	}




	public void setCantidadDeMuestrasARecolectar(int cantidadDeMuestrasARecolectar) {
		this.cantidadDeMuestrasARecolectar = cantidadDeMuestrasARecolectar;
	}




	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}




	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}
	
	
	
	
	
}
