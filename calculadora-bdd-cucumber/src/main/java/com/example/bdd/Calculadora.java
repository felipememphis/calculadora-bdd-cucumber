package com.example.bdd;

public class Calculadora implements Operacao {

	@Override
	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double subtracao(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double divisao(double num1, double num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("Argumento: " + num2 + " inválido para divisão!");
		}
		return num1 / num2;
	}

	@Override
	public double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}

}
