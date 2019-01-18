package inherit.polymorphism.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;

public class TestIShape {

	public static void main(String[] args) {

		IShape s;
		s = new Circle(15.5);
		System.out.printf("원 면적 : %.1f \n", s.area());
		System.out.printf("원 둘레 : %.1f \n", s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		System.out.printf("사각형 면적 : %.1f \n", s.area());
		System.out.printf("사각형 둘레 : %.1f \n", s.perimeter());
		
	}

}
