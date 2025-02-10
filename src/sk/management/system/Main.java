package sk.management.system;

import java.awt.Component;
import sk.management.system.view.dashboard.Form_Dashboard;
import sk.management.system.view.dashboard.Form_Empty;
import sk.management.system.view.components.EventMenuSelected;

public class Main extends javax.swing.JFrame {
    
    private static Main main;
    
    public Main() {
        initComponents();
        init();
    }
    
    private void init() {
        main = this;
//        titleBar.initJFram(this);
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new Form_Dashboard());
                } else {
                    showForm(new Form_Empty(index + " " + indexSubMenu));
                }
            }
        });
        menu.setSelectedIndex(0, 0);
    }
    
    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    
    public static Main getMain() {
        return main;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu = new sk.management.system.view.components.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("SK MANAGEMENT SYSTEM");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private sk.management.system.view.components.Menu menu;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
