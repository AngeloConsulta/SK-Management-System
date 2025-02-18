package sk.management.system.view.profile;

import sk.management.system.model.ModelAction;
import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class TableCellAction extends AbstractCellEditor implements TableCellEditor{

    private ModelAction data;
    private Action actionPanel;
    private int row;
    private JTable table;
    
    public TableCellAction(JTable table) {
        this.table = table;
        actionPanel = new Action(data);
     // Add button listeners
        actionPanel.getBtnEdit().addActionListener(e -> {
            stopCellEditing();  // End editing mode
            if (data != null && data.getEvent() != null) {
                data.getEvent().update(data.getTransaction());
            }
        });

        actionPanel.getBtnDelete().addActionListener(e -> {
            stopCellEditing();
            if (data != null && data.getEvent() != null) {
                data.getEvent().delete(data.getTransaction());
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object value, boolean isSelected, int row, int column) {
        if (value instanceof ModelAction) {
            data = (ModelAction) value;

        Action cell = new Action(data);
        cell.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        return cell;
    }else {
            actionPanel = new Action(null); // or handle the null case
        }
        return actionPanel;
    }


    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
