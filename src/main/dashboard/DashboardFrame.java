
package main.dashboard;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Font;
import javax.swing.UIManager;
import main.drawer.MyDrawerBuilder;
import raven.drawer.Drawer;
import raven.popup.GlassPanePopup;


public class DashboardFrame extends javax.swing.JFrame {

    public DashboardFrame() {
        //sliding  pane animation  starts  here
        GlassPanePopup.install(this);
        MyDrawerBuilder MyDrawerBuilder = new MyDrawerBuilder();
        Drawer.getInstance().setDrawerBuilder(MyDrawerBuilder);
        // sliding  pane animation  ends  here
        
        //positioning  kineme
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
        
        initComponents();
    }

    public void initcomponents() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawerBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        dashboardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drawerBtn.setText("Show Drawer");
        drawerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(drawerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        LogOutBtn.setText("Log out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        dashboardPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void drawerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawerBtnActionPerformed
        //shows up  on  JFrame  once  clicked  the  button
        Drawer.getInstance().showDrawer();
    }//GEN-LAST:event_drawerBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

 
    public static void main(String args[]) {
        FlatInterFont.installSemiBold();
        FlatLaf.setPreferredSemiboldFontFamily( FlatInterFont.FAMILY_SEMIBOLD );
            FlatLaf.registerCustomDefaultsSource("csynch.theme");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY_SEMIBOLD, Font.PLAIN, 12));
        //for  dark  mode
        FlatMacDarkLaf.setup();
        //for  light  mode
        //FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton drawerBtn;
    // End of variables declaration//GEN-END:variables
}
