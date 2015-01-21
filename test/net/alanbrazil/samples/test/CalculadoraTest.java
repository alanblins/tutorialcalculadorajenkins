package net.alanbrazil.samples.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import net.alanbrazil.samples.Calculadora;

public class CalculadoraTest {
	@Test
	public void soma(){
		int result = Calculadora.somar(1, 3);
		assertEquals(4, result,Integer.MIN_VALUE);	
	}
}
