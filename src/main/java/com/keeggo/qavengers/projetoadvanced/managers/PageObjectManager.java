package com.keeggo.qavengers.projetoadvanced.managers;

import org.openqa.selenium.WebDriver;

import com.keeggo.qavengers.projetoadvanced.pages.HomePage;
import com.keeggo.qavengers.projetoadvanced.pages.RegisterPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage HomePage;
	private RegisterPage RegisterPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (HomePage == null) ? HomePage = new HomePage(driver) : HomePage;
	}
	
	public RegisterPage getRegisterPage() {
		return (RegisterPage == null) ? RegisterPage = new RegisterPage(driver) : RegisterPage;
	}

}
