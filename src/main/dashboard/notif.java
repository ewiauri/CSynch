package main.dashboard;

//import com.formdev.flatlaf.FlatLaf;
//import com.formdev.flatlaf.fonts.inter.FlatInterFont;
//import java.awt.Font;
import csynch.notification.*;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import combo_suggestion.ModernScrollBarUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
//import javax.swing.UIManager;

public class notif extends javax.swing.JPanel {


    public notif() {
        initComponents();
        setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        JScrollBar sb = scroll.getVerticalScrollBar();
        sb.setOpaque(false);
        sb.setForeground(new Color(33, 140, 206));
        sb.setPreferredSize(new Dimension(8, 8));
        sb.setUI(new ModernScrollBarUI());
        panel.setLayout(new MigLayout("insets 0, fillx, wrap", "[fill]"));
        loadNoti();
    }
    
    public void loadNoti(){
        
        panel.add(new item("[System]", "Welcome to Class Synch!", "Just now."));
        panel.add(new item( "[System]", "Dive right in and pick up what you left off.", "Just now."));
        panel.add(new item( "[System]", "Enjoy your time on Class Synch!", "Just now."));
    }

    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs.create();
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int header = 10; 
        AffineTransform tran = new AffineTransform();
        tran.translate(getWidth()-25, 5);
        tran.rotate(Math.toRadians(45));
        Path2D p = new Path2D.Double(new RoundRectangle2D.Double(0, 0, 20, 20, 5, 5), tran);
        Area area = new Area(p);
        area.add(new Area(new RoundRectangle2D.Double(0,header, getWidth(), getHeight()-header, 10,10)));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNotif = new javax.swing.JPanel();
        notifTxt = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        showAllNotifs = new javax.swing.JButton();

        panelNotif.setBackground(new java.awt.Color(102, 102, 102));
        panelNotif.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 10, 10, 10));

        notifTxt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        notifTxt.setForeground(new java.awt.Color(204, 204, 204));
        notifTxt.setText("Notifications");

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        scroll.setViewportView(panel);

        showAllNotifs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showAllNotifs.setForeground(new java.awt.Color(204, 204, 204));
        showAllNotifs.setText("Show all");
        showAllNotifs.setContentAreaFilled(false);
        showAllNotifs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showAllNotifs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllNotifsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNotifLayout = new javax.swing.GroupLayout(panelNotif);
        panelNotif.setLayout(panelNotifLayout);
        panelNotifLayout.setHorizontalGroup(
            panelNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotifLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showAllNotifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notifTxt)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelNotifLayout.setVerticalGroup(
            panelNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notifTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showAllNotifs, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelNotif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showAllNotifsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllNotifsActionPerformed
        //cmd
    }//GEN-LAST:event_showAllNotifsActionPerformed

    public static void main(String args[]) {
//        FlatInterFont.install();
//        FlatLaf.registerCustomDefaultsSource("csynch.table");
//        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY,Font.BOLD, 10));
//        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notifFrame().setVisible(true);
//                new notif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel notifTxt;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelNotif;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JButton showAllNotifs;
    // End of variables declaration//GEN-END:variables
}
