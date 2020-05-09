package Calculadora;

public class CalculadoraClass {
     
	 public int suma(int a,int b) {
    	 return a+b;
     }
	 
	 public int resta(int a,int b) {
    	 return a-b;
	 }
	 
	 public int division(int a,int b) {
    	 return a/b; 
	 }
	 
	 public int multiplicacion(int a,int b) {
    	 return a*b; 
	 }
	 
	 public float raiz(float a) {
	     float x = 1;
	     int k;
	 
	     for(k = 0; k < 10; k++){
	           x = (x + a/x) / 2;
	     }   
	     System.out.println("La raiz de " + a + " después de " + (k - 1) + " iteraciones es de " + x);
	     return x;
	 }
}
