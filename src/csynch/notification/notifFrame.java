
package csynch.notification;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Font;
import javax.swing.UIManager;
import main.glasspanepopup.GlassPanePopup;
//import csynch.notification.notifPanel;


public class notifFrame extends javax.swing.JFrame {


    public notifFrame() {
        initComponents();
        GlassPanePopup.install(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdNotif = new sample.message.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdNotif.setBackground(new java.awt.Color(255, 255, 255));
        cmdNotif.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\notification.png")); // NOI18N
        cmdNotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNotifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(cmdNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cmdNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNotifActionPerformed
       
    }//GEN-LAST:event_cmdNotifActionPerformed

    public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("csynch.table");
        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY,Font.BOLD, 10));
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notifFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sample.message.Button cmdNotif;
    // End of variables declaration//GEN-END:variables
}
