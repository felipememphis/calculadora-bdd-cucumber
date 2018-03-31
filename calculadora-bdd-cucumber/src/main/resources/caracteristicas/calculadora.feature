@CalculadoraTeste
Feature: Calculadora 
		Como usuário desejo fazer operações básicas aritméticas
		com objetivo de ter um resultado final dessas operações

  Scenario: Soma
    Given que eu escolha operacao somar
    When eu passar o primeiro numero '2'
    And passar o segundo numero '2'
    Then eu tenho o resultado '4'

