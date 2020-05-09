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

}
