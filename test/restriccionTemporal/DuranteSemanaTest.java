package restriccionTemporal;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuranteSemanaTest {
	private DuranteSemana restriccionDuranteSemana;
	

	@BeforeEach
	void setUp() throws Exception {
		restriccionDuranteSemana = new DuranteSemana();
		
	}

	@Test
	void testEsDiaDeLaSemana() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String stringFecha = "2022-12-02";
		Date fecha = sdf.parse(stringFecha);
		
	
		boolean resultado = restriccionDuranteSemana.esRestriccion(fecha);
		assertTrue(resultado);
	}

}
