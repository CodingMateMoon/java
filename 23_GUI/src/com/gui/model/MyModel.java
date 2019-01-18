package com.gui.model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

class MyModel extends javax.swing.table.DefaultTableModel {

//	JLabel[] labels = new JLabel[9];
	JLabel[] labels = new JLabel[4];

	Object[] col = { "Column 1", "Column 2", "Column 3" };

	public MyModel() {
		int i, j, index = 0;
		/*for (i = 0; i < 9; i++) {
			final int x = i;
			labels[i] = new JLabel("Test : Row " + (i + 1) + " Col 1");
			labels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					labels[x].setText("테스트 성공" + (x + 1));
				}
			});
		}*/
		
		for (i = 0; i < 4; i++) {
			final int x = i;
			labels[i] = new JLabel("Test : Row " + (i + 1) + " Col 1");
			labels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					labels[x].setText("테스트 성공" + (x + 1));
				}
			});
		}
		

		Object[][] row = { { labels[0], "Row 1 Col 2", "Row 1 Col3" },
				{ labels[1], "Row 2 Col 2", "Row 2 Col3" },
				{ labels[2], "Row 3 Col 2", "Row 3 Col3" },
				{ labels[3], "Row 4 Col 2", "Row 4 Col3" } };
//		Object[][] row = new Object[3][3];
		/*for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				row[i][j] = labels[index++];
			}
		}*/
		
		// Adding columns
		for (Object c : col)
			this.addColumn(c);

		// Adding rows
		for (Object[] r : row)
			addRow(r);
	}

	@Override
	public Class getColumnClass(int columnIndex) {
		if (columnIndex == 0)
			return getValueAt(0, columnIndex).getClass();

		else
			return super.getColumnClass(columnIndex);

	}
}
