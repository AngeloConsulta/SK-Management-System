package sk.management.system.view.profile;

import sk.management.system.model.ModelAction;
import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import sk.management.system.Controller.TransactionController;
import sk.management.system.DAOIMPL.TransactionDAOIMPL;
import sk.management.system.view.dashboard.Form_Empty;

public class TableCellAction extends AbstractCellEditor implements TableCellEditor{

    private ModelAction data;
    private Action actionPanel;
    private int row;
    private JTable table;
    private TransactionDAOIMPL transactionDAO;
    private TransactionController controller = new TransactionController();
    private Form_Empty transactionView;
//    private Table tabletrans = new Table();
    public TableCellAction(JTable table ,Form_Empty transactionView) {
        this.transactionView = transactionView;
        this.table = table;
        this.transactionDAO = new TransactionDAOIMPL();
        this.actionPanel = new Action(null);
     
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object value, boolean isSelected, int row, int column) {
        if (value instanceof ModelAction) {
            data = (ModelAction) value;

        actionPanel = new Action(data);
        actionPanel.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        // Add button listeners
        actionPanel.getBtnEdit().addActionListener(e -> {
            stopCellEditing();  // End editing mode
            if (data != null && data.getEvent() != null) {
                 transactionView.updateTransaction(data.getTransaction()); 
//                 transactionView
//                 tabletrans.loadData(); // Refresh table after update
            }
        });

        actionPanel.getBtnDelete().addActionListener(e -> {
            stopCellEditing();
            if (data != null && data.getEvent() != null) {
                transactionView.deleteTransaction(data.getTransaction()); 
//                tabletrans.loadData(); // Refresh table after update It not refreshing

            }
        });
         return actionPanel;
        }
       
        return new Action(null); // Fallback action panel
    }


    //  This method to pass data to cell render when focus lose in cell
    @Override
    public Object getCellEditorValue() {
        return data;
    }
}
