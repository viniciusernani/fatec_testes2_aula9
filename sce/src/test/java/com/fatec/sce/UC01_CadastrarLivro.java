package com.fatec.sce;

import com.fatec.sce.model.Livro;

import static org.junit.Assert.*;

import org.junit.Test;

public class UC01_CadastrarLivro {

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
