package inherit.polymorphism.model;

public class Triangle implements IShape{

	private double base, height;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		return (base * height) / 2;
	}
	
	public double getHypotenuse() {
		return Math.sqrt(base * base + height * height);
	}
	
	public double perimeter() {
		return base + height + getHypotenuse();
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
	
}
