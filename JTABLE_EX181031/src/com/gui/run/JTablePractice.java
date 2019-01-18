package com.gui.run;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] columnNames = {"이름", "주소", "나이", "가입여부"};
		Object[][] data = {
				{"김철수", "서울", 24, false},
				{"김영희", "아산", 25, true},
				{"이혜정", "천안", 32, false}
		};
		JTable table = new JTable(data, columnNames);
		// 테이블을 컨테이너에 추가
		JScrollPane scollPane = new JScrollPane(table);
		// 컨테이너 전체 높이 테이블이 전부 사용
		table.setFillsViewportHeight(true);
	}

}
