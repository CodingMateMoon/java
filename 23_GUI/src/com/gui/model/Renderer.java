package com.gui.model;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
 
public class Renderer extends DefaultTableCellRenderer{
 
    public void fillColor(JTable t,JLabel l,boolean isSelected ){
        //setting the background and foreground when JLabel is selected
        if(isSelected){
            l.setBackground(t.getSelectionBackground());
            l.setForeground(t.getSelectionForeground());
        }
        else{
            l.setBackground(t.getBackground());
            l.setForeground(t.getForeground());
        }
 
    }
 
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
    													boolean hasFocus, int row, int column){
    	if(value instanceof JLabel){
//            ImageIcon imageIcon = new ImageIcon();
    		JLabel label = (JLabel)value;
            //you can add the image here
            
//    		label.setIcon(new ImageIcon(getClass().getResource("icon.png")));	
            //*****NullPintException이 이 줄에서 thread "AWT-EventQueue-0".로 발생합니다.. 
            //아이콘 줄을 삭제하면 작동은 잘 되지만 아이콘 없이 그냥 JTable이 만들어져요..
            label.setOpaque(true);
            fillColor(table,label,isSelected);
 
            return label;
        }
        else {
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
     }
}
