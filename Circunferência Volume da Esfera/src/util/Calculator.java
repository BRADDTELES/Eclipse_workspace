package util;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	
	
	public static double circumference(double radius) {
		double result = 2.0 * PI * radius;
		return result;
	}
	
	public static double volume(double radius) {
		double result = 4.0 * PI * radius * radius * radius / 3.0;
		return result;
	}
}
