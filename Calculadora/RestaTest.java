package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void restatest() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.resta(233,100);
		
		//assert
		
		assertEquals(133,resultado);
		
	}
	@Test
	public void restatest1() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.resta(12,-4);
		
		//assert
		
		assertEquals(16,resultado);
		
	}
	@Test
	public void restatest2() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.resta(-45,-7);
		
		//assert
		
		assertEquals(-38,resultado);
		
	}
}
