package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = entrada.nextDouble();
		rectangle.height = entrada.nextDouble();
		
		System.out.printf("AREA = %.2f", rectangle.area());
		System.out.println();
		System.out.printf("PERIMETER = %.2f", rectangle.perimeter());
		System.out.println();
		System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());
		
		entrada.close();
	}

}
