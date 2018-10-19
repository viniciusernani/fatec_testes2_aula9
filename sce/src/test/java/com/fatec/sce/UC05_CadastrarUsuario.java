package com.fatec.sce;

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

}
