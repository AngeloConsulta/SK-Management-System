package sk.management.system.view.dashboard;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import sk.management.system.Controller.TransactionController;
import sk.management.system.model.Transaction;
import sk.management.system.view.dashboard.AddTransaction;

public class Form_Empty extends javax.swing.JPanel {
    private TransactionController transactionController = new TransactionController();

    public Form_Empty(String name) {
        initComponents();
//        lb.setText("Form " + name);
//        txtSearch.setPrefixIcon(new ImageIcon(getClass().getResource("/sk/management/system/images/search.png")));
        txtSearch.setHint("Search");
        add(txtSearch, "w 20%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBudget = new javax.swing.JPanel();
        cardSavings = new sk.management.system.view.cards.Card();
        cardIncome = new sk.management.system.view.cards.Card();
        cardExpenses = new sk.management.system.view.cards.Card();
        roundPanel1 = new sk.management.system.view.profile.RoundPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBudget = new sk.management.system.view.profile.Table();
        cmbTransactionType = new javax.swing.JComboBox<>();
        txtSearch = new sk.management.system.view.auth.MyTextField();
        btnAddTransaction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setOpaque(false);

        cardSavings.setDescription("Total Savings");
        cardSavings.setIcon(javaswingdev.GoogleMaterialDesignIcon.INPUT);

        cardIncome.setDescription("Total Income");
        cardIncome.setIcon(javaswingdev.GoogleMaterialDesignIcon.ATTACH_MONEY);

        cardExpenses.setDescription("Total Expenses");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        tableBudget.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID #", "Type", "Description", "Amount", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableBudget);

        cmbTransactionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Income Transaction", "Expenses Transaction", " ", " " }));

        txtSearch.setBackground(new java.awt.Color(220, 240, 255));
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnAddTransaction.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddTransaction.setText("Add ");
        btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransactionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Type");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Description");

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Amount");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Filter");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTransactionType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount)
                        .addGap(25, 25, 25)
                        .addComponent(btnAddTransaction)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTransactionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTransaction)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBudgetLayout = new javax.swing.GroupLayout(panelBudget);
        panelBudget.setLayout(panelBudgetLayout);
        panelBudgetLayout.setHorizontalGroup(
            panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBudgetLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBudgetLayout.createSequentialGroup()
                        .addComponent(cardExpenses, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(cardIncome, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(cardSavings, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        panelBudgetLayout.setVerticalGroup(
            panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBudgetLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardSavings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBudget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBudget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void addTransaction(Transaction transaction){
        transaction.setType(cmbTransactionType.getSelectedItem().toString());
        transaction.setDescription( txtDescription.getText().trim());
        try {
        // Parse the amount from the text field
        double amount = Double.parseDouble(txtAmount.getText().trim());
        transaction.setAmount(amount);
    } catch (NumberFormatException e) {
        // Handle the case where the input isn't a valid double
        JOptionPane.showMessageDialog(this, "Invalid amount entered. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Optionally exit the method if the value is invalid
    }
        boolean success = transactionController.addTransaction(transaction);
    
    // Show success or error message based on the result from the controller
    if (success) {
        JOptionPane.showMessageDialog(this, "Transaction added successfully!", "Success", 
                                      JOptionPane.INFORMATION_MESSAGE);
        // Optionally clear the fields or refresh the transaction table
        clearTransactionFields();
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add transaction.", "Error", 
                                      JOptionPane.ERROR_MESSAGE);
    }
    }
    private void clearTransactionFields() {
    cmbTransactionType.setSelectedIndex(0);
    txtDescription.setText("");
    txtAmount.setText("");
}
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransactionActionPerformed
        Transaction transaction = new Transaction();
        addTransaction(transaction);        
        
    }//GEN-LAST:event_btnAddTransactionActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTransaction;
    private sk.management.system.view.cards.Card cardExpenses;
    private sk.management.system.view.cards.Card cardIncome;
    private sk.management.system.view.cards.Card cardSavings;
    private javax.swing.JComboBox<String> cmbTransactionType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBudget;
    private sk.management.system.view.profile.RoundPanel roundPanel1;
    private sk.management.system.view.profile.Table tableBudget;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDescription;
    private sk.management.system.view.auth.MyTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
