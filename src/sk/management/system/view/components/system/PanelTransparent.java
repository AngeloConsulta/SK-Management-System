package sk.management.system.view.components.system;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class PanelTransparent extends JPanel {

    public float getTransparent() {
        return transparent;
    }

    public void setTransparent(float transparent) {
        this.transparent = transparent;
        repaint();
    }

    private float transparent = 0.2f;

    public PanelTransparent() {
        setOpaque(false);
        setBackground(new Color(255, 255, 255));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
//        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparent));
//        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new GradientPaint(0, 0, SystemColor.MAIN_COLOR_1, getWidth(), getHeight(), SystemColor.MAIN_COLOR_2));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setComposite(AlphaComposite.SrcOver);
        super.paintComponent(grphcs);
    }
}
