package com.fatec.sce;

import com.fatec.sce.model.Livro;
import com.fatec.sce.model.Usuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class UC05_CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario usuario = new Usuario();
			// acao
			usuario = ObtemUsuario.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02CadastrarUsuarioComRaInvalido() {
		try {
			// cenario
			Usuario usuario = new Usuario();
			// acao
			usuario = ObtemUsuario.comRaInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA inválido", e.getMessage());
		}
	}

	@Test
	public void CT03CadastrarUsuarioComNomeInvalido() {
		try {
			// cenario
			Usuario usuario = new Usuario();
			// acao
			usuario = ObtemUsuario.comNomeInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome inválido", e.getMessage());
		}
	}

	@Test
	public void CT04CadastrarUsuarioComRaNulo() {
		try {
			// cenario
			Usuario usuario = new Usuario();
			// acao
			usuario = ObtemUsuario.comRaInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA inválido", e.getMessage());
		}
	}

	@Test
	public void CT05CadastrarUsuarioComNomeNulo() {
		try {
			// cenario
			Usuario usuario = new Usuario();
			// acao
			usuario = ObtemUsuario.comNomeInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome inválido", e.getMessage());
		}
	}

	@Test
	public void CT06pegarRaUsuario() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario = ObtemUsuario.comDadosValidos();
		assertEquals("121212", usuario.getRa());
	}

	@Test
	public void CT07pegarNomeUsuario() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario = ObtemUsuario.comDadosValidos();
		assertEquals("Augustus Outubrus", usuario.getNome());
	}
	
	@Test
	public void CT08compararUsuariosIdenticos() {
		// cenario
		Usuario usuario1 = new Usuario();
		// acao
		usuario1 = ObtemUsuario.comDadosValidos();
		assertTrue(usuario1.equals(usuario1));
	}
	
	@Test
	public void CT09compararUsuariosIguais() {
		// cenario
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		// acao
		usuario1 = ObtemUsuario.comDadosValidos();
		usuario2 = ObtemUsuario.comDadosValidos();
		assertTrue(usuario1.equals(usuario2));
	}
	
	@Test
	public void CT10compararUsuariosDiferentes() {
		// cenario
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		// acao
		usuario1 = ObtemUsuario.comDadosValidos();
		usuario2 = ObtemUsuario.comDadosValidos();
		usuario2.setNome("Octavius Romanus");
		
		assertFalse(usuario1.equals(usuario2));
	}
	
	@Test
	public void CT11compararUsuarios_comNulo() {
		// cenario
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		// acao
		usuario1 = ObtemUsuario.comDadosValidos();
		usuario2 = null;
		
		assertFalse(usuario1.equals(usuario2));
	}
	
	@Test
	public void CT12compararUsuarios_classesDistintas() {
		// cenario
		Usuario usuario1 = new Usuario();
		Livro usuario2 = new Livro();
		
		// acao
		usuario1 = ObtemUsuario.comDadosValidos();
		usuario2 = ObtemLivro.comDadosValidos();
		
		assertFalse(usuario1.equals(usuario2));
	}
	
//	@Test
//	public void CT13compararUsuarios_nomesNulos() {
//		// cenario
//		Usuario usuario1 = new Usuario();
//		Usuario usuario2 = new Usuario();
//		// acao
//		usuario1 = ObtemUsuario.comNomeInvalido_nulo();
//		usuario2 = ObtemUsuario.comNomeInvalido_nulo();
//		assertTrue(usuario1.equals(usuario2));
//	}
	
//	@Test
//	public void CT14compararUsuarios_comparaNomeNuloComNaoNulo() {
//		// cenario
//		Usuario usuario1 = new Usuario();
//		Usuario usuario2 = new Usuario();
//		// acao
//		usuario1 = ObtemUsuario.comNomeInvalido_nulo();
//		usuario2 = ObtemUsuario.comDadosValidos();
//		assertFalse(usuario1.equals(usuario2));
//	}
	
//	@Test
//	public void CT15compararUsuarios_raNulos() {
//		// cenario
//		Usuario usuario1 = new Usuario();
//		Usuario usuario2 = new Usuario();
//		// acao
//		usuario1 = ObtemUsuario.comRaInvalido_nulo();
//		usuario2 = ObtemUsuario.comRaInvalido_nulo();
//		assertTrue(usuario1.equals(usuario2));
//	}
	
//	@Test
//	public void CT16compararUsuarios_comparaRaNuloComNaoNulo() {
//		// cenario
//		Usuario usuario1 = new Usuario();
//		Usuario usuario2 = new Usuario();
//		// acao
//		usuario1 = ObtemUsuario.comRaInvalido_nulo();
//		usuario2 = ObtemUsuario.comDadosValidos();
//		assertFalse(usuario1.equals(usuario2));
//	}

}
