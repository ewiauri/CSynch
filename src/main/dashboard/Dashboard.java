
package main.dashboard;


import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import main.drawer.MyDrawerBuilder;
import raven.drawer.Drawer;
import raven.popup.GlassPanePopup;
import csynch.tabbed.WindowsTabbed;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        GlassPanePopup.install(this);
        MyDrawerBuilder myDrawerBuilder = new MyDrawerBuilder();
        Drawer.getInstance().setDrawerBuilder(myDrawerBuilder);
        initComponents();
        WindowsTabbed.getInstance().install(this, bodyPanel);
        tableData.setDefaultRenderer(Object.class, new csynch.table.TableGradientCell());
        dataTester();
//        Table();
    }
    
    private void dataTester(){
    
        DefaultTableModel model = (DefaultTableModel)tableData.getModel();
            model.addRow(new Object [] {    1, "Introduction to Java", "Jan 12", 4.9, "Elementary"});
            model.addRow(new Object [] {    2, "Styling with CSS", "Feb 06", 5.0, "Intermediate"});
            model.addRow(new Object [] {    3, "Basics To Programming", "Mar 02", 4.3, "Elementary"});
            model.addRow(new Object [] {    4, "HTML Basics", "Apr 19", 5.0, "Intermediate"}); 
            model.addRow(new Object [] {    5, "Learn to Program in Python", "May 12", 5.0, "Advanced"});
            model.addRow(new Object [] {    6, "Learn to Program in Java", "Jun 04", 4.9, "Advanced"});
            model.addRow(new Object [] {    7, "Styling with JavaScript", "Jul 09", 4.7, "Intermediate"});
            model.addRow(new Object [] {    8, "Learn to Program in Swift", "Aug 05", 4.8, "Intermediate"});
            model.addRow(new Object [] {    9, "C Basics", "Sep 07", 5.0, "Elementary"});
            model.addRow(new Object [] {    10, "C++ Bacis", "Aug 12",4.0, "Advanced"});
            
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChange = new csynch.datechooser.DateChooser();
        bodyPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();
        dateBtn = new javax.swing.JButton();
        nowBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();

        dateChange.setBackground(new java.awt.Color(204, 204, 255));
        dateChange.setForeground(new java.awt.Color(161, 161, 253));
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

        nowBtn.setText("↻");
        nowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nowBtnActionPerformed(evt);
            }
        });
        sidePanel.add(nowBtn);
        nowBtn.setBounds(240, 30, 30, 27);

        bodyPanel.add(sidePanel);
        sidePanel.setBounds(490, 0, 290, 480);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Course Name", "Start", "Rate", "Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableData.setGridColor(new java.awt.Color(51, 51, 51));
        tableData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableData.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableData.getColumnModel().getColumn(1).setResizable(false);
            tableData.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(2).setResizable(false);
            tableData.getColumnModel().getColumn(2).setPreferredWidth(50);
            tableData.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableData.getColumnModel().getColumn(4).setPreferredWidth(75);
        }

        bodyPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 460, 280);

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 0, 800, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        dateChange.showPopup();
    }//GEN-LAST:event_txtDateActionPerformed

    private void dateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBtnActionPerformed

        dateChange.showPopup();
    }//GEN-LAST:event_dateBtnActionPerformed

    private void nowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nowBtnActionPerformed
       dateChange.toDay();
    }//GEN-LAST:event_nowBtnActionPerformed

    public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("csynch.table");
        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY,Font.BOLD, 10));
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton dateBtn;
    private csynch.datechooser.DateChooser dateChange;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nowBtn;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
