package filtro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import proyecto.Proyecto;

class FiltroIncluirCategoriasTest {
	private IFiltro filtroIncluirCategorias;
	
	private Proyecto proyecto1;
	
	private String texto1;
	private String texto3;
	
	//De Filtro
	private List<String> categorias = new ArrayList<String>();
	private String textoParaCategoria;
	
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();
	
	
	private List<String> categoriasParaProyecto = new ArrayList<String>();
	private String textoParaCategoriaProyecto;

	@BeforeEach
	void setUp() throws Exception {
		texto1 = "Arbol";
		
		filtroIncluirCategorias = new FiltroIncluirCategorias(categorias);
		
		proyecto1 = new Proyecto(texto1, texto3, categoriasParaProyecto);
		
		//Para Filtro
		textoParaCategoria = "a";
		categorias.add(textoParaCategoria);
		//Aca termina
		
		proyectos.add(proyecto1);
		
		
		textoParaCategoriaProyecto = "a";
		categoriasParaProyecto.add(textoParaCategoriaProyecto);
		
	}

	@Test
	void test() {
		List<Proyecto> resultado = filtroIncluirCategorias.filter(proyectos);
		
		assertEquals(0, resultado.size());
		//assertTrue(resultado.contains(proyecto1));
//		assertEquals(1, categorias.size());
//		assertTrue(categorias.contains("a"));
//		assertEquals(1, categoriasParaProyecto.size());
//		assertTrue(categoriasParaProyecto.contains("a"));
	}
	
}
