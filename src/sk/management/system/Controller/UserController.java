/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.Controller;

import javax.swing.JOptionPane;
import sk.management.system.DAOIMPL.UserDAOIMPL;
import sk.management.system.model.User;
import sk.management.system.view.auth.RegisterPanel;

/**
 *
 * @author Administrator
 */
public class UserController {
    private final UserDAOIMPL userDAO = new UserDAOIMPL();
    
    
    
    public boolean loginUser(String user_email, String user_password){
        
        User user = userDAO.getUserByEmail(user_email, user_password);
        if (user != null && user.getUser_pass().equals(user_password)){
           return true; 
        }
        return false;
    }
     public boolean registerUser(User user) {
         
        if (!isValidUser(user)) {
            return false;
        }
        return userDAO.registerUser(user);
    }

    private boolean isValidUser(User user) {
        return !user.getUser_name().isEmpty() &&
               !user.getUser_role().isEmpty() &&
               !user.getUser_email().isEmpty() &&
               user.getUser_pass().length() >= 6 &&
               !user.getUser_role().equalsIgnoreCase("admin");
    }

      


    public boolean userExists(User user_email) {
        return userDAO.userExists(user_email);  // Checks if user already exists
    }
    
}
