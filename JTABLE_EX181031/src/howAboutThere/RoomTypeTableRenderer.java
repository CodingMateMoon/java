package howAboutThere;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class RoomTypeTableRenderer extends JLabel implements TableCellRenderer {

	public RoomTypeTableRenderer() {
		super.setOpaque(true);
	}

	@Override // 테이블, 테이블을 구성하는 셀의 타입, 선택 정보, 포커스 정보, 테이블의 행의 수, 열의 수
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		

		if (value instanceof String) {
			String s = (String) value;
			JLabel p = this;
			this.setText(s);
			/*this.setForeground(Color.BLUE);
			super.setBackground(Color.GREEN);*/
			System.out.println("render : " + s);
			/*this.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (isSelected)
						p.setBackground(Color.BLUE);
				}
			});*/
		} else if (value instanceof JLabel) {
			JLabel label = (JLabel) value;
			System.out.println("LabelRender : " + label.getText());
			
			return label;
		}
		
		/*
		 * if (s.equals("1")) { this.setBackground(Color.RED); this.setText("ha1"); } if
		 * (s.equals("2")) { this.setBackground(Color.BLUE); this.setText("ho2"); }
		 * 
		 * if (s.equals("3")) { this.setBackground(Color.YELLOW); this.setText("hi3"); }
		 */
		/*
		 * if (isSelected) { this.setBackground(Color.BLUE); }
		 */

		return this;
	}

	public static String[] makeDates(/* int year, int month */) {
		String[] dates = new String[31];

		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH) + 1;
		int i = 0;
		// 28일까지 기본 정보 넣기
		for (i = 0; i < 28; i++) {
			dates[i] = "" + (i + 1);
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			dates[28] = "" + 29;
			dates[29] = "" + 30;
			dates[30] = "" + 1;
		} else if (month == 2) {
			if (isLeapYear(year)) {
				dates[28] = "" + 29;
				dates[29] = "" + 1;
				dates[30] = "" + 2;
			} else {
				dates[28] = "" + 1;
				dates[29] = "" + 2;
				dates[30] = "" + 3;
			}
		} else {
			dates[28] = "" + 29;
			dates[29] = "" + 30;
			dates[30] = "" + 31;
		}
		return dates;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
