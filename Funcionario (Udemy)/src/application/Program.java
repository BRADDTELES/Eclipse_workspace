package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = entrada.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = entrada.nextDouble();
		System.out.print("Tax: ");
		employee.tax = entrada.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = entrada.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: "+ employee);
		
		entrada.close();
	}

}
