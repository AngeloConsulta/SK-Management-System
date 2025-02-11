/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sk.management.system.DAO;

import sk.management.system.model.User;

/**
 *
 * @author Administrator
 */
public interface UserDAO {
      public User getUserByEmail(String user_email, String user_password);
      public boolean registerUser(User user);
      public boolean userExists(User user) ;
}
