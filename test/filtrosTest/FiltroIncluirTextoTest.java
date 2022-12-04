package filtro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import proyecto.Proyecto;


class FiltroIncluirTextoTest {
	private IFiltro filtroIncluirTexto;
	
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	
	private String texto1;
	private String texto2;
	private String texto3;
	
	private List<String> categorias = new ArrayList<String>();
	private String textoParaCategoria1;
	private String textoParaCategoria2;
	
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();

	@BeforeEach
	void setUp() throws Exception {
		texto1 = "Arbol";
		texto2 = "Raiz";
		
		filtroIncluirTexto = new FiltroIncluirTexto(texto1);
		
		proyecto1 = new Proyecto(texto1, texto3, categorias);
		proyecto2 = new Proyecto(texto2, texto3, categorias);
		
		
		categorias.add(textoParaCategoria1);
		categorias.add(textoParaCategoria2);
		
		
		proyectos.add(proyecto1);
		proyectos.add(proyecto2);
		
	}

	@Test
	void testFiltroIncluirTextoTieneUnProyecto() {
		List<Proyecto> resultado = filtroIncluirTexto.filter(proyectos);
		
		assertEquals(1, resultado.size());
	}
	
	
	@Test
	void testFiltroIncluirTextoContieneUnProyecto() {
		List<Proyecto> resultado = filtroIncluirTexto.filter(proyectos);
		
		assertTrue(resultado.contains(proyecto1));
	}
}
