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
		
		assertEquals(133,resultado);
		
	}

}
