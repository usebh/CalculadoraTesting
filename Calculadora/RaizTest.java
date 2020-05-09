package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class RaizTest {

	@Test
	public void raiztest() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		float resultado;
		
		//act
		
		resultado = junit.raiz(45);
		
		//assert
		
		assertEquals(6.7082039,resultado,5);
		
	}
	@Test
	public void raiztest1() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		float resultado;
		
		//act
		
		resultado = junit.raiz(143);
		
		//assert
		
		assertEquals(11.9582607,resultado,5);
		
	}
	@Test
	public void raiztest2() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		float resultado;
		
		//act
		
		resultado = junit.raiz(432);
		
		//assert
		
		assertEquals(20.7846096,resultado,5);
		
	}
}
