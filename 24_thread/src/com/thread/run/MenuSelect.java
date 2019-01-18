package com.thread.run;

public class MenuSelect {

	public static void main(String[] args) {

		String[] menuType = { "산들애", "솔낭구", "중리", "미향"};
		for (int i = 0; i < 5; i++) {
			int menu = (int) (Math.random() * 4);

			switch (menu) {
			case 0:
				System.out.println(menuType[menu]);
				break;
			case 1:
				System.out.println(menuType[menu]);
				break;
			case 2:
				System.out.println(menuType[menu]);
				break;
			case 3:
				System.out.println(menuType[menu]);
				break;
			}
		}
	}

}
