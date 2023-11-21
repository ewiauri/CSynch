
package main.dashboard;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Font;
import javax.swing.UIManager;
import main.drawer.MyDrawerBuilder;
import raven.drawer.Drawer;
import raven.popup.GlassPanePopup;
import csynch.tabbed.WindowsTabbed;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        GlassPanePopup.install(this);
        MyDrawerBuilder myDrawerBuilder = new MyDrawerBuilder();
        Drawer.getInstance().setDrawerBuilder(myDrawerBuilder);
        initComponents();
        WindowsTabbed.getInstance().install(this, bodyPanel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        bodyPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        bodyPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        FlatInterFont.installSemiBold();
        
        FlatLaf.setPreferredSemiboldFontFamily( FlatInterFont.FAMILY_SEMIBOLD );
            FlatLaf.registerCustomDefaultsSource("csynch.theme");
            
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY_SEMIBOLD, Font.PLAIN, 12));
       
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    // End of variables declaration//GEN-END:variables
}
