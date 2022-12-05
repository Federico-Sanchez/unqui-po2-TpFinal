package desafioTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coordenada.Coordenada;
import desafio.Area;
import desafio.Desafio;
import desafio.DesafioUsuario;
import muestra.Muestra;
import restriccionTemporal.RestriccionTemporal;
import usuario.Usuario;

public class DesafioUsuarioTest {
	
	Desafio desafio;
	DesafioUsuario desafioUsuario;
	Area area;
	RestriccionTemporal restriccionMock;
	Usuario usuarioMock;
	Muestra muestraMock;
	Coordenada coordenada;
	Date date;
	
	@BeforeEach
	void setup() throws Exception {
		
		date = new Date();
		coordenada = new Coordenada(2, 2);
		area = new Area(coordenada, 5);
		restriccionMock = mock(RestriccionTemporal.class);
		usuarioMock = mock(Usuario.class);
		muestraMock = new Muestra(coordenada, usuarioMock, date);
		
		desafio = new Desafio(area, restriccionMock, 2, 5, 10);
		desafioUsuario = new DesafioUsuario(desafio, usuarioMock);
		
	}
	
	@Test
	void unaDesafioIniciaEnEstadoIncompleto() {
		assertFalse(desafioUsuario.estaCompletado());
		assertEquals(desafioUsuario.getPorcentajeDeCompletitud(), 0);
		desafioUsuario.votar(5);
		assertEquals(desafioUsuario.getVoto(), 0);
	}
	
	@Test
	void unDesafioIncompletoPuedeAgregarUnaMuestraCompatible() {
		
		when(desafioUsuario.esCompatibleCon(muestraMock)).thenReturn(true);
		desafioUsuario.nuevaMuestra(muestraMock);

		assertEquals(desafioUsuario.getMuestrasRecolectadas(), 1);
	}
	
	@Test
	void unDesafioIncompletoNoAgregarUnaMuestraIncompatible() {
		
		when(desafioUsuario.esCompatibleCon(muestraMock)).thenReturn(false);
		desafioUsuario.nuevaMuestra(muestraMock);

		assertEquals(desafioUsuario.getMuestrasRecolectadas(), 0);
	}
	
	@Test
	void unDesafioSePuedeCompletar() {
		
		when(desafioUsuario.esCompatibleCon(muestraMock)).thenReturn(true);
		
		desafioUsuario.nuevaMuestra(muestraMock);
		desafioUsuario.nuevaMuestra(muestraMock);
		
		assertTrue(desafioUsuario.estaCompletado());
		assertEquals(desafioUsuario.getPorcentajeDeCompletitud(), 100);
		assertEquals(desafioUsuario.getMomentoSuperado(), new Date());
	}
	
	@Test
	void unUsuarioPuedeVotarSobreUnDesafioCompleto() {
		
		when(desafioUsuario.esCompatibleCon(muestraMock)).thenReturn(true);

		desafioUsuario.nuevaMuestra(muestraMock);
		desafioUsuario.nuevaMuestra(muestraMock);

		desafioUsuario.votar(4);
		
		assertEquals(desafioUsuario.getVoto(), 4);
	}
	
}