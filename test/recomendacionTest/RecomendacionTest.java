package recomendacionTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio.Area;
import desafio.Desafio;
import desafio.DesafioUsuario;
import desafio.GestorDesafio;
import restriccionTemporal.RestriccionTemporal;
import usuario.Favorito;
import usuario.PerfilUsuario;
import usuario.PreferenciasEnJuego;
import usuario.Recomendacion;
import usuario.Usuario;

public class RecomendacionTest {
	
	Recomendacion favoritos;
	Recomendacion preferenciaEnJuego;
	Desafio desafio1;
	Desafio desafio2;
	Desafio desafio3;
	Desafio desafio4;
	Desafio desafio5;
	Desafio desafio6;
	DesafioUsuario desafioDeUsuario;
	Usuario usuario;
	PerfilUsuario perfil;
	Area area;
	RestriccionTemporal restriccion;
	GestorDesafio gestor;
	
	
	
	@BeforeEach
	void setUp() {
		
		favoritos = new Favorito();
		preferenciaEnJuego = new PreferenciasEnJuego();
		gestor = new GestorDesafio();
		area = mock(Area.class);
		restriccion = mock(RestriccionTemporal.class);
		
		perfil = new PerfilUsuario(4, 20, 10);
		usuario = new Usuario("Juan",perfil,favoritos,gestor);

		desafio1 = new Desafio(area, restriccion, 4, 4, 10);
		desafio2 = new Desafio(area, restriccion, 10, 2, 20);
		desafio3 = new Desafio(area, restriccion, 20, 5, 40);
		desafio4 = new Desafio(area, restriccion, 14, 4, 10);
		desafio5 = new Desafio(area, restriccion, 10, 3, 20);
		desafio6 = new Desafio(area, restriccion, 26, 4, 40);
		
		desafioDeUsuario = new DesafioUsuario( 0, desafio4, usuario);

		usuario.agregarDesafio(desafioDeUsuario);
	}
	
	
	@Test
	void testEstrategiaDeSeleccionFavoritosEligePorCoincidenciaDelDesafioDeUsuarioConMayorPuntaje() {
		int distEntre = favoritos.coincidenciaDesafio(desafio1, usuario);

		assertEquals(3, distEntre);
	}
	
	@Test
	void testEstrategiaDeSeleccionPreferenciaDeJuegoEligePorCoincidenciaDeLaPreferenciaDelUsuario() {
		int distEntre = preferenciaEnJuego.coincidenciaDesafio(desafio1, usuario);
		
		assertEquals(-16, distEntre);
		
	}

	@Test
	void testEstrategiaDeSeleccionFavoritosEligeDesafiosParaElUsuario() {
		List<Desafio> desafios = Arrays.asList(desafio1, desafio2, desafio3, desafio4, desafio5, desafio6);

		List<Desafio> desafiosParaUsuario = favoritos.recomendarDesafios(desafios, usuario);

		assertFalse(desafiosParaUsuario.contains(desafio6));
	}

	@Test
	void testEstrategiaDeSeleccionPreferenciaDeJuegoEligeDesafiosParaElUsuario() {
		List<Desafio> desafios = Arrays.asList(desafio1, desafio2, desafio3, desafio4, desafio5, desafio6);

		List<Desafio> desafiosParaUsuario = preferenciaEnJuego.recomendarDesafios(desafios, usuario);
		
		assertFalse(desafiosParaUsuario.contains(desafio6));
	}

}
