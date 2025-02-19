package sk.management.system.view.profile;

import java.awt.Color;
import java.awt.Component;
import java.util.Collections;
import java.util.List;
import sk.management.system.view.components.scroll.ScrollBar;
import sk.management.system.view.components.system.SystemColor;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sk.management.system.Controller.TransactionController;
import sk.management.system.model.ModelAction;
import sk.management.system.model.Transaction;

public class Table extends JTable implements EventAction{
    private List<Transaction> transactions;
    private TransactionController controller = new TransactionController();
    public Table() {
//        loadData();
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if (selected) {
                    com.setForeground(SystemColor.MAIN_COLOR_1);
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                return com;
            }
        });
    }
     public void loadData() {
         transactions = controller.getAllTransactions();
         if (transactions == null) {
            transactions = Collections.emptyList();
        }
        // Assume the table's model is a DefaultTableModel with proper column names.
        DefaultTableModel model = (DefaultTableModel) getModel();
        // Clear existing rows
        model.setRowCount(0);
        // Add rows for each transaction
        for (Transaction t : transactions) {
            // You can customize the "Action" column content as needed (here we use an empty string or ModelAction placeholder)
            //Create an EventAction for each row
            EventAction event = new EventAction(){
                @Override
                public boolean delete(Transaction transaction){
                    System.out.println("Delete: " + transaction.getId());
                    return false;
                }
                @Override
                public boolean update(Transaction transaction){
                    System.out.println("Edit: " + transaction.getId());
                    return false;
                }
            
          
            };
            ModelAction actionData = new ModelAction(t , event);
            model.addRow(new Object[] {
                t.getId(),
                t.getType(),
                t.getDescription(),
                t.getAmount(),
                actionData
//               "" // Action column placeholder (rendered via custom cell renderer/editor if needed)

        });
        // Notify the table that data has changed (if needed, model.addRow() usually triggers this).
        // model.fireTableDataChanged();
        }
    }
    

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
    public void forLoopingButton(){ // Requirements for JTable button inside
        
    }
    

    public void fixTable(JScrollPane scroll) {
        scroll.setBorder(null);
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getVerticalScrollBar().setBackground(Color.WHITE);
        scroll.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }

    @Override
    public boolean delete(Transaction transaction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Transaction transaction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

 
}
