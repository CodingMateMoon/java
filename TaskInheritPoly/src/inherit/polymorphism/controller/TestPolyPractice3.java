package inherit.polymorphism.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		int i;
		IShape[] iarr = new IShape[5];
		
		for (i = 0; i < iarr.length; i++) {
			int type = (int) (Math.random() * 3);
			switch (type) {
			case 0:
				iarr[i] = new Circle(i + 1);
				break;
			case 1:
				iarr[i] = new Rectangle(i + 1, i + 2);
				break;
			case 2:
				iarr[i] = new Triangle(i + 1, i + 2);
				break;
			}
		}
		
		for (i = 0; i < iarr.length; i++) {
			if (iarr[i] instanceof Circle) {
				System.out.printf("%s, 원 면적 : %.1f, 원 둘레 : %.1f \n", iarr[i], iarr[i].area(), iarr[i].perimeter());
			} else if (iarr[i] instanceof Rectangle) {
				System.out.printf("%s, 사각형 면적 : %.1f, 사각형 둘레 : %.1f \n", iarr[i], iarr[i].area(), iarr[i].perimeter());
			} else {
				Triangle t = (Triangle) iarr[i];
				System.out.printf("%s, 삼각형 면적 : %.1f, 삼각형 둘레 : %.1f, 삼각형 빗변 : %.1f \n", 
						iarr[i], iarr[i].area(), iarr[i].perimeter(), t.getHypotenuse());
			}
		}
		
		
	}

}
