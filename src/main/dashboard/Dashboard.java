
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

        dateChange = new com.raven.datechooser.DateChooser();
        bodyPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();
        dateBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        dateChange.setForeground(new java.awt.Color(159, 106, 185));
        dateChange.setDateFormat("dd-MMMM-yyyy");
        dateChange.setTextRefernce(txtDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        bodyPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        bodyPanel.setLayout(null);

        sidePanel.setLayout(null);

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        sidePanel.add(txtDate);
        txtDate.setBounds(20, 30, 190, 26);

        dateBtn.setText("↩");
        dateBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBtnActionPerformed(evt);
            }
        });
        sidePanel.add(dateBtn);
        dateBtn.setBounds(210, 30, 30, 27);

        jButton1.setText("↻");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sidePanel.add(jButton1);
        jButton1.setBounds(240, 30, 30, 27);

        bodyPanel.add(sidePanel);
        sidePanel.setBounds(10, 0, 290, 500);

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 0, 800, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void dateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBtnActionPerformed

        dateChange.showPopup();
    }//GEN-LAST:event_dateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dateChange.toDay();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton dateBtn;
    private com.raven.datechooser.DateChooser dateChange;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
