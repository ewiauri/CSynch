
package csynch.notification;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import javax.swing.UIManager;
import main.glasspanepopup.DefaultLayoutCallBack;
import main.glasspanepopup.DefaultOption;
import main.glasspanepopup.GlassPanePopup;
import net.miginfocom.layout.ComponentWrapper;
import net.miginfocom.layout.LayoutCallback;


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
                .addContainerGap(729, Short.MAX_VALUE)
                .addComponent(cmdNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cmdNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNotifActionPerformed
       GlassPanePopup.showPopup(new notifPanel(), new DefaultOption(){
       
           @Override
           public float opacity(){
               return 0;
           } 
          
           public LayoutCallback getLayoutCallBack(Component parent){
               return new DefaultLayoutCallBack(parent){
                   public void correctBounds(Component cw){
                        if(parent.isVisible()){
                            Point pl = parent.getLocationOnScreen();
                            Point bl = cmdNotif.getLocationOnScreen();
                            int x=bl.x-pl.x;
                            int y=bl.y-pl.x;
                            y+=(1f-getAnimate())*-10f;
                            cw.setBounds(x-cw.getWidth()+cmdNotif.getWidth(), y+cmdNotif.getHeight(), cw.getWidth(), cw.getHeight());
                        }else{
                            super.correctBounds((ComponentWrapper) cw);
                        }
                   }

               };
           }
       });
    }//GEN-LAST:event_cmdNotifActionPerformed

    public static void main(String args[]) {
//        FlatInterFont.install();
//        FlatLaf.registerCustomDefaultsSource("csynch.table");
//        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY,Font.BOLD, 12));
//        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notifFrame().setVisible(true);
//                new notifPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sample.message.Button cmdNotif;
    // End of variables declaration//GEN-END:variables
}
