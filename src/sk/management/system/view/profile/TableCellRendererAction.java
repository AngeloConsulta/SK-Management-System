/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.view.profile;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import sk.management.system.model.ModelAction;


/**
 *
 * @author Administrator
 */
public class TableCellRendererAction extends DefaultTableCellRenderer{
    
    public TableCellRendererAction() {
        setHorizontalAlignment(SwingConstants.CENTER); 
    }
    @Override
     public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof ModelAction){
            ModelAction data = (ModelAction) value;
        
             // 'value' should be a ModelAction
            Action actionPanel = new Action(data);
            actionPanel.getBtnEdit().setEnabled(true);
            actionPanel.getBtnDelete().setEnabled(true);
            
              // Get alternating row colors
            Color defaultBackground = (row % 2 == 1) ? new Color(240, 240, 240) : Color.WHITE; 
        
            if (isSelected) {
                actionPanel.setBackground(table.getSelectionBackground());
            } else {
                actionPanel.setBackground(defaultBackground); 
            }
        return actionPanel;
        }
        // Fallback
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    
    }
}
