package desafioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coordenada.Coordenada;
import desafio.Area;

public class AreaTest {
	
	Area area;
	Coordenada coordenada;

	@BeforeEach
	public void setup() throws Exception {
		this.coordenada = new Coordenada(12, 13);
		this.area = new Area(coordenada, 5);
	}
	
	@Test
	void testGetRadio() {
		assertEquals(area.getRadio(), 5);
	}
	
	@Test
	void testGetCoordenada() {
		assertEquals(area.getCoordenada().getLatitud(), 12);
	}

}
