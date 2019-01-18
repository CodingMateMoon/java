package inherit.polymorphism.model;

public class Rectangle implements IShape{

	private double width, height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
