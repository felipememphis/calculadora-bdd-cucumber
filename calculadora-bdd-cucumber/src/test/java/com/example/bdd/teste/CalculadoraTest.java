package com.example.bdd.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@CalculadoraTeste", 
glue = "com.example.bdd.teste.passos", monochrome = true, dryRun = false)
public class CalculadoraTest {

}
