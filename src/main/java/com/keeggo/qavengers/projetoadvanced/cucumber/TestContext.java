package com.keeggo.qavengers.projetoadvanced.cucumber;

import com.keeggo.qavengers.projetoadvanced.managers.PageObjectManager;
import com.keeggo.qavengers.projetoadvanced.managers.WebDriverManager;

public class TestContext {

	private WebDriverManager DriverManager;
	private PageObjectManager PageManager;
	public ScenarioContext Context;

	public TestContext() {
		DriverManager = new WebDriverManager();
		PageManager = new PageObjectManager(DriverManager.getDriver());
		Context = new ScenarioContext();

	}

	public WebDriverManager getWebDriverManager() {
		return DriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return PageManager;
	}

	public ScenarioContext getScenarioContext() {
		return Context;
	}
}
