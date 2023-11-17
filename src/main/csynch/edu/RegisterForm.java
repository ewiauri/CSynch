
package main.csynch.edu;

import javax.swing.JFrame;


public class RegisterForm extends javax.swing.JFrame {


    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        MainRegisterPanel = new javax.swing.JPanel();
        RightPanelReg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BGRighrPanel = new javax.swing.JLabel();
        LeftPanelReg = new javax.swing.JPanel();
        FNametxt = new javax.swing.JLabel();
        SignUptxt = new javax.swing.JLabel();
        LNametxt = new javax.swing.JLabel();
        UNametxt = new javax.swing.JLabel();
        STNumtxt = new javax.swing.JLabel();
        PassSigntxt = new javax.swing.JLabel();
        rePasstxt = new javax.swing.JLabel();
        CreateBtn = new javax.swing.JButton();
        CancelRegBtn = new javax.swing.JButton();
        haveacconttxt = new javax.swing.JLabel();
        ReSignInBtn = new javax.swing.JButton();
        StudNoTF = new javax.swing.JTextField();
        UNameTF = new javax.swing.JTextField();
        LNameTF = new javax.swing.JTextField();
        FnameTF = new javax.swing.JTextField();
        PassSignTF = new javax.swing.JPasswordField();
        rePassSignTF = new javax.swing.JPasswordField();
        BGRegisterForm = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainRegisterPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        MainRegisterPanel.setLayout(null);

        RightPanelReg.setPreferredSize(new java.awt.Dimension(400, 500));
        RightPanelReg.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Class Synch!");
        RightPanelReg.add(jLabel1);
        jLabel1.setBounds(70, 130, 280, 69);

        BGRighrPanel.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\ClassSynch\\Pallete\\RegisterPanel.png")); // NOI18N
        BGRighrPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        RightPanelReg.add(BGRighrPanel);
        BGRighrPanel.setBounds(-20, 0, 430, 500);

        MainRegisterPanel.add(RightPanelReg);
        RightPanelReg.setBounds(400, 0, 400, 500);

        LeftPanelReg.setPreferredSize(new java.awt.Dimension(400, 500));
        LeftPanelReg.setLayout(null);

        FNametxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        FNametxt.setText("First Name: ");
        LeftPanelReg.add(FNametxt);
        FNametxt.setBounds(40, 120, 90, 16);

        SignUptxt.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        SignUptxt.setForeground(new java.awt.Color(255, 255, 255));
        SignUptxt.setText("Sign Up Now!");
        LeftPanelReg.add(SignUptxt);
        SignUptxt.setBounds(50, 40, 170, 46);

        LNametxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        LNametxt.setText("Last Name:");
        LeftPanelReg.add(LNametxt);
        LNametxt.setBounds(40, 150, 80, 16);

        UNametxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        UNametxt.setText("Username:");
        LeftPanelReg.add(UNametxt);
        UNametxt.setBounds(40, 180, 90, 20);

        STNumtxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        STNumtxt.setText("Student No.: ");
        LeftPanelReg.add(STNumtxt);
        STNumtxt.setBounds(40, 210, 130, 16);

        PassSigntxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        PassSigntxt.setText("Password:");
        LeftPanelReg.add(PassSigntxt);
        PassSigntxt.setBounds(40, 240, 80, 16);

        rePasstxt.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        rePasstxt.setText("Re-Password: ");
        LeftPanelReg.add(rePasstxt);
        rePasstxt.setBounds(40, 270, 100, 16);

        CreateBtn.setText("Create Account");
        LeftPanelReg.add(CreateBtn);
        CreateBtn.setBounds(200, 320, 130, 23);

        CancelRegBtn.setText("Cancel");
        CancelRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRegBtnActionPerformed(evt);
            }
        });
        LeftPanelReg.add(CancelRegBtn);
        CancelRegBtn.setBounds(80, 320, 100, 23);

        haveacconttxt.setText("Already have an account? ");
        LeftPanelReg.add(haveacconttxt);
        haveacconttxt.setBounds(60, 420, 150, 20);

        ReSignInBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ReSignInBtn.setForeground(new java.awt.Color(153, 153, 255));
        ReSignInBtn.setText("Sign In");
        ReSignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReSignInBtnActionPerformed(evt);
            }
        });
        LeftPanelReg.add(ReSignInBtn);
        ReSignInBtn.setBounds(230, 420, 110, 23);
        LeftPanelReg.add(StudNoTF);
        StudNoTF.setBounds(160, 200, 150, 22);

        UNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNameTFActionPerformed(evt);
            }
        });
        LeftPanelReg.add(UNameTF);
        UNameTF.setBounds(160, 170, 150, 22);
        LeftPanelReg.add(LNameTF);
        LNameTF.setBounds(160, 140, 150, 22);
        LeftPanelReg.add(FnameTF);
        FnameTF.setBounds(160, 110, 150, 22);
        LeftPanelReg.add(PassSignTF);
        PassSignTF.setBounds(160, 230, 150, 22);

        rePassSignTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePassSignTFActionPerformed(evt);
            }
        });
        LeftPanelReg.add(rePassSignTF);
        rePassSignTF.setBounds(160, 260, 150, 22);

        BGRegisterForm.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        BGRegisterForm.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\ClassSynch\\Pallete\\Reg.png")); // NOI18N
        LeftPanelReg.add(BGRegisterForm);
        BGRegisterForm.setBounds(0, 0, 400, 500);

        MainRegisterPanel.add(LeftPanelReg);
        LeftPanelReg.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UNameTFActionPerformed

    private void ReSignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReSignInBtnActionPerformed
      
        LoginFrame rgf = new LoginFrame();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReSignInBtnActionPerformed

    private void CancelRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRegBtnActionPerformed

        this.dispose();
    }//GEN-LAST:event_CancelRegBtnActionPerformed

    private void rePassSignTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePassSignTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePassSignTFActionPerformed

    public static void main (String[]args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGRegisterForm;
    private javax.swing.JLabel BGRighrPanel;
    private javax.swing.JButton CancelRegBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JLabel FNametxt;
    private javax.swing.JTextField FnameTF;
    private javax.swing.JTextField LNameTF;
    private javax.swing.JLabel LNametxt;
    private javax.swing.JPanel LeftPanelReg;
    private javax.swing.JPanel MainRegisterPanel;
    private javax.swing.JPasswordField PassSignTF;
    private javax.swing.JLabel PassSigntxt;
    private javax.swing.JButton ReSignInBtn;
    private javax.swing.JPanel RightPanelReg;
    private javax.swing.JLabel STNumtxt;
    private javax.swing.JLabel SignUptxt;
    private javax.swing.JTextField StudNoTF;
    private javax.swing.JTextField UNameTF;
    private javax.swing.JLabel UNametxt;
    private javax.swing.JLabel haveacconttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField rePassSignTF;
    private javax.swing.JLabel rePasstxt;
    // End of variables declaration//GEN-END:variables
}
