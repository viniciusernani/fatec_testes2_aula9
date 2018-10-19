package com.fatec.sce;

import com.fatec.sce.model.Livro;

import static org.junit.Assert.*;

import org.junit.Test;

public class UC01_CadastrarLivro {

	/**
	 * Objetivo - Cadastrar um livro com dados válidos
	**/
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	/**
	 * Objetivo - Cadastrar um livro com ISBN em branco
	**/
	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comISBNInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN inválido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - Cadastrar um livro com título em branco
	**/
	@Test
	public void CT03cadastrarLivroComTitulo_em_branco() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comTituloInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Título inválido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - Cadastrar um livro com autor em branco
	**/
	@Test
	public void CT04cadastrarLivroComAutor_em_branco() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comAutorInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor inválido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - Cadastrar um livro com ISBN nulo
	**/
	@Test
	public void CT05cadastrarLivroComISBN_nulo() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comISBNInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN inválido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - Cadastrar um livro com título nulo
	**/
	@Test
	public void CT06cadastrarLivroComTitulo_nulo() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comTituloInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Título inválido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - Cadastrar um livro com autor nulo
	**/
	@Test
	public void CT07cadastrarLivroComAutor_nulo() {
		try {
			//cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comAutorInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor inválido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - Cadastrar um livro e recuperar seu título
	**/
	@Test
	public void CT08pegarTituloLivro() {
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro.setIsbn("121212");
		umLivro.setTitulo("Engenharia de Software");
		umLivro.setAutor("Pressman");
		assertEquals("Engenharia de Software", umLivro.getTitulo());
	}
	
	/**
	 * Objetivo - Cadastrar um livro e recuperar seu autor
	**/
	@Test
	public void CT09pegarAutorLivro() {
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro.setIsbn("121212");
		umLivro.setTitulo("Engenharia de Software");
		umLivro.setAutor("Pressman");
		assertEquals("Pressman", umLivro.getAutor());
	}
	
	/**
	 * Objetivo - Cadastrar um livro e recuperar seu ISBN
	**/
	@Test
	public void CT10pegarISBNLivro() {
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro.setIsbn("121212");
		umLivro.setTitulo("Engenharia de Software");
		umLivro.setAutor("Pressman");
		assertEquals("121212", umLivro.getIsbn());
	}

}
