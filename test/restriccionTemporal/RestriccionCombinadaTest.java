package restriccionTemporal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import desafio.DuranteFinDeSemana;
import desafio.DuranteSemana;
import desafio.RestriccionCombinada;
import desafio.RestriccionTemporal;

class RestriccionCombinadaTest {
	private RestriccionCombinada restriccionCombinada;
	private @Mock RestriccionTemporal restriccion1;
	private @Mock RestriccionTemporal restriccion2;
	private @Mock RestriccionTemporal restriccion3;
	private @Mock Date fecha;

	@BeforeEach
	void setUp() throws Exception {
		this.restriccionCombinada = new RestriccionCombinada();
		restriccion1 = mock(RestriccionCombinada.class);
		restriccion2 = mock(RestriccionCombinada.class);
		restriccion3 = mock(RestriccionCombinada.class);
		fecha =  mock(Date.class);
	}
	
	
	@Test
	void testConstructor() {
		assertNotNull(this.restriccionCombinada);
	}
	
	
	@Test
	void testAgregarUnaRestriccion() {
		this.restriccionCombinada.agregarRestriccion(this.restriccion1);
		assertEquals(1, this.restriccionCombinada.getRestricciones().size());
	}
	
	
	@Test
	void testEliminarUnaRestriccion() {
		this.restriccionCombinada.agregarRestriccion(this.restriccion1);
		this.restriccionCombinada.agregarRestriccion(this.restriccion1);
		this.restriccionCombinada.eliminarRestriccion(this.restriccion1);
		assertEquals(1, this.restriccionCombinada.getRestricciones().size());
	}
	
	
	@Test
	void testTieneRestriccionQueCumpla() {
		when(restriccion1.esRestriccion(fecha)).thenReturn(true);
		when(restriccion2.esRestriccion(fecha)).thenReturn(true);
		when(restriccion3.esRestriccion(fecha)).thenReturn(false);
		this.restriccionCombinada.agregarRestriccion(this.restriccion1);
		this.restriccionCombinada.agregarRestriccion(this.restriccion2);
		this.restriccionCombinada.agregarRestriccion(this.restriccion3);
		boolean resultado = this.restriccionCombinada.esRestriccion(fecha);
		assertTrue(resultado);
	}

}

