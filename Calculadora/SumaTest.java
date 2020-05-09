package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void sumatest() {
		
		CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.suma(233,100);
		
		assertEquals(333,resultado);
		
	}

}
