package usuarioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio.Area;
import desafio.Desafio;
import desafio.DesafioUsuario;
import desafio.GestorDesafio;
import muestra.Muestra;
import proyecto.Proyecto;
import restriccionTemporal.RestriccionTemporal;
import usuario.PerfilUsuario;
import usuario.Recomendacion;
import usuario.Usuario;

public class UsuarioTest {

	
	PerfilUsuario perfil;
	Recomendacion recomendacion;
	GestorDesafio gestorDesafio;
	Usuario usuario;
	Desafio desafio1;
	Desafio desafio2;
	Area area;
	RestriccionTemporal restriccion;
	Proyecto proyectoMock0;
	Proyecto proyectoMock1;
	DesafioUsuario desafioUsuario;
	DesafioUsuario desafioUsuario2;
	Muestra muestra;
	
	@BeforeEach
	void setUp() {
		
		desafio1 = mock(Desafio.class);
		desafio2 = mock (Desafio.class);
		desafioUsuario = mock(DesafioUsuario.class);
		desafioUsuario2 = mock(DesafioUsuario.class);
		gestorDesafio = new GestorDesafio();
        perfil = mock(PerfilUsuario.class);
        recomendacion = mock(Recomendacion.class);
		proyectoMock0 = mock(Proyecto.class);
		proyectoMock1 = mock(Proyecto.class);
		usuario =new Usuario("Jose", perfil, recomendacion, gestorDesafio);
		muestra = mock(Muestra.class);
		

	}
	
	
	@Test
	void testProyectosUsuario() {
		usuario.addProyecto(proyectoMock0);
		
		assertEquals(1,usuario.getProyectos().size());
		usuario.addProyecto(proyectoMock1);
		assertEquals(2,usuario.getProyectos().size());
		
		usuario.deleteProyecto(proyectoMock0);
		
		assertEquals(1,usuario.getProyectos().size());
	
	}
	
	@Test
	void testDesafioUsuario() {
		usuario.agregarDesafio(desafioUsuario);
		
		assertEquals(1,usuario.getDesafios().size());
		
		usuario.deleteDesafio(desafioUsuario);
		
		assertEquals(0,usuario.getDesafios().size());
		
	}
	
	@Test 
	void desafiosCompletados() {
		
		usuario.agregarDesafio(desafioUsuario);
		usuario.agregarDesafio(desafioUsuario2);
		
		
		assertEquals(0,usuario.desafiosCompletados().size());
				
	}
	
	@Test 
		void muestrasUsuario() {
		
		usuario.addMuestra(muestra);
	}
}
