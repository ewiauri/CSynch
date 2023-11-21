package main.csynch.edu;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
//import com.mysql.jdbc.Connection;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import main.dashboard.Dashboard;
import raven.toast.Notifications;


public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        Notifications.getInstance().setJFrame(this);
        
    }
    
   // Connection con; 
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc(.Driver");
               // con = DiverManager.getConnection("jdbc:mysql://localhost/");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        bg1 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        passwordtxt = new javax.swing.JLabel();
        signIntxt = new javax.swing.JLabel();
        welcomeBacktxt = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        Unametxt = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        SignUpBtn = new javax.swing.JButton();
        LoginBtn = new javax.swing.JButton();
        Accounttxt = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        bg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class Synch.edu | Login");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        BackgroundPanel.setLayout(null);

        bg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\ClassSynch\\Pallete\\Class Synch.png")); // NOI18N
        bg1.setMaximumSize(new java.awt.Dimension(400, 500));
        bg1.setPreferredSize(new java.awt.Dimension(400, 500));
        BackgroundPanel.add(bg1);
        bg1.setBounds(0, 0, 410, 500);

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setPreferredSize(new java.awt.Dimension(400, 250));
        LoginPanel.setLayout(null);

        passwordtxt.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        passwordtxt.setText("Password");
        LoginPanel.add(passwordtxt);
        passwordtxt.setBounds(120, 270, 80, 14);

        signIntxt.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        signIntxt.setText("Sign in to account.");
        LoginPanel.add(signIntxt);
        signIntxt.setBounds(40, 150, 170, 40);

        welcomeBacktxt.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        welcomeBacktxt.setForeground(new java.awt.Color(255, 255, 255));
        welcomeBacktxt.setText("Welcome Back!");
        LoginPanel.add(welcomeBacktxt);
        welcomeBacktxt.setBounds(40, 100, 310, 60);

        usernameTF.setForeground(new java.awt.Color(204, 204, 204));
        usernameTF.setText("@ ");
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });
        LoginPanel.add(usernameTF);
        usernameTF.setBounds(120, 230, 160, 26);

        Unametxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        Unametxt.setText("Username ");
        LoginPanel.add(Unametxt);
        Unametxt.setBounds(120, 210, 70, 14);

        passwordTF.setForeground(new java.awt.Color(255, 255, 255));
        passwordTF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTFKeyTyped(evt);
            }
        });
        LoginPanel.add(passwordTF);
        passwordTF.setBounds(120, 290, 160, 22);

        SignUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(153, 153, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        LoginPanel.add(SignUpBtn);
        SignUpBtn.setBounds(210, 410, 100, 27);

        LoginBtn.setText("Log In");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginPanel.add(LoginBtn);
        LoginBtn.setBounds(102, 340, 90, 27);

        Accounttxt.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        Accounttxt.setText("Don't have an account?");
        LoginPanel.add(Accounttxt);
        Accounttxt.setBounds(50, 410, 150, 20);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        LoginPanel.add(cancelBtn);
        cancelBtn.setBounds(200, 340, 90, 27);

        bg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\ClassSynch\\Pallete\\Untitled (800 x 500 px).png")); // NOI18N
        LoginPanel.add(bg2);
        bg2.setBounds(0, 0, 390, 500);

        BackgroundPanel.add(LoginPanel);
        LoginPanel.setBounds(410, 0, 390, 500);

        getContentPane().add(BackgroundPanel);
        BackgroundPanel.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        
    }//GEN-LAST:event_usernameTFActionPerformed

    private void passwordTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTFKeyTyped
       
    }//GEN-LAST:event_passwordTFKeyTyped

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        Notifications.getInstance().show(Notifications.Type.SUCCESS,Notifications.Location.BOTTOM_RIGHT,"Welcome Back!");
//directs to dashboard frame
        Dashboard DF = new Dashboard();
        DF.setVisible(true);
        DF.pack();
        DF.setLocationRelativeTo(null);
        DF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed

        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_SignUpBtnActionPerformed

 public static void main (String[]args){
 
     FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("csynch.theme");
        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY,Font.BOLD, 13));
        FlatIntelliJLaf.setup();
     java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accounttxt;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel Unametxt;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel passwordtxt;
    private javax.swing.JLabel signIntxt;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JLabel welcomeBacktxt;
    // End of variables declaration//GEN-END:variables
}
