package muestraTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coordenada.Coordenada;
import desafio.GestorDesafio;
import muestra.Muestra;
import usuario.Favorito;
import usuario.PerfilUsuario;
import usuario.Recomendacion;
import usuario.Usuario;

public class MuestraTest {
	
	
	Coordenada coordenada;
	Usuario usuario;
	Date dia;
	PerfilUsuario perfil;
	Recomendacion favoritos;
	GestorDesafio gestorDesafio;
	Muestra muestra;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		
		gestorDesafio = new GestorDesafio();
		favoritos = new Favorito();
		perfil = new PerfilUsuario(4, 20, 10);
		coordenada = new Coordenada(5,10);
		usuario = new Usuario("Jose", null, null, null);
		dia = new Date(122,5,3,18,0,0);
		
		
		muestra = new Muestra(coordenada,usuario,dia);
	}
	
	
	@Test
	void testMuestra() {
		
		assertEquals(usuario,muestra.getUsuario());
		assertEquals(coordenada,muestra.getCoordenadaGeografica());
		assertEquals(18,muestra.getSoloHora());
		assertEquals(0,muestra.getSoloMinutos());
		assertEquals("18:0",muestra.getHoraYMinutos());
	}
}
