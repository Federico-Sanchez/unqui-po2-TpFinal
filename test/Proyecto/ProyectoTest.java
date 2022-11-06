package Proyecto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import muestra.Muestra;
import proyecto.Proyecto;

class ProyectoTest {

	Proyecto proyecto;
	
	Muestra muestraMock1;
	
	@BeforeEach
	void setUp() {
		
		proyecto = new Proyecto("1", "descripcion", null);
		
		muestraMock1 = mock(Muestra.class);

	}

	@Test
	void agregarMuestraAProyecto() {
		proyecto.agregarMuestra(muestraMock1);
		
		assertEquals(proyecto.getMuestras().size(), 1);
	}
	
}
