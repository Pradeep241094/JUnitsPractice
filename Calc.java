package calcInClass;

public class Calc {
	static public int add(int a, int b){
		return a+b;
	}
	
	static public int multiply(int a, int b){
		return a * b;
	}
	
	static public int subtraction(int a, int b) {
		return a - b;
	}
	
	// handles all values including Integrer, and floating point numbers
	// Code refactoring
	
	static public double subtraction(double a, double b) {
		return (a - b);
	}
	
	 public static int division(int d, int e) {
		return (d/e);
	} 
	
	// code refactoring
	// handles all values including Integrer, and floating point numbers
	
	static public double division(double a, double b) {
		return (a/b);
	}
	
	static public float remainder(float a, float b) {
		return a % b;
	}
}		