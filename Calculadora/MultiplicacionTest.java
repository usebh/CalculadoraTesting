package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicacionTest {

	@Test
	public void multiplicaciontest() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.multiplicacion(8,3);
		
		//assert
		
		assertEquals(24,resultado);
	}

}
