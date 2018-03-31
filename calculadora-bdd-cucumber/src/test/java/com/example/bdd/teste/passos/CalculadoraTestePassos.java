package com.example.bdd.teste.passos;

import static org.junit.Assert.assertEquals;

import com.example.bdd.Calculadora;
import com.example.bdd.Operacao;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculadoraTestePassos {

	private Operacao calculadora;
	private double num1;
	private double num2;
	
	@Given("^que eu escolha operacao somar$")
	public void que_eu_escolhe_opera_o_somar() {
		calculadora = new Calculadora();
	}

	@When("^eu passar o primeiro numero '(\\d+)'$")
	public void eu_passar_o_primeiro_n_mero(int arg1) {
		this.num1 = arg1;
	}

	@When("^passar o segundo numero '(\\d+)'$")
	public void passo_o_segundo_n_mero(int arg1) {
		this.num2 = arg1;
	}

	@Then("^eu tenho o resultado '(\\d+)'$")
	public void eu_tenho_o_resultado(int arg1) {
		assertEquals(num1 + num2, calculadora.soma(2, 2), 0);
	}
}
