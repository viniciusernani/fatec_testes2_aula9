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
			usuario.setRa("121212");
			usuario.setNome("Orestes Quércia");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComRaInvalido() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario.setNome("Orestes Quércia");
		
		try {
			usuario.setRa("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComNomeInvalido() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario.setRa("123123");
		
		try {
			usuario.setNome("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComRaNulo() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario.setNome("Orestes Quércia");
		
		try {
			usuario.setRa(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComNomeNulo() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario.setRa("123123");
		
		try {
			usuario.setNome(null);
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
		usuario.setRa("121212");
		usuario.setNome("Orestes Quércia");
		assertEquals("121212", usuario.getRa());
	}
	
	@Test
	public void CT07pegarNomeUsuario() {
		// cenario
		Usuario usuario = new Usuario();
		// acao
		usuario.setRa("121212");
		usuario.setNome("Orestes Quércia");
		assertEquals("Orestes Quércia", usuario.getNome());
	}

}
