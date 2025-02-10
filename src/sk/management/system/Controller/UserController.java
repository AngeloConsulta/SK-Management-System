/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.Controller;

import sk.management.system.DAOIMPL.UserDAOIMPL;
import sk.management.system.model.User;
import sk.management.system.view.auth.UserView;

/**
 *
 * @author Administrator
 */
public class UserController {
    private final UserDAOIMPL userDAO = new UserDAOIMPL();
    
    
    
    public boolean loginUser(String username , String password){
        User user = userDAO.getUserByUsername(username, password);
        if (user != null && user.getUser_pass().equals(user.getUser_pass())){
           return true; 
        }
        return false;
    }
     public boolean registerUser(User user) {
        return userDAO.registerUser(user);  // Calls DAO to save new user
    }

    public boolean userExists(String username) {
        return userDAO.userExists(username);  // Checks if user already exists
    }
    
}
