/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sk.management.system.view.auth;

import sk.management.system.view.components.system.PanelTransparent;
import sk.management.system.view.components.system.SystemColor;

/**
 *
 * @author Administrator
 */
public class panelDisplay extends PanelTransparent {

    /**
     * Creates new form panelDisplay
     */
    public panelDisplay() {
        initComponents();
        setTransparent(0.5f);
        setBackground(SystemColor.MAIN_COLOR_1); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemColor1 = new sk.management.system.view.components.system.SystemColor();
        systemColor2 = new sk.management.system.view.components.system.SystemColor();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sk.management.system.view.components.system.SystemColor systemColor1;
    private sk.management.system.view.components.system.SystemColor systemColor2;
    // End of variables declaration//GEN-END:variables
}
