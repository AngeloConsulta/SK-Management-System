/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.DAOIMPL;

import sk.management.system.model.User;
import sk.management.system.util.DBConnection;
import java.sql.SQLException;
import java.util.Date;
import sk.management.system.DAO.UserDAO;
//import java.sql.Date;
/**
 *
 * @author Administrator
 */
public class UserDAOIMPL extends DBConnection implements UserDAO{
    
    
     @Override
     public User getUserByEmail(String user_email, String user_password) {
        User user = null;
        String query = "SELECT * FROM tbluser WHERE user_email = ? AND user_pass = ?"; // adjust table name accordingly
        
        try  {
            connection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, user_email);
            stmt.setString(2, user_password);
            rs = stmt.executeQuery();
            
           if (rs.next()) {
                user = new User(
                    rs.getInt("user_id"),
                    rs.getString("user_name"),
                    rs.getString("user_email"),
                    rs.getString("user_pass"),
                    rs.getString("role")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
     
     @Override
    public boolean registerUser(User user) {
//        if (userExists(user.getUser_username())) {
//            return false;  // Username already exists
//        }

        String query = "INSERT INTO tbluser (user_name, user_email, user_pass, role) VALUES (?,?,?,?)";
        try {
            connection();
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, user.getUser_name());
            stmt.setString(2, user.getUser_email());
            stmt.setString(3, user.getUser_pass()); // Use hashing in production
            stmt.setString(4, user.getUser_role());
           

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;  // Return true if insertion was successful

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     @Override
    public boolean userExists(User user) {
        String query = "SELECT user_email FROM tbluser WHERE user_email = ?";
        try {
            connection();
            stmt = con.prepareStatement(query);

            stmt.setString(1, user.getUser_email());
            rs = stmt.executeQuery();
            return rs.next();  // If a result exists, user already exists

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
     
     
     
}
