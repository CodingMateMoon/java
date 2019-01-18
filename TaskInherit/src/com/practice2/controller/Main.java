package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		Rectangle[] rectangles = new Rectangle[3];
		Point[] points = new Point[5];
		
		int i;
		/*for (i = 0; i < 3; i++) {
			circles[i] = new Circle(0, 0, i + 1);
		}

		for (i = 0; i < 3; i++) {
			rectangles[i] = new Rectangle(0, 0, i + 1, i + 2);
		}
		
		for (i = 0; i < 3; i++) {
			circles[i].draw();
			rectangles[i].draw();
		}*/
		
		for (i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				points[i] = new Circle(0, 0, i + 1);
			} else {
				points[i] = new Rectangle(0, 0, i + 1, i + 2);
			}
		}
		
		for (i = 0; i < 5; i++) {
			points[i].draw();
		}
	}

}
