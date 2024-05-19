package util;

public class CurrencyConverter {

	public static double Iof = 0.06;
	
	public static double calc(double dollar, double dollars) {
		double result = dollar * dollars;
		result = (result * Iof) + result;
		return result;
	}

}
