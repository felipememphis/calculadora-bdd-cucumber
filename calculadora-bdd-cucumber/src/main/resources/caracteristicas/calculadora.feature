@CalculadoraTeste
Feature: Calculadora 
		Como usu�rio desejo fazer opera��es b�sicas aritm�ticas
		com objetivo de ter um resultado final dessas opera��es

  Scenario: Soma
    Given que eu escolha operacao somar
    When eu passar o primeiro numero '2'
    And passar o segundo numero '2'
    Then eu tenho o resultado '4'

