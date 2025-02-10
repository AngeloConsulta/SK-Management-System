package sk.management.system.view.auth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;
import sk.management.system.Controller.UserController;
import sk.management.system.Main;
import sk.management.system.model.User;
import sk.management.system.view.dashboard.Form_Dashboard;

public class UserView extends JPanel {

   
    
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JComboBox<String> cmbRole;
    private JButton btnLogin;
    private JButton btnRegister;
    private UserController controller;
    private Point initialClick; 

    public UserView(UserController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
        setLayout(null);
        setBackground(Color.WHITE);
        JScrollPane scroll = createScroll();
        panelLogin = createPanelMenu();
        scroll.setViewportView(panelLogin);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);
//        JPanel panelLogin = new JPanel(new GridBagLayout()); // Flexible Layout
//        panelLogin.setBackground(new Color(240, 240, 240));
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.insets = new Insets(5, 5, 5, 5);
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.anchor = GridBagConstraints.CENTER;
//        gbc.weightx = 1.0;

        // Labels
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 30, 100, 25);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 70, 100, 25);

        JLabel lblRole = new JLabel("Role:");
        lblRole.setBounds(50, 110, 100, 25);

        // Input Fields
        txtUsername = new JTextField();
        txtUsername.setBounds(150, 30, 180, 25);
        txtUsername.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 70, 180, 25);
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        // Role ComboBox
        cmbRole = new JComboBox<>(new String[]{"SK Chairman", "SK Kagawad", "Admin"});
        cmbRole.setBounds(150, 110, 180, 25);

        // Login Button
        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 160, 200, 35);
        btnLogin.setBackground(new Color(70, 130, 180));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
        btnLogin.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

        // Register Button
        btnRegister = new JButton("Register");
        btnRegister.setBounds(100, 200, 200, 30);
        btnRegister.setBackground(new Color(50, 150, 50));
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFocusPainted(false);
        btnRegister.setFont(new Font("Arial", Font.BOLD, 14));

        // Button Actions
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterUser regView = new RegisterUser(controller);
                regView.setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                    if (frame != null) {
                    frame.dispose();
                    }

               
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doLogin();
            }
        });
//         // Set Panel Inside Scroll Pane
//        scrollPane.setViewportView(panelLogin);
//        add(scrollPane, BorderLayout.CENTER);

        // Add Components to Panel
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(lblRole);
        add(cmbRole);
        add(btnLogin);
        add(btnRegister);
        
        addDragFunctionality(panelLogin);
    }
    private JScrollPane createScroll() {
    // Scrollable Panel (For Flexibility)
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       
        return scrollPane;
    }
     private JPanel createPanelMenu() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
     }
      private JButton createButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 35));
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        return button;
      }

    private void doLogin() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();
        String role = cmbRole.getSelectedItem().toString().toLowerCase();

        User loginUser = new User(username, password, role);
        boolean authenticated = controller.loginUser(username, password);

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
    private MigLayout menuLayout;
    private JPanel panelLogin;
     private void addDragFunctionality(JPanel panel) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint(); // Store initial click position
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get current location
                int thisX = panel.getX();
                int thisY = panel.getY();

                // Compute new position
                int newX = thisX + e.getX() - initialClick.x;
                int newY = thisY + e.getY() - initialClick.y;

                panel.setLocation(newX, newY); // Move the panel
            }
        });
     }
    
}
