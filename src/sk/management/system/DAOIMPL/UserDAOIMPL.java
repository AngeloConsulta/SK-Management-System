/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.DAOIMPL;

import sk.management.system.model.User;
import sk.management.system.util.DBConnection;
import java.sql.SQLException;
import java.util.Date;
//import java.sql.Date;
/**
 *
 * @author Administrator
 */
public class UserDAOIMPL extends DBConnection{
    
    
     public User getUserByUsername(String username, String password) {
        User user = null;
        String query = "SELECT * FROM tbluser WHERE user_username = ? AND user_pass = ?"; // adjust table name accordingly
        
        try  {
            connection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            
           if (rs.next()) {
                user = new User(
                    rs.getInt("user_id"),
                    rs.getString("user_name"),
                    rs.getDate("user_bdate"),
                    rs.getString("user_gender"),
                    rs.getString("user_address"),
                    rs.getString("user_contactno"),
                    rs.getString("user_username"),
                    rs.getString("user_pass"),
                    rs.getString("role")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
     
    public boolean registerUser(User user) {
//        if (userExists(user.getUser_username())) {
//            return false;  // Username already exists
//        }

        String query = "INSERT INTO tbluser (user_name, user_bdate, user_gender, user_address,  user_contactno, user_username, user_pass, role) VALUES (?,?,?,?,?,?,?,?)";
        try {
            connection();
            stmt = con.prepareStatement(query);
            
            stmt.setString(1, user.getUser_name());
            stmt.setDate(2, new java.sql.Date(user.getUser_dob().getTime()));
            stmt.setString(3, user.getUser_gender());
            stmt.setString(4, user.getUser_address());
            stmt.setString(5, user.getUser_contact());
            stmt.setString(6, user.getUser_username());
            stmt.setString(7, user.getUser_pass()); // Use hashing in production
            stmt.setString(8, user.getUser_role());
           

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;  // Return true if insertion was successful

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean userExists(String username) {
        String query = "SELECT user_username FROM tbluser WHERE user_username = ?";
        try {
            connection();
            stmt = con.prepareStatement(query);

            stmt.setString(1, username);
            rs = stmt.executeQuery();
            return rs.next();  // If a result exists, user already exists

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
     
     
     
}
