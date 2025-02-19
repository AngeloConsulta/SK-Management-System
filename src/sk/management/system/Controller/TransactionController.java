/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.Controller;

import java.util.List;
import javax.swing.JOptionPane;

import sk.management.system.DAOIMPL.TransactionDAOIMPL;
import sk.management.system.model.Transaction;
import sk.management.system.view.profile.EventAction;

/**
 *
 * @author Administrator
 */
public class TransactionController implements EventAction {
     private TransactionDAOIMPL transact = new TransactionDAOIMPL();

   
    public boolean addTransaction(Transaction transaction) {
         // Validate transaction data (still okay to do minimal validation here)
        if (transaction == null || transaction.getType() == null || transaction.getType().trim().isEmpty()
            || transaction.getDescription() == null || transaction.getDescription().trim().isEmpty()
            || transaction.getAmount() <= 0) {
            return false;
        }

        // Call DAO to create transaction
        return transact.createTransaction(transaction);
    }
    public List<Transaction> getAllTransactions(){
        return transact.getAllTransactions();
    }
//    private boolean validateTransaction(Transaction transaction) {
//        if (transaction == null) {
//            JOptionPane.showMessageDialog(null, "Transaction data is missing.", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//        if (transaction.getType() == null || transaction.getType().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Transaction type cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//        if (transaction.getDescription() == null || transaction.getDescription().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Transaction description cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//        if (transaction.getAmount() <= 0) {
//            JOptionPane.showMessageDialog(null, "Transaction amount must be greater than zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//        return true;
//    }
    

    @Override
    public boolean delete(Transaction transaction) {
        return transact.archiveTransaction(transaction.getId()); // Call DAO to delete transaction
    }

    @Override
    public boolean update(Transaction transaction) {
       return transact.updateTransaction(transaction); // Call DAO to update transaction
    }
}
