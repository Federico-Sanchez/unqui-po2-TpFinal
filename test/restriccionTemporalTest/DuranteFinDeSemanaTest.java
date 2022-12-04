package restriccionTemporalTest;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import restriccionTemporal.DuranteFinDeSemana;

class DuranteFinDeSemanaTest {
	private DuranteFinDeSemana restriccionDuranteFinDeSemana;

	@BeforeEach
	void setUp() throws Exception {
		restriccionDuranteFinDeSemana = new DuranteFinDeSemana();
	}

	@Test
	void testEsDiferenteAFinDeSemana() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String stringFecha = "2022-12-02";
		Date fecha = sdf.parse(stringFecha);
		
		boolean resultado = restriccionDuranteFinDeSemana.esRestriccion(fecha);
		assertFalse(resultado);
	}

}
