/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.DAOIMPL;

import sk.management.system.model.Transaction;
import sk.management.system.util.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import sk.management.system.DAO.TransactionDAO;
import sk.management.system.util.QueryConstant;

/**
 *
 * @author Administrator
 */
public class TransactionDAOIMPL extends DBConnection implements TransactionDAO, QueryConstant {
    @Override
    public boolean createTransaction(Transaction transaction){
        boolean success = false;
        try {
            
            connection();
           
            stmt = con.prepareStatement(TRANS_ADD);
            stmt.setString(1, transaction.getType());
            stmt.setString(2, transaction.getDescription());
            stmt.setDouble(3, transaction.getAmount());
            int rowsAffected = stmt.executeUpdate();
            success = (rowsAffected > 0);   
        } catch(SQLException e){
             System.out.println("Invalid input, Please Try Again "+ e);
        } finally {
               try { con.close();} catch (SQLException ex) {System.out.println("Failed to close resources: " + ex.getMessage()); }
            
        }
        return success;
    }
      //try{
             //ResultSetMetaData rsmd = rs.getMetaData();

            //for(int i = 1; i <= rsmd.getColumnCount(); i++){
 
            //}
    public List<Transaction> getAllTransactions(){
        List <Transaction> transaction = new ArrayList<>();
        try {
          

            connection();
            stmt = con.prepareStatement(TRANS_VIEWACTIVE);
            rs = stmt.executeQuery();
            
            while (rs.next()){
            Transaction t = mapResultSetToTransaction(rs);
            transaction.add(t);
        }
        }catch(SQLException e){
              System.err.println("Error reading transactions: " + e.getMessage());            
        }
        return transaction;
        
    }
    private Transaction mapResultSetToTransaction(ResultSet rs)throws SQLException{
        Transaction transaction = new Transaction();
        transaction.setId(rs.getInt("trans_id"));
        transaction.setType(rs.getString("trans_type"));
        transaction.setDescription(rs.getString("trans_description"));
        transaction.setAmount(rs.getDouble("trans_amount"));
        return transaction;
    }
    // while (result) && ResultMetaData is required
    
    @Override
    public boolean updateTransaction(Transaction transaction){
         try {
             connection();
             
             stmt = con.prepareStatement(TRANS_UPDATE);
             stmt.setString(1, transaction.getType());
             stmt.setString(2, transaction.getDescription());
             stmt.setDouble(3, transaction.getAmount());
             stmt.setInt(4, transaction.getId());
             
             int rowsAffected = stmt.executeUpdate();
             return rowsAffected > 0;
         }catch(SQLException e){
             System.out.println("Invalid input, Please Try Again "+ e);
        } finally {
               try { con.close();} catch (SQLException ex) {System.out.println("Failed to close resources: " + ex.getMessage()); }
            
        }
        return false;
       
    }
    @Override
    public boolean archiveTransaction(int id){
        try{
            connection();
           
            stmt = con.prepareStatement(TRANS_ARCHIVE);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }catch (SQLException e){
            System.out.println("Invalid input, Please Try Again "+ e);
            return false;
        }
    }
}
