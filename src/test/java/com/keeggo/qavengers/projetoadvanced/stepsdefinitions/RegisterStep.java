package com.keeggo.qavengers.projetoadvanced.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.keeggo.qavengers.projetoadvanced.cucumber.TestContext;
import com.keeggo.qavengers.projetoadvanced.managers.FileReaderManager;
import com.keeggo.qavengers.projetoadvanced.pages.RegisterPage;
import com.keeggo.qavengers.projetoadvanced.selenium.Wait;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RegisterStep {

	WebDriver driver;
	RegisterPage Page;
	TestContext Context;


	 public RegisterStep(TestContext context) {
		 Context = context;
		 Page = Context.getPageObjectManager().getRegisterPage();
	 }

	@Quando("^inserir detalhes da conta$")
	public void inserir_detalhes_da_conta() {
		Page.fill_PersonalDetails();	

		Page.clica_checkbox_1();
		Page.clica_checkbox_2();
		Page.registra_usario();
	}
	
	@Entao("^aparece mensagem de usuario ja cadastrado$")
	public void conferir_cadastro() throws Exception {
		assertNotEquals(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(), Context.getWebDriverManager().getDriver().getCurrentUrl());
		Page.Get_Usuario_Ja_Cadastrado();
		assertTrue(Page.Usuario_Ja_Cadastrado(), true);
	}
	
}
