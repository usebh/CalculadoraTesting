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
	
	@Test
	public void multiplicaciontest1() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.multiplicacion(5,-4);
		
		//assert
		
		assertEquals(-20,resultado);
	}
	
	@Test
	public void multiplicaciontest2() {
        CalculadoraClass junit = new CalculadoraClass();
		
		//arrange
		
		int resultado;
		
		//act
		
		resultado = junit.multiplicacion(-5,-4);
		
		//assert
		
		assertEquals(20,resultado);
	}
}
