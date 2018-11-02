package com.fatec.sce;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestaConexaoComDB.class, 
	UC01_CadastrarLivro.class, 
	UC02_ConsultarLivro.class, 
	UC05_CadastrarUsuario.class, 
	UC09_RegistrarEmprestimoDeLivro.class 
	})
public class AllTests {

}
