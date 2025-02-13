/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sk.management.system.view.auth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;
import sk.management.system.Controller.UserController;
import sk.management.system.Main;
import sk.management.system.model.User;
import sk.management.system.view.dashboard.Form_Dashboard;

public class LoginPanel extends javax.swing.JPanel {
    
   
    private UserController controller;
    
    public LoginPanel() {
        this.controller = new UserController(); 
        initComponents();
        btnLog.setBackground(sk.management.system.view.components.system.SystemColor.MAIN_COLOR_2);
        btnReg.setBackground(sk.management.system.view.components.system.SystemColor.MAIN_COLOR_1);
        btnLog.setForeground(sk.management.system.view.components.system.SystemColor.MAIN_COLOR_1);
        btnReg.setForeground(sk.management.system.view.components.system.SystemColor.MAIN_COLOR_2);
        jLabel2.setForeground(sk.management.system.view.components.system.SystemColor.MAIN_COLOR_2);
        Password1.setForeground(sk.management.system.view.components.system.SystemColor.MAIN_COLOR_2);
        
//        Get the constructor for Icon and placeholder
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/sk/management/system/images/mail.png")));
        txtEmail.setHint("Email");
        add(txtEmail, "w 60%");
        
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/sk/management/system/images/pass.png")));
        txtPass.setHint("Password");
        add(txtPass, "w 60%");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        chkPassword = new javax.swing.JCheckBox();
        Password1 = new javax.swing.JLabel();
        txtEmail = new sk.management.system.view.auth.MyTextField();
        txtPass = new sk.management.system.view.auth.MyPasswordField();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SK MANAGEMENT SYSTEM");

        btnLog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLog.setText("Login");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReg.setText("Register");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        chkPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkPassword.setText("Show Password");
        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });

        Password1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        Password1.setForeground(new java.awt.Color(153, 51, 255));
        Password1.setText("Don't have an account?");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Password1)
                                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkPassword)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkPassword)
                .addGap(18, 18, 18)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(Password1)
                .addGap(18, 18, 18)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     public void setController(UserController controller) {
        this.controller = controller;
    }

    private void doLogin() {
        String email = txtEmail.getText().trim();
        String password = new String(txtPass.getPassword()).trim();
        
        if (controller == null) {
            JOptionPane.showMessageDialog(this, "System error: Controller not initialized!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       
        boolean authenticated = controller.loginUser(email, password);

        if (authenticated) {
            SwingUtilities.getWindowAncestor(this).dispose();

            // Open the Main Dashboard
            Main mainDashboard = new Main();
            mainDashboard.setVisible(true);

           // Show the default dashboard form
            mainDashboard.showForm(new Form_Dashboard());

        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        RegisterUser regView = new RegisterUser(controller);
                regView.setVisible(true);
                regView.setLocationRelativeTo(null);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
                    if (frame != null) {
                    frame.dispose();
                    }
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        doLogin();
    }//GEN-LAST:event_btnLogActionPerformed

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
        // TODO add your handling code here:
        if(chkPassword.isSelected()){
            txtPass.setEchoChar((char)0);
        }else{
            txtPass.setEchoChar('*');
        }

    }//GEN-LAST:event_chkPasswordActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password1;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnReg;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JLabel jLabel2;
    private sk.management.system.view.auth.MyTextField txtEmail;
    private sk.management.system.view.auth.MyPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
