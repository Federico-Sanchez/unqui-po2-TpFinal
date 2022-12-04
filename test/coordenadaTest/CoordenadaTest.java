package coordenadaTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coordenada.Coordenada;
import desafio.Area;

public class CoordenadaTest {
	
	Coordenada coordenada;
	Coordenada coordenada2;
	Area area;

	@BeforeEach
	public void setup() throws Exception {
		this.coordenada = new Coordenada(12, 13);
		this.coordenada2 = new Coordenada(20, 20);
		this.area = new Area(coordenada, 5);
	}
	
	@Test
	void testGetLatitud() {
		assertEquals(coordenada.getLatitud(), 12);
	}
	
	@Test
	void testGetLongitud() {
		assertEquals(coordenada.getLongitud(), 13);
	}

	@Test
	void testEstaDentroDelArea() {
		assertTrue(coordenada.estaDentroDelArea(area));
	}
	
	@Test
	void testEstaFueraDelArea() {
		assertFalse(coordenada2.estaDentroDelArea(area));
	}
}
