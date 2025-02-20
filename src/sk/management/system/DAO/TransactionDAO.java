/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sk.management.system.DAO;

import java.util.List;
import sk.management.system.model.Transaction;

/**
 *
 * @author Administrator
 */
public interface TransactionDAO {
     public boolean createTransaction(Transaction transaction);
     public List<Transaction> getAllTransactions();
     public boolean updateTransaction(Transaction transaction);
     public boolean archiveTransaction(int id);
     public List<Transaction> searchTransactions(String keyword);
     public double getTotalExpenses();
     public double getTotalIncome();
}
