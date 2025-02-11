/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sk.management.system;

import javax.swing.SwingUtilities;
import sk.management.system.Controller.UserController;

import sk.management.system.util.DBConnection;
import sk.management.system.view.auth.UserLogin;

/**
 *
 * @author Administrator
 */
public class SKManagementSystem extends DBConnection{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }
    
}
