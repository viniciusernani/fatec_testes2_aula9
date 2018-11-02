package com.fatec.sce;

import com.fatec.sce.model.Emprestimo;
import com.fatec.sce.model.Livro;
import com.fatec.sce.model.Usuario;
import com.fatec.sce.servico.ServicoEmprestimo;

public class ObtemEmprestimo {
	
	public static Emprestimo comDadosValidos() {
		Livro livro = ObtemLivro.comDadosValidos();
		Usuario aluno = ObtemUsuario.comDadosValidos();
		ServicoEmprestimo servico = new ServicoEmprestimo();
		return servico.empresta(livro, aluno);
	}
	
	public static Emprestimo comDadosInvalidosLivro() {
		Livro livro = null;
		Usuario aluno = ObtemUsuario.comDadosValidos();
		ServicoEmprestimo servico = new ServicoEmprestimo();
		return servico.empresta(livro, aluno);
	}
	
	public static Emprestimo comDadosInvalidosUsuario() {
		Livro livro = ObtemLivro.comDadosValidos();
		Usuario aluno = null;
		ServicoEmprestimo servico = new ServicoEmprestimo();
		return servico.empresta(livro, aluno);
	}

	public static Emprestimo comLivroInvalido_nulo() {
		Livro livro = null;
		Usuario aluno = ObtemUsuario.comDadosValidos();
		ServicoEmprestimo servico = new ServicoEmprestimo();
		Emprestimo emp = new Emprestimo();
		emp.setLivro(livro);
		emp.setUsuario(aluno);
		emp.setDataEmprestimo("2018/11/01");
		emp.setDataDevolucao("2018/11/08");
		return servico.empresta(livro,aluno);
	}
	
	public static Emprestimo comUsuarioInvalido_nulo() {
		Livro livro = ObtemLivro.comDadosValidos();
		Usuario aluno = null;
		ServicoEmprestimo servico = new ServicoEmprestimo();
		Emprestimo emp = new Emprestimo();
		emp.setLivro(livro);
		emp.setUsuario(aluno);
		emp.setDataEmprestimo("2018/11/01");
		emp.setDataDevolucao("2018/11/08");
		return servico.empresta(livro,aluno);
	}
	
}
