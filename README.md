# Projeto Advantage Online Shopping
Projeto de automação em BDD

Src/main/java

- com.keeggo.qavengers.advantage.cucumber

	ScenarioContex: Utilizado para controlar “x” valor entre classes.

	TestContext:  Utilizado para controlar as instâncias de objetos criados.

- com.keeggo.qavengers.advantage.dataProvider

	ConfigFileReader: Utilizado para realizar a leitura do documento Configuration.properties.

	JsonDataReader: Utilizado para realizar a leitura da classe Customer.

- com.keeggo.qavengers.advantage.enums

	Context: Utilizado para controlar os valores codificados no projeto.

	DriverType: Utilizado para controlar os valores de tipos de browser codificados no projeto.

	EnvironmentType: Utilizado para controlar os valores do tipo de ambiente codificado no projeto.

- com.keeggo.qavengers.advantage.managers

	FileReadeManager: Classe que é responsável por gerenciar as instâncias do leitor de configurações (ConfigFileReader)

	PageObjectManager: Classe que é responsável por gerenciar as instâncias de objetos POF (PageObjectFactory).

	WebDriverManager: Classe que é responsável por gerenciar as instâncias de objetos WebDriver.

- com.keeggo.qavengers.advantage.pof

	HomePage: Classe com a responsabilidade de armazenar os elementos e ações da página inicial/principal da aplicação.

	RegisterPage: Classe com a responsabilidade de armazenar os elementos e ações da página de Registro de usuário da aplicação.

- com.keeggo.qavengers.advantage.selenium

	Wait: Utilizada para gerenciar as instancias de métodos “wait” (espera) dentro do código do projeto.

- com.keeggo.qavengers.advantage.testDataTypes

	Customer: Classe utilizada para mapear parâmetros para inserção de dados (obs: não inserida com sucesso)

Src/test/java

- com.keeggo.qavengers.advantage.runners

	TestRunner: Classe Responsável por gerenciar qual teste será executado.

- com.keeggo.qavengers.advantage.stepdefinitions

	HomePageSteps: Classe responsável por implementar os cenários de testes relacionados a página “Inicial/Principal” para execução da aplicação.

	Hooks: Classe responsável por implementar os hooks de After e Before do Cucumber, para definir o que deve ser rodado antes e depois de cada teste.

	RegisterPageSteps: Classe responsável por implementar os cenários de testes relacionados a página de “Registro” para execução da aplicação.

Src/test/resources

- Pasta: functionalTests

	Register.feature: Feature (cucumber) responsável pela história de “Registrar/Cadastrar um novo usuario”.

- Pasta: testDataResources

	Customer.json: Responsável por definir as variáveis que serão inseridas. (Obs: não implementado)

Src/test/resources

- Pasta: configs

	Configuration.properties: Responsável por definir as instâncias usadas para a aplicação.

	Extent-config.xml:  Responsável por definir os parâmetros do report.

