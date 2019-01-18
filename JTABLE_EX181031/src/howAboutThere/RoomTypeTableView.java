package howAboutThere;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class RoomTypeTableView extends JFrame implements MouseListener {

	private JTable table;
	private boolean flag = true;

	public RoomTypeTableView() {
		this.setBounds(0, 0, 1024, 768);
		RoomType row1 = new RoomType("진달래", "1호");
		RoomType row2 = new RoomType("개나리", "2호");
		RoomType row3 = new RoomType("자스민", "3호");
		RoomType row4 = new RoomType("물망초", "4호");

		// build the list
		List<RoomType> roomTypeList = new ArrayList<RoomType>();
		roomTypeList.add(row1);
		roomTypeList.add(row2);
		roomTypeList.add(row3);
		roomTypeList.add(row4);

		// create the model
		RoomTypeTableModel roomTypeTableModel = new RoomTypeTableModel(roomTypeList);
		// create the table
		table = new JTable(roomTypeTableModel);
		// set the renderer
		table.setDefaultRenderer(String.class, new RoomTypeTableRenderer());
		table.addMouseListener(this);

		// add the table to the frame
		this.add(new JScrollPane(table));
		this.setTitle("JTable Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new RoomTypeTableView();
			}
		});
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Point p = e.getPoint();

		int rowIndex = table.rowAtPoint(p);
		int columnIndex = table.columnAtPoint(p);
		JLabel label = (JLabel) table.getModel().getValueAt(rowIndex, columnIndex);
		System.out.println("mouseClicked: " + label.getText());
		if (flag) {
			label.setForeground(Color.RED);
			label.setBackground(Color.BLUE);
			flag = false;
		} else {
			label.setForeground(Color.BLACK);
			flag = true;
		}
		table.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
