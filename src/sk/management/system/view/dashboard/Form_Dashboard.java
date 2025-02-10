package sk.management.system.view.dashboard;

import sk.management.system.view.cards.ModelCard;

public class Form_Dashboard extends javax.swing.JPanel {

    public Form_Dashboard() {
        initComponents();
        init();
    }

    private void init() {
//        table.fixTable(jScrollPane1);
//        table.addRow(new Object[]{"1", "Mike Bhand", "mikebhand@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"2", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
//        table.addRow(new Object[]{"3", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
//        table.addRow(new Object[]{"4", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"5", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"6", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
//        table.addRow(new Object[]{"7", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
//        table.addRow(new Object[]{"8", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"9", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"10", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"11", "Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018"});
//        table.addRow(new Object[]{"12", "Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018"});
//        table.addRow(new Object[]{"13", "Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018"});
//        table.addRow(new Object[]{"14", "Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018"});

        //  init card data
        card1.setData(new ModelCard(null, null, null, "PHP 200K", "SK Money Monthly"));
        card2.setData(new ModelCard(null, null, null, " 2.5K", "Youth Count Monthly"));
        card3.setData(new ModelCard(null, null, null, " 500", "Activities Implemented Monthly"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card3 = new sk.management.system.view.cards.Card();
        card2 = new sk.management.system.view.cards.Card();
        card1 = new sk.management.system.view.cards.Card();
        roundPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setOpaque(false);

        card3.setColor1(new java.awt.Color(51, 255, 204));
        card3.setColor2(new java.awt.Color(0, 153, 153));
        card3.setDescription("Activities Implemented Monthly");

        card2.setColor1(new java.awt.Color(51, 255, 51));
        card2.setColor2(new java.awt.Color(0, 204, 51));
        card2.setDescription("Youth Count  Monthly");

        card1.setDescription("SK Money  Monthly");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Name", "Email", "Position", "Date Join"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("#");
            table.getColumnModel().getColumn(1).setHeaderValue("Name");
            table.getColumnModel().getColumn(2).setHeaderValue("Email");
            table.getColumnModel().getColumn(3).setHeaderValue("Position");
            table.getColumnModel().getColumn(4).setHeaderValue("Date Join");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sk.management.system.view.cards.Card card1;
    private sk.management.system.view.cards.Card card2;
    private sk.management.system.view.cards.Card card3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel roundPanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
