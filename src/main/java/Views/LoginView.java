/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Repositories.AuthRepository;
import Repositories.RepositoryProvider;
import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    
    MainMenuView mainmenu;
    
    public LoginView() {
        initComponents();
        
        mainmenu = new MainMenuView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPasswordField();
        UsernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogInBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1310, 765));
        setResizable(false);
        setSize(new java.awt.Dimension(1310, 765));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(113, 119, 117));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(164, 196, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 450, 40));

        UsernameField.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jPanel2.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 450, 40));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 79, 85));
        jLabel2.setText("PASSWORD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 79, 85));
        jLabel3.setText("USERNAME:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

        LogInBtn.setBackground(new java.awt.Color(247, 138, 47));
        LogInBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        LogInBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogInBtn.setText("Log In");
        LogInBtn.setAlignmentY(0.0F);
        LogInBtn.setBorder(null);
        LogInBtn.setBorderPainted(false);
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LogInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 450, 40));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 79, 85));
        jLabel1.setText("Login To Your Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 390, 40));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(14, 79, 85));
        jLabel4.setText("Enter your details to login.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 570, 590));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Term6\\Software-Engineering-Laboratory\\Inventory-Management-System\\CS155-8L_InventorySystem\\src\\main\\java\\Resources\\logo.png")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 460, 320));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(14, 79, 85));
        jLabel6.setText("Manage Your Poultry Inventory");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 570, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed
        // TODO add your handling code here:
        
        String UsernameStr = UsernameField.getText();
        
        // Get Contents of Password Field
        String PasswordStr = String.valueOf(PasswordField.getPassword());

        // Compare Hash to Saved Password Hash
        if(RepositoryProvider.getProvider().getAuthRepo().checkAuth(UsernameStr, PasswordStr)) {
            // Proceed To Menu
            this.setVisible(false);
            this.mainmenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Incorrect Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LogInBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
