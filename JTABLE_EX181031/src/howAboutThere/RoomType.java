package howAboutThere;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;

public class RoomType {
	private String roomName;
	private String roomId;
	private String[] dates = new String[31];
	private JLabel[] dateLabels = new JLabel[31];
	
	public RoomType() {}
	
	public RoomType(String roomName, String roomId) {
		this.roomName = roomName;
		this.roomId = roomId;
		
		GregorianCalendar gc = new GregorianCalendar();
		int year = gc.get(Calendar.YEAR);
		int month = gc.get(Calendar.MONTH) + 1;
		int i = 0;
		// 28일까지 기본 정보 넣기
		for (i = 0; i < 28; i++) {
			final int x = i;
			dates[i] = "" + (i + 1);
			dateLabels[i] = new JLabel(dates[i]);
			/*dateLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dateLabels[x].setBackground(Color.RED);
				}
			});*/
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
		
		for (i = 28; i <= 30; i++) {
			final int x = i;
			dateLabels[i] = new JLabel(dates[i]);
			/*dateLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dateLabels[x].setBackground(Color.RED);
				}
			});*/
		}
	}
	
	
	public RoomType(String roomName, String roomId, String[] dates) {
		this.roomName = roomName;
		this.roomId = roomId;
		this.dates = dates;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String[] getDates() {
		return dates;
	}

	public void setDates(String[] dates) {
		this.dates = dates;
		for (int i = 0; i < dates.length; i++) {
			dateLabels[i].setText(dates[i]);
		}
	}

	public JLabel[] getDateLabels() {
		return dateLabels;
	}

	/*public void setDateLabels(JLabel[] dateLabels) {
		this.dateLabels = dateLabels;
	}*/
	
	
	
}
