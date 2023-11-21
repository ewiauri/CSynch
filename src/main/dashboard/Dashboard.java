
package main.dashboard;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import java.awt.Font;
import javax.swing.UIManager;
import main.drawer.MyDrawerBuilder;
import raven.drawer.Drawer;
import raven.popup.GlassPanePopup;
import csynch.tabbed.WindowsTabbed;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        GlassPanePopup.install(this);
        MyDrawerBuilder MyDrawerBuilder = new MyDrawerBuilder();
        Drawer.getInstance().setDrawerBuilder(MyDrawerBuilder);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
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

        bodyPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 0, 190, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        FlatInterFont.installSemiBold();
        FlatLaf.setPreferredSemiboldFontFamily( FlatInterFont.FAMILY_SEMIBOLD );
            FlatLaf.registerCustomDefaultsSource("csynch.theme");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY_SEMIBOLD, Font.PLAIN, 12));
        //for  dark  mode
        //FlatMacDarkLaf.setup();
        //for  light  mode
        FlatLightLaf.setup();
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
