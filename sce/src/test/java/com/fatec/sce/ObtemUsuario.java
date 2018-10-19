package com.fatec.sce;

import com.fatec.sce.model.Usuario;

public class ObtemUsuario {
	public static Usuario comDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setRa("121212");
		usuario.setNome("Augustus Outubrus");
		return usuario;
	}

	public static Usuario comRaInvalido_branco() {
		Usuario usuario = new Usuario();
		usuario.setRa("");
		usuario.setNome("Augustus Outubrus");
		return usuario;
	}

	public static Usuario comRaInvalido_nulo() {
		Usuario usuario = new Usuario();
		usuario.setRa(null);
		usuario.setNome("Augustus Outubrus");
		return usuario;
	}
	
	public static Usuario comNomeInvalido_branco() {
		Usuario usuario = new Usuario();
		usuario.setRa("121212");
		usuario.setNome("");
		return usuario;
	}

	public static Usuario comNomeInvalido_nulo() {
		Usuario usuario = new Usuario();
		usuario.setRa("121212");
		usuario.setNome(null);
		return usuario;
	}
}
