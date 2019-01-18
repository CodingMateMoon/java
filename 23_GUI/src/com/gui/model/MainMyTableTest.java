package com.gui.model;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class MainMyTableTest extends JFrame{
    
	public MainMyTableTest(String title){
        super(title);
        showGUI();
    }
 
    public void showGUI(){
        JTable table = new JTable();
        table.setModel(new MyModel());//invoking our custom model
        table.setDefaultRenderer(JLabel.class,  new Renderer());// for the rendering of cell
        JScrollPane jp = new JScrollPane(table);
        getContentPane().add(jp);
        setVisible(true);
        setSize(500,300);
    }
 
    public static void main(String[] args) {
    	MainMyTableTest t = new MainMyTableTest("Table Custom");
    }
}