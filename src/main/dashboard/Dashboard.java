package main.dashboard;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import csynch.notification.notifFrame;
import csynch.notification.notifPanel;
import main.drawer.MyDrawerBuilder;
import raven.drawer.Drawer;
import raven.popup.GlassPanePopup;
import csynch.tabbed.WindowsTabbed;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import main.glasspanepopup.DefaultLayoutCallBack;
import net.miginfocom.layout.ComponentWrapper;
import net.miginfocom.layout.LayoutCallback;
import raven.popup.DefaultOption;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        GlassPanePopup.install(this);
        MyDrawerBuilder myDrawerBuilder = new MyDrawerBuilder();
        Drawer.getInstance().setDrawerBuilder(myDrawerBuilder);
        initComponents();
        WindowsTabbed.getInstance().install(this, bodyPanel);
        tableData.setDefaultRenderer(Object.class, new csynch.table.TableGradientCell());
        dataTester();
        GlassPanePopup.install(this);
  
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
            model.addRow(new Object [] {    10, "C++ Bacis", "Oct 12",4.0, "Advanced"});
            
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChange = new csynch.datechooser.DateChooser();
        bodyPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        csynchTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coursesTxt = new javax.swing.JLabel();
        calendarTxt = new javax.swing.JLabel();
        calendar2 = new raven.calendar.Calendar();
        cmd = new sample.message.Button();

        dateChange.setBackground(new java.awt.Color(204, 204, 255));
        dateChange.setForeground(new java.awt.Color(161, 161, 253));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        bodyPanel.setLayout(null);

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
        jScrollPane1.setBounds(20, 220, 460, 240);

        csynchTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        csynchTxt.setText("Class Synch");
        bodyPanel.add(csynchTxt);
        csynchTxt.setBounds(70, 0, 100, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csynch/notification/img/csync.png"))); // NOI18N
        bodyPanel.add(jLabel2);
        jLabel2.setBounds(-10, 0, 80, 70);

        coursesTxt.setText("My Courses");
        bodyPanel.add(coursesTxt);
        coursesTxt.setBounds(20, 190, 80, 20);

        calendarTxt.setText("Calendar");
        bodyPanel.add(calendarTxt);
        calendarTxt.setBounds(530, 130, 70, 20);
        bodyPanel.add(calendar2);
        calendar2.setBounds(500, 160, 280, 300);

        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csynch/notification/img/notifs.png"))); // NOI18N
        cmd.setHideActionText(true);
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActionPerformed(evt);
            }
        });
        bodyPanel.add(cmd);
        cmd.setBounds(440, 10, 50, 50);
        cmd.getAccessibleContext().setAccessibleParent(cmd);

        getContentPane().add(bodyPanel);
        bodyPanel.setBounds(0, 0, 800, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActionPerformed

       main.glasspanepopup.GlassPanePopup.showPopup(new notifPanel(), new main.glasspanepopup.DefaultOption(){
       
           @Override
           public float opacity(){
               return 0;
           } 
          
           public LayoutCallback getLayoutCallBack(Component parent){
               return new DefaultLayoutCallBack(parent){
                   public void correctBounds(Component cw){
                        if(parent.isVisible()){
                            Point pl = parent.getLocationOnScreen();
                            Point bl = cmd.getLocationOnScreen();
                            int x=bl.x-pl.x;
                            int y=bl.y-pl.x;
                            y+=(1f-getAnimate())*-10f;
                            cw.setBounds(x-cw.getWidth()+cmd.getWidth(), y+cmd.getHeight(), cw.getWidth(), cw.getHeight());
                        }else{
                            super.correctBounds((ComponentWrapper) cw);
                        }
                   }

               };
           }
       });
    }//GEN-LAST:event_cmdActionPerformed

    public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("csynch.test");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY_SEMIBOLD, Font.PLAIN, 12 ));
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private raven.calendar.Calendar calendar2;
    private javax.swing.JLabel calendarTxt;
    private sample.message.Button cmd;
    private javax.swing.JLabel coursesTxt;
    private javax.swing.JLabel csynchTxt;
    private csynch.datechooser.DateChooser dateChange;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
