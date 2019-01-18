
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
 
public class GradeRenderer extends JLabel implements TableCellRenderer
{
 
    public GradeRenderer()
    {
        super.setOpaque(true);
    }
     
    @Override  // 테이블, 테이블을 구성하는 셀의 타입, 선택 정보, 포커스 정보, 테이블의 행의 수, 열의 수
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column)
    {
        Student.Grade grade = (Student.Grade) value;
        if(grade == Student.Grade.A) {
            super.setBackground(Color.GREEN);
        }
        else if(grade == Student.Grade.B) {
            super.setBackground(Color.BLUE);
        }
        else if(grade == Student.Grade.C) {
            super.setBackground(Color.RED);
        }
        
        // return JLabel
        return this;
    }
     
}