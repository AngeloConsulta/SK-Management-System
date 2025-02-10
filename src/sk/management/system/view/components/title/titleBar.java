///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package sk.management.system.view.components.title;
//
//import java.awt.Color;
//import java.awt.Cursor;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowStateListener;
////import javaswingdev.swing.titlebar.ComponentResizer;
//import javax.swing.JButton;
//import javax.swing.JComponent;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.SwingUtilities;
//import net.miginfocom.swing.MigLayout;
//
//public class titleBar {
//     private JFrame fram;
//    private ComponentResizer resizer;
//    private JPanel panel;
//    private boolean register = true;
//    private int x;
//    private int y;
//
//    public titleBar() {
//        init();
//    }
//
//    public void initJFram(JFrame fram) {
//        this.fram = fram;
//        resizer = new ComponentResizer();
//        resizer.setSnapSize(new Dimension(10, 10));
//        resizer.setMinimumSize(new Dimension(800, 600));
//        resizer.registerComponent(fram);
//        fram.addWindowStateListener(new WindowStateListener() {
//            @Override
//            public void windowStateChanged(WindowEvent e) {
//                if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
//                    resizer.deregisterComponent(fram);
//                    register = false;
//                } else if (e.getNewState() == JFrame.NORMAL) {
//                    if (!register) {
//                        resizer.registerComponent(fram);
//                        register = true;
//                    }
//                }
//            }
//        });
//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                if (fram.getExtendedState() == JFrame.NORMAL && SwingUtilities.isLeftMouseButton(e)) {
//                    x = e.getX() + 3;
//                    y = e.getY() + 3;
//                }
//            }
//        });
//        panel.addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                if (SwingUtilities.isLeftMouseButton(e)) {
//                    if (fram.getExtendedState() == JFrame.NORMAL) {
//                        fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
//                    }
//                }
//            }
//        });
//    }
//
//    private void init() {
////        setLayout(new MigLayout("inset 3, fill", "[grow][]", "[fill]"));
//        panel = new JPanel();
//        panel.setOpaque(false);
//        panel.setLayout(new MigLayout("inset 3, fill", "[grow][center][grow]", "[fill]"));
//
//        // Title Label
//        JLabel titleLabel = new JLabel("SK Management System");
//        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
//        titleLabel.setForeground(Color.WHITE);
//
//        // Control Buttons
//        Item close = new Item(new Color(235, 47, 47));
//        Item minimize = new Item(new Color(220, 213, 53));
//        Item resize = new Item(new Color(44, 203, 87));
//
//        panel.add(titleLabel, "cell 1 0, center"); // Title in center
//        panel.add(minimize, "cell 2 0, right");
//        panel.add(resize, "cell 2 0, right");
//        panel.add(close, "cell 2 0, right");
//
////        add(panel);
//
//        // Button Actions
//        close.addActionListener(e -> System.exit(0));
//        minimize.addActionListener(e -> fram.setState(JFrame.ICONIFIED));
//        resize.addActionListener(e -> {
//            if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
//                fram.setExtendedState(JFrame.NORMAL);
//            } else {
//                fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
//            }
//        });
//    }
//
//
//
//    private class Item extends JButton {
//        public Item(Color bgColor) {
//            setBackground(bgColor);
//            setContentAreaFilled(false);
//            setBorder(null);
//            setPreferredSize(new Dimension(11, 11));
//            setCursor(new Cursor(Cursor.HAND_CURSOR));
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            Graphics2D g2 = (Graphics2D) g.create();
//            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//            int width = getWidth();
//            int height = getHeight();
//            g2.setColor(getBackground());
//            g2.fillOval(0, 0, width, height);
//            g2.dispose();
//        }
//    }
//}
//
