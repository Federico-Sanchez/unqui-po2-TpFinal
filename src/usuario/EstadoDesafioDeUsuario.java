package usuario;

public interface EstadoDesafioDeUsuario {
	
	public boolean estaCompleto();
	
	public float getPorcentajeDeCompletitud(DesafioDeUsuario desafioDeUsuario);
}