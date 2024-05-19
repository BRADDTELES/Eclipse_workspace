package entities;

public class Student {

	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double totalValueGrades() {
		double result = note1 + note2 + note3;
		return result;
	}
	
	public double missingPoints() {
		double result = 60 - totalValueGrades();
		return result;
	}
}
