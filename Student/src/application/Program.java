package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		if (student.totalValueGrades() > 60) {
			System.out.printf("FINAL GRADE = %.2f%n",student.totalValueGrades());
			System.out.println("PASS");
		}
		else {
			System.out.printf("FINAL GRADE = %.2f%n",student.totalValueGrades());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f",student.missingPoints());
			System.out.print(" POINTS");
		}
		
		sc.close();
	}

}
