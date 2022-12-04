package usuario;




public class PerfilUsuario {

	private int dificultad; 
    private int recompensa;
    private int cantidadDeMuestras;
    
    public PerfilUsuario(int unaDificultad , int unaRecompensa , int cantMuestras) {
    	setCantidadDeMuestras(cantMuestras);
    	setDificultad(unaDificultad);
    	setRecompensa(unaRecompensa);
    }
    
	public Integer getDificultad() {
		return dificultad;
	}
	public void setDificultad(Integer dificultad) {
		this.dificultad = dificultad;
	}
	public Integer getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(Integer recompensa) {
		this.recompensa = recompensa;
	}
	public Integer getCantidadDeMuestras() {
		return cantidadDeMuestras;
	}
	public void setCantidadDeMuestras(Integer cantidadDeMuestras) {
		this.cantidadDeMuestras = cantidadDeMuestras;
	} 
}