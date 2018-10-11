package com.fatec.sce;

import com.fatec.sce.model.Livro;

import static org.junit.Assert.*;

import org.junit.Test;

public class UC01_CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		// cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT03cadastrarLivroComTitulo_em_branco() {
		// cenario
		Livro livro = new Livro();
		
		livro.setIsbn("123123");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setTitulo("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Título inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT04cadastrarLivroComAutor_em_branco() {
		// cenario
		Livro livro = new Livro();
		
		livro.setIsbn("123123");
		livro.setTitulo("Engenharia de Software");
		try {
			// acao
			livro.setAutor("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT05cadastrarLivroComISBN_nulo() {
		// cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT06cadastrarLivroComTitulo_nulo() {
		// cenario
		Livro livro = new Livro();
		
		livro.setIsbn("123123");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setTitulo(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Título inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT07cadastrarLivroComAutor_nulo() {
		// cenario
		Livro livro = new Livro();
		
		livro.setIsbn("123123");
		livro.setTitulo("Engenharia de Software");
		try {
			// acao
			livro.setAutor(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor inválido", e.getMessage());
		}
	}
	
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
