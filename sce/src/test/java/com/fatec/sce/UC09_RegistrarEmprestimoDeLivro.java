package com.fatec.sce;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import org.junit.runner.Result;

import com.fatec.sce.model.Emprestimo;
import com.fatec.sce.model.Livro;
import com.fatec.sce.model.Usuario;
import com.fatec.sce.servico.ServicoEmprestimo;

public class UC09_RegistrarEmprestimoDeLivro {
	static private Livro livro;
	static private Usuario usuario;
	static private ServicoEmprestimo servico;

	@Test
	public void CT01RegistraEmprestimoDeLivro_com_sucesso() {
		// cenario
		livro = ObtemLivro.comDadosValidos();
		usuario = ObtemUsuario.comDadosValidos();
		servico = new ServicoEmprestimo();
		// acao
		Emprestimo resultadoEsperado = servico.empresta(livro, usuario);
		// verificação
		assertNotNull(resultadoEsperado);
	}

	@Test
	public void CT02RegistraEmprestimoDeLivro_com_sucesso() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		emprestimo = ObtemEmprestimo.comDadosValidos();
		// verificação
		assertNotNull(emprestimo);
	}

	@Test
	public void CT03UC01FB_registra_emprestimo_com_sucesso_validacao_da_data() {
		// cenario
		DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY/MM/dd");
		String dataEsperada = new DateTime().plusDays(8).toString(fmt);
		ServicoEmprestimo servico = null;
		// acao
		Emprestimo emprestimo = ObtemEmprestimo.comDadosValidos();
		String dataObtida = emprestimo.getDataDevolucao();
		// verificacao
		assertTrue(dataEsperada.equals(dataObtida));
	}
	
	@Test
	public void CT04RegistraEmprestimoDeLivro_LivroNulo() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		try {
			emprestimo = ObtemEmprestimo.comLivroInvalido_nulo();
		} catch (Exception e) {
			// verificação
			assertEquals("Dados invalidos.", e.getMessage());
		}
		
	}
	
	@Test
	public void CT05RegistraEmprestimoDeLivro_UsuarioNulo() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		try {
			emprestimo = ObtemEmprestimo.comUsuarioInvalido_nulo();
		} catch (Exception e) {
			// verificação
			assertEquals("Dados invalidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT06RegistraEmprestimoDeLivro_DataEmprestimoInvalida() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		try {
			emprestimo = ObtemEmprestimo.comDadosValidos();
			emprestimo.setDataEmprestimo("20181101");
		} catch (Exception e) {
			// verificação
			assertEquals("Data invalida.", e.getMessage());
		}
	}
	
	@Test
	public void CT07RegistraEmprestimoDeLivro_DataDevolucaoInvalida() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		try {
			emprestimo = ObtemEmprestimo.comDadosValidos();
			emprestimo.setDataEmprestimo("20181108");
		} catch (Exception e) {
			// verificação
			assertEquals("Data invalida.", e.getMessage());
		}
	}
	
	@Test
	public void CT08RegistraEmprestimoDeLivro_DadosInvalidos_Livro() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		try {
			emprestimo = ObtemEmprestimo.comDadosInvalidosLivro();
		} catch (Exception e) {
			// verificação
			assertEquals("Dados inválidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT09RegistraEmprestimoDeLivro_DadosInvalidos_Usuario() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		try {
			emprestimo = ObtemEmprestimo.comDadosInvalidosUsuario();
		} catch (Exception e) {
			// verificação
			assertEquals("Dados inválidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT10PegaUsuarioEmprestimo() {
		// cenario
		livro = ObtemLivro.comDadosValidos();
		usuario = ObtemUsuario.comDadosValidos();
		servico = new ServicoEmprestimo();
		// acao
		Emprestimo resultadoEsperado = servico.empresta(livro, usuario);
		// verificação
		assertEquals(usuario,resultadoEsperado.getUsuario());
	}
	
	@Test
	public void CT11PegaUsuarioEmprestimo() {
		// cenario
		livro = ObtemLivro.comDadosValidos();
		usuario = ObtemUsuario.comDadosValidos();
		servico = new ServicoEmprestimo();
		// acao
		Emprestimo resultadoEsperado = servico.empresta(livro, usuario);
		// verificação
		assertEquals(livro,resultadoEsperado.getLivro());
	}
}