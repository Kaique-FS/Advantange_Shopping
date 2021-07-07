#language:pt
#coding:utf-8

Funcionalidade: Automatização de Login
Descrição: Realização do login de um usuario cadastrado

Contexto:
	Dado usuário em questão está Pagina inicial
	Quando clicar em login
	

@Home_001_OK
Cenario: Cliente realiza login na conta
	E realizar login
	Entao entrar na conta cadastrada

@Home_001_NOK
Cenario: Cliente não realiza login na conta
	E realizar login invalido
	Entao aparece mensagem de dados invalidos