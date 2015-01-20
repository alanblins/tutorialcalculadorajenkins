package net.alanbrazil.samples.test;

import static org.junit.Assert.assertEquals;
import net.alanbrazil.samples.Calculadora;

import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void testSoma(){
		assertEquals(4, Calculadora.somar(1, 3));	
	}
	
	@Test
	public void testSubtracao(){
		assertEquals(5, Calculadora.subtrair(7, 2));	
	}
	
}
