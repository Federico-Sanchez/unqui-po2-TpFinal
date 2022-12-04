package sistemaTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filtro.FiltroIncluirTexto;
import proyecto.Proyecto;
import sistema.Sistema;

import static org.mockito.Mockito.*;

public class SistemaTest {
	
	Sistema sistema;
	Proyecto proyectoMock1;
	Proyecto proyectoMock2;
	Proyecto proyectoMock3;

	@BeforeEach
	public void setup() throws Exception {
		
		ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
		proyectoMock1 = mock(Proyecto.class);
		proyectoMock2 = mock(Proyecto.class);
		proyectoMock3 = mock(Proyecto.class);
		
		proyectos.add(proyectoMock1);
		proyectos.add(proyectoMock2);
		
		this.sistema = new Sistema(proyectos);
	}
	
	@Test
	void testAgregarProyecto() {
		
		sistema.agregarProyecto(proyectoMock3);
		
		assertEquals(sistema.getProyectos().size(), 3);
	}
	
	@Test
	void testBuscarProyecto() {
		
		when(proyectoMock3.tieneElTextoEnElTitulo("Tierra")).thenReturn(true);
		sistema.agregarProyecto(proyectoMock3);
		
		assertTrue(sistema.buscar(new FiltroIncluirTexto("Tierra")).contains(proyectoMock3));
	}
	
}
