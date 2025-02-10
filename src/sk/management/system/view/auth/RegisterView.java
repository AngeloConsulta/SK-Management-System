/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.management.system.view.auth;

import sk.management.system.view.auth.UserView;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingUtilities;
import sk.management.system.Controller.UserController;
import sk.management.system.model.User;

/**
 *
 * @author Administrator
 */
public class RegisterView extends JPanel{
    private JTextField txtFullName, txtUsername, txtAddress,txtContact ;
    private JPasswordField txtPassword, txtConfirmPassword;
    private JComboBox<String> cmbRole, cmbGender;
    private JSpinner spnDob;
    private JButton btnRegister, btnCancel, btnBack;
    private UserController controller;

    public RegisterView(UserController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
       setLayout(new GridBagLayout());  // Use GridBagLayout for structured UI
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Full Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Full Name:"), gbc);

        gbc.gridx = 1;
        txtFullName = new JTextField(20);
        add(txtFullName, gbc);

        // Date of Birth
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Date of Birth:"), gbc);

        gbc.gridx = 1;
        spnDob = new JSpinner(new SpinnerDateModel());
        spnDob.setEditor(new JSpinner.DateEditor(spnDob, "yyyy-MM-dd"));
        add(spnDob, gbc);

        // Gender
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Gender:"), gbc);

        gbc.gridx = 1;
        cmbGender = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        add(cmbGender, gbc);

        // Address
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Address:"), gbc);

        gbc.gridx = 1;
        txtAddress = new JTextField(20);
        add(txtAddress, gbc);

        // Contact Number
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Contact No.:"), gbc);

        gbc.gridx = 1;
        txtContact = new JTextField(20);
        add(txtContact, gbc);

        // Username
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        txtUsername = new JTextField(20);
        add(txtUsername, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        txtPassword = new JPasswordField(20);
        add(txtPassword, gbc);

        // Confirm Password
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(new JLabel("Confirm Password:"), gbc);

        gbc.gridx = 1;
        txtConfirmPassword = new JPasswordField(20);
        add(txtConfirmPassword, gbc);

        // Role
        gbc.gridx = 0;
        gbc.gridy = 8;
        add(new JLabel("Role:"), gbc);

        gbc.gridx = 1;
        cmbRole = new JComboBox<>(new String[]{"SK Chairman", "SK Kagawad", "Admin"});
        add(cmbRole, gbc);

        // Register Button
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        btnRegister = new JButton("Register");
        add(btnRegister, gbc);

        // Cancel Button
        gbc.gridy = 10;
        btnCancel = new JButton("Cancel");
        add(btnCancel, gbc);

        // Back Button
        gbc.gridy = 11;
        btnBack = new JButton("Back");
        btnBack.setBackground(new Color(178, 34, 34));
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 12));
        add(btnBack, gbc);

        // Button Actions
        btnRegister.addActionListener(e -> doRegister());
        btnCancel.addActionListener(e -> ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose());
        btnBack.addActionListener(e -> goBack());
    }

    private void goBack() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();  // Close register window
        new UserView(controller).setVisible(true); // Return to login
    }

    private User doRegister() {
        User newUser = new User();
        String fullName = txtFullName.getText().trim();
        Date dob = new Date(((java.util.Date) spnDob.getValue()).getTime());
        String gender = cmbGender.getSelectedItem().toString();
        String address = txtAddress.getText().trim();
        String contact = txtContact.getText().trim();
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();
        String confirmPassword = new String(txtConfirmPassword.getPassword()).trim();
        String role = cmbRole.getSelectedItem().toString();

        // Validate required fields
        if (fullName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return newUser;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return newUser;
        }

        if (username.equalsIgnoreCase("admin")) {
            JOptionPane.showMessageDialog(this, "Cannot register as Admin!", "Error", JOptionPane.ERROR_MESSAGE);
            return newUser;
        }

        newUser.setUser_name(fullName);
        newUser.setUser_dob(dob);
        newUser.setUser_gender(gender);
        newUser.setUser_address(address);
        newUser.setUser_contact(contact);
        newUser.setUser_username(username);
        newUser.setUser_pass(password);
        newUser.setUser_role(role);

        boolean registered = controller.registerUser(newUser);

        if (registered) {
            JOptionPane.showMessageDialog(this, "Registration Successful!");
            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
            new UserView(controller).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return newUser;
    }
    
}
