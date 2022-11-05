package desafio;


public class Desafio {
	private Area area;
	private RestriccionTemporal restriccion;
	private double cantidadDeMuestra;
	private int dificultad;
	private int recompensa;
	
	
	
	public Desafio(Area area, RestriccionTemporal restriccion, double cantidadDeMuestra, int dificultad, int recompensa) {
		super();
		this.area = area;
		this.restriccion = restriccion;
		this.cantidadDeMuestra = cantidadDeMuestra;
		this.dificultad = dificultad;
		this.recompensa = recompensa;
	}
}