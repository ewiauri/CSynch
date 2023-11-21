
package splashscreen;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.UIManager;
import main.csynch.edu.LoginFrame;



public class ScreenSplash extends javax.swing.JDialog {

    public ScreenSplash(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(221, 221, 221));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvesPanel1 = new splashscreen.CurvesPanel();
        jLabel2 = new javax.swing.JLabel();
        pro = new splashscreen.ProgressBarCustom();
        ibStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csynch/logo/logo.png"))); // NOI18N

        ibStatus.setForeground(new java.awt.Color(101, 101, 101));
        ibStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibStatus.setText("Status");

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ibStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibStatus)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(curvesPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run(){
                try{
                    
                    doTask("Connect To Class Sync ...", 10);
                        doTask("Please wait in 10s ...", 20);
                            doTask("Please wait in 9s ...", 30);
                            doTask("Please wait in 8s ...", 40);
                            doTask("Please wait in 7s ...", 50);
                            doTask("Please wait in 6s ...", 60);
                            doTask("Please wait in 5s ...", 70);
                            doTask("Please wait in 4s ...", 80);
                            doTask("Please wait in 3s ...", 90);
                            doTask("Please wait in 2s ...", 95);
                            doTask("Please wait in 1s ...", 96);
                            doTask("Please wait in 0s ...", 100);
                            doTask("Done! ...", 100);
//                            Notifications.getInstance().show(Notifications.Type.SUCCESS,Notifications.Location.TOP_CENTER,"Welcome Back!");
                            
                            dispose();
                            curvesPanel1.stop();
                            
                }catch (Exception e){
                    e.printStackTrace();
                }
                
            }
        }). start();
    }//GEN-LAST:event_formWindowOpened
    
    private void doTask(String taskName, int progress) throws Exception{
        ibStatus.setText(taskName);
        Thread.sleep(1000);
        pro.setValue(progress);
        //new splashscreen.SplashScreen(null, true).setVisible(true);
    }
    
    public static void main(String args[]) {
        FlatInterFont.installSemiBold();
        
        FlatLaf.setPreferredSemiboldFontFamily( FlatInterFont.FAMILY_SEMIBOLD );
            FlatLaf.registerCustomDefaultsSource("csynch.theme");
            
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY_SEMIBOLD, Font.PLAIN, 12));
       
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                ScreenSplash dialog = new ScreenSplash(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private splashscreen.CurvesPanel curvesPanel1;
    private javax.swing.JLabel ibStatus;
    private javax.swing.JLabel jLabel2;
    private splashscreen.ProgressBarCustom pro;
    // End of variables declaration//GEN-END:variables

    public static class SplashScreen {

        public SplashScreen(Object object, boolean b) {
            
        }
    }
}
