package filtro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import proyecto.Proyecto;

class FiltroAndTest {
	private FiltroCompuesto filtroAnd;
	
	private IFiltro filtroIncluirTexto;
	
	private Proyecto proyecto1;
	private Proyecto proyecto2;
	private Proyecto proyecto3;
	
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
		texto3= "relleno";
		
		filtroIncluirTexto = new FiltroIncluirTexto(texto1);
		
		filtroAnd = new FiltroAnd();
		filtroAnd.addFilter(filtroIncluirTexto);
		
		proyecto1 = new Proyecto(texto1, texto3, categorias);
		proyecto2 = new Proyecto(texto2, texto3, categorias);
		proyecto3 = new Proyecto("Hoja", texto3, categorias);
		
		
		categorias.add(textoParaCategoria1);
		categorias.add(textoParaCategoria2);
		
		
		proyectos.add(proyecto1);
		proyectos.add(proyecto2);
		proyectos.add(proyecto3);
		
	}

	@Test
	void testFiltroCompuestoConANDPorTitulo() {
		List<Proyecto> resultado = filtroAnd.filter(proyectos);
		
		assertEquals(1, resultado.size());
	}

}