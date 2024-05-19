package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		double area = width * height;
		return area;
	}
	public double perimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	public double diagonal() {
		double width2 = Math.pow(width, 2);
		double height2 = Math.pow(height, 2);
		double diagonal = Math.sqrt(height2 + width2);
		return diagonal;
	}
}
