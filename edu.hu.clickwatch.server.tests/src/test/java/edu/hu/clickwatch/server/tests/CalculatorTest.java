package edu.hu.clickwatch.server.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.hu.clickwatch.server.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd(){
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);
		assertEquals(60, result, 0);
	}
}
