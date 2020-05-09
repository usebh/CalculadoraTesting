package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void divisiontest() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.division(8,3);
		
		//assert
		
		assertEquals(2,resultado);
	}

}
