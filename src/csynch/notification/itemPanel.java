
package csynch.notification;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Font;
import javax.swing.UIManager;

public class itemPanel extends javax.swing.JPanel {

    public itemPanel( String name, String des, String time) {
        initComponents();
        IbName.setText(name);
        IbDescription.setText(des);
        IbTime.setText(time);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IbName = new javax.swing.JLabel();
        IbDescription = new javax.swing.JLabel();
        IbTime = new javax.swing.JLabel();
        button1 = new sample.message.Button();

        setForeground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        IbName.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        IbName.setForeground(new java.awt.Color(204, 204, 255));
        IbName.setText("[System]");

        IbDescription.setForeground(new java.awt.Color(188, 171, 190));
        IbDescription.setText("You have successfully logged in.");

        IbTime.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        IbTime.setForeground(new java.awt.Color(204, 204, 204));
        IbTime.setText("Just now.");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csynch/notification/img/csync.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IbName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbDescription))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IbName)
                        .addGap(5, 5, 5)
                        .addComponent(IbDescription)
                        .addGap(5, 5, 5)
                        .addComponent(IbTime)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
//        FlatInterFont.install();
//        FlatLaf.registerCustomDefaultsSource("csynch.table");
//        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY,Font.BOLD, 10));
//        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notifFrame().setVisible(true);
//                new notifPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbDescription;
    private javax.swing.JLabel IbName;
    private javax.swing.JLabel IbTime;
    private sample.message.Button button1;
    // End of variables declaration//GEN-END:variables
}
