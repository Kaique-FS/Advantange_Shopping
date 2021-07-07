package com.keeggo.qavengers.projetoadvanced.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.keeggo.qavengers.projetoadvanced.cucumber.TestContext;
import com.keeggo.qavengers.projetoadvanced.managers.FileReaderManager;
import com.keeggo.qavengers.projetoadvanced.pages.HomePage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeStep {

	WebDriver driver;
	HomePage Page;
	TestContext Context;

	public HomeStep(TestContext context) {
		Context = context;
		Page = Context.getPageObjectManager().getHomePage();
	}

	@Dado("^usuário em questão está Pagina inicial$")
	public void usuário_em_questão_está_Pagina_inicial() {
		Page.navegar_para_pagina_principal();
	}

	@Quando("^clicar em login$")
	public void clicar_em_novo_login() {
		Page.clica_em_logIn();
	}

	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() {
		Page.clica_em_novo_usuario();
	}
	
	@Quando("^realizar login$")
	public void realiza_login() {
		Page.fill_PersonalDetails();
		Page.logar_conta();
	}
	
	@Quando("^realizar login invalido$")
	public void realiza_login_invalido() {
		Page.fill_PersonalDetailsInvalid();
		Page.logar_conta();
	}
	
	@Quando("^voltar a pagina inicial$")
	public void volta_home_page() {
		Page.navegar_para_pagina_principal();
	}
	
	@Entao("^entrar na conta cadastrada$")
	public void entrar_na_conta_cadastrada() throws Exception {
		assertEquals(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(), "http://www.advantageonlineshopping.com/#/");
		assertTrue(Page.Nome_Conta(), true);
		Thread.sleep(1000);
	}
	
	@Entao("^aparece mensagem de dados invalidos$")
	public void aparece_mensagem_dados_invalidos() throws Exception {
		//assertEquals(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(), "http://www.advantageonlineshopping.com/#/");
		Page.getDadosInvalidos();
		assertTrue(Page.Dados_Invalidos(), true);
		Thread.sleep(1000);
	}
	
}
