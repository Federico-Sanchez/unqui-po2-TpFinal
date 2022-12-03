package restriccionTemporal;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import desafio.EntreFechas;


class EntreFechasTest {
	private EntreFechas restriccionEntreFechas;
	private Date fecha;
	
	
	@BeforeEach
	void setUp() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String stringFechaUno = "2014-01-05";
		Date fechaUno = sdf.parse(stringFechaUno);
		
		String stringFechaDos = "2024-01-05";
		Date fechaDos = sdf.parse(stringFechaDos);
		
		restriccionEntreFechas = new EntreFechas(fechaUno, fechaDos);
		fecha = new Date();
	}

	
	@Test
	void testEsRestriccionTemporal() {
		boolean resultado = restriccionEntreFechas.esRestriccion(fecha);
		
		assertTrue(resultado);
	}
}
