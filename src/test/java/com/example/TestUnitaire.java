package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUnitaire {

	@Test
	public void testAddition() {
		// Test de l'addition
		double num1 = 10;
		double num2 = 5;
		double resultatAttendu = 15;
		double resultatObtenu = num1 + num2;
		assertEquals(resultatAttendu, resultatObtenu, 0.001);
	}

	@Test
	public void testSoustraction() {
		// Test de la soustraction
		double num1 = 10;
		double num2 = 3;
		double resultatAttendu = 7;
		double resultatObtenu = num1 - num2;
		assertEquals(resultatAttendu, resultatObtenu, 0.001);
	}

	@Test
	public void testMultiplication() {
		// Test de la multiplication
		double num1 = 4;
		double num2 = 5;
		double resultatAttendu = 20;
		double resultatObtenu = num1 * num2;
		assertEquals(resultatAttendu, resultatObtenu, 0.001);
	}

	@Test
	public void testDivision() {
		// Test de la division
		double num1 = 20;
		double num2 = 4;
		double resultatAttendu = 5;
		double resultatObtenu = num1 / num2;
		assertEquals(resultatAttendu, resultatObtenu, 0.001);
	}

	@Test
	public void testDivisionParZero() {
		// Test division par zéro
		double num1 = 10;
		double num2 = 0;
		
		// On teste que la division par zéro donne l'infini
		double resultat = num1 / num2;
		assertTrue("Division par zéro devrait donner l'infini", 
			Double.isInfinite(resultat));
	}

	@Test
	public void testNombresNegatifs() {
		// Test avec nombres négatifs
		double num1 = -10;
		double num2 = 5;
		double resultatAttendu = -5;
		double resultatObtenu = num1 + num2;
		assertEquals(resultatAttendu, resultatObtenu, 0.001);
	}

	@Test
	public void testNombresDecimaux() {
		// Test avec nombres décimaux
		double num1 = 10.5;
		double num2 = 2.3;
		double resultatAttendu = 12.8;
		double resultatObtenu = num1 + num2;
		assertEquals(resultatAttendu, resultatObtenu, 0.001);
	}

	@Test
	public void test() {
		// Test générique (votre template original)
		assertTrue("Test de base", 2 + 2 == 4);
	}

}