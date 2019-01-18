package inherit.polymorphism.model;

public class Circle implements IShape {

	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
