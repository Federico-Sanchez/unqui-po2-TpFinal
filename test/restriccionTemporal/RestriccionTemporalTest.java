package restriccionTemporal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestriccionTemporalTest {
	private EntreFechas restriccionEntreFechas;
	private Date fecha;

	@BeforeEach
	void setUp() throws Exception {
		restriccionEntreFechas = mock(EntreFechas.class);
		fecha = mock(Date.class)
	}

	@Test
	void testEsRestriccionTemporal() {
		when(restriccionEntreFechas.esRestriccion(fecha)).thenReturn(true);
		
		boolean resultado = restriccionEntreFechas.esRestriccion(fecha);
		
		asserTrue(resultado);
	}

}
