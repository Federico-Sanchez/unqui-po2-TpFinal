package desafioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio.Area;
import desafio.Desafio;
import restriccionTemporal.RestriccionTemporal;

public class DesafioTest {
	
	Desafio desafio;
	Area areaMock;
	RestriccionTemporal restriccionMock;

	@BeforeEach
	void setup() throws Exception {
		
		areaMock = mock(Area.class);
		restriccionMock = mock(RestriccionTemporal.class);
		
		this.desafio = new Desafio(areaMock, restriccionMock, 12, 5, 10);
	}
	
	@Test
	void testObtenerData() {
		assertEquals(desafio.getCantidadDeMuestra(), 12);
		assertEquals(desafio.getDificultad(), 5);
		assertEquals(desafio.getRecompensa(), 10);
	}
	
}