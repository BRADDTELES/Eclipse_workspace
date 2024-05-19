package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = entrada.nextLine();
		System.out.print("Price: ");
		double price = entrada.nextDouble();
		
		Product product = new Product(name, price); //depois q escrever o 'new Pro' Ctrl + Space auto-completa
		
		product.setName("Computer");
		System.out.println("Updated name: "+ product.getName());
		product.setPrice(1200.00);
		System.out.printf("Updated price: %.2f%n", product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = entrada.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		entrada.close();
	}

}
