package howAboutThere;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;

public class RoomTypeTableModel extends AbstractTableModel implements MouseListener{

	private List<RoomType> roomTypeList;
//	private String[] columnNames = new String[] {"name", "num", "date"};
	private String[] columnNames = new String[33];
//	private Class[] columnClass = new Class[] {String.class, String.class, String.class};
	private Class[] columnClass = new Class[33];
	
	
	public RoomTypeTableModel(List<RoomType> roomTypeList) {
		this.roomTypeList = roomTypeList;
		String[] dates = makeDates();
		columnNames[0] = "name";
		columnNames[1] = "num";
		
		for (int i = 2; i < columnNames.length; i++) {
			columnNames[i] = dates[i - 2];
		}
		
		for (int i = 0; i < columnClass.length; i++) {
			columnClass[i] = String.class;
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
//		return super.getColumnName(column);
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
//		return super.getColumnClass(columnIndex);
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return roomTypeList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int colIndex) {
		RoomType row = roomTypeList.get(rowIndex);
		if (colIndex == 0) {
			return row.getRoomName();
		} else if (colIndex == 1) {
			return row.getRoomId();
		} else if (2 <= colIndex && colIndex < columnNames.length){
//			String[] dates = row.getDates();
			JLabel[] dateLabels = row.getDateLabels();
//			return dates[colIndex - 2];
			return dateLabels[colIndex - 2];
		} 
		return null;
	}
	
	public static String[] makeDates(/*int year, int month*/) {
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
			if(isLeapYear(year)) {
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Point p = e.getPoint();
		int row = p.x;
		int col = p.y;
		Object obj = this.getValueAt(row, col);
		if (obj instanceof JLabel) {
			JLabel label = (JLabel) obj;
			label.setBackground(Color.RED);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
