/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group5.Login;

import com.group5.Application.EmployeePanel;
import com.group5.User.User;
import com.group5.User.UserFactory;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Josefe Gillego
 */
public class RegisterPanel extends javax.swing.JFrame {

    /**
     * Creates new form RegiserPanel
     */
    public RegisterPanel() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(29, 34, 67));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        SignUpButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setForeground(new java.awt.Color(184, 38, 34));
        jLabel2.setText("POWERED BY SIGMA CORP.");

        jLabel3.setForeground(new java.awt.Color(242, 235, 235));
        jLabel3.setText("Create Your Account");

        jTextField1.setBackground(new java.awt.Color(223, 74, 70));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setName(""); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jRadioButton1.setForeground(new java.awt.Color(242, 235, 235));
        jRadioButton1.setText("Show passwords");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        SignUpButton.setBackground(new java.awt.Color(148, 28, 0));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(242, 235, 235));
        SignUpButton.setText("SIGN UP");
        SignUpButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(223, 74, 70));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 235, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRMS");

        jPasswordField2.setBackground(new java.awt.Color(223, 74, 70));
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(242, 235, 235));
        jLabel4.setText("Confirm password");

        jLabel5.setForeground(new java.awt.Color(242, 235, 235));
        jLabel5.setText("Enter password");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/!!!!revisedcrms (250 x 250 px) (2).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setForeground(new Color(0, 0, 0));
        if (jTextField1.getText().equals("Username")) {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setForeground(Color.gray);
            jTextField1.setText("Username");
        }

    }//GEN-LAST:event_jTextField1FocusLost

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jPasswordField1.getEchoChar() == '*') {
            jPasswordField1.setEchoChar((char) 0);
            jPasswordField2.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
            jPasswordField2.setEchoChar('*');
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        String firstPass = new String(jPasswordField1.getPassword());
        String confirmPass = new String(jPasswordField2.getPassword());
<<<<<<< HEAD
        if ((!confirmPass.contains(":") && !jTextField1.getText().contains(":"))) {
            if (firstPass.equals(confirmPass)) {
                UserDBHandler handler = UserDBHandler.getInstance();
                if (handler.userExists(jTextField1.getText())) {
                    JOptionPane.showMessageDialog(null, "User already exists... Try a different name.", "CRMS Registration", JOptionPane.WARNING_MESSAGE);
=======
        if (firstPass.equals(confirmPass)) {
            UserDBHandler handler = UserDBHandler.getInstance();
            if (handler.userExists(jTextField1.getText())) {
                JOptionPane.showMessageDialog(null, "User already exists... Try a different name.", "CRMS Registration", JOptionPane.WARNING_MESSAGE);
            } else {
                // todo: create a button or form for employees only?
                String[] detectAdmin = jTextField1.getText().split("-");
                int authority;
                if (detectAdmin[0].toLowerCase().equals("admin")) {
                    authority = 0;
>>>>>>> c952fe238633d68dcc7bd0261bdd5b9794aac9f3
                } else {
                    // todo: create a button or form for employees only?
                    String[] detectAdmin = jTextField1.getText().split("-");
                    int authority;
                    if (detectAdmin[1].toLowerCase().equals("admin")) {
                        authority = 0;
                    } else {
                        authority = 1;
                    }
                    User user = UserFactory.createUser("1", jTextField1.getText(), new String(jPasswordField1.getPassword()));
                    try {
                        handler.recordUser(user);
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "User [" + jTextField1.getText() + "] registered successfully!", "CRMS Registration", JOptionPane.INFORMATION_MESSAGE);
                    LoginPanel lPanel = new LoginPanel();
                    lPanel.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Passwords does not match... Please try again.", "CRMS Registration", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password/Username must not contain ':'... Please try again ", "CRMS Registration", JOptionPane.WARNING_MESSAGE);
        }
<<<<<<< HEAD
        
    }//GEN-LAST:event_jButton1ActionPerformed
=======
    }//GEN-LAST:event_SignUpButtonActionPerformed
>>>>>>> c952fe238633d68dcc7bd0261bdd5b9794aac9f3

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        String hint = "Password";
        char[] c_conv = hint.toCharArray();
        if (jPasswordField1.getPassword() == c_conv) {

            jPasswordField1.setText("");
        }
        jTextField1.setForeground(Color.black);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        String hint = "";
        char[] c_conv = hint.toCharArray();
        if (jPasswordField1.getPassword() == c_conv) {
            jPasswordField1.setText("Password");
            jPasswordField1.setEchoChar((char) 0);
        }
        jTextField1.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        String hint = "Password";
        char[] c_conv = hint.toCharArray();
        if (jPasswordField2.getPassword() == c_conv) {

            jPasswordField2.setText("");
        }
        jPasswordField2.setForeground(Color.black);
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        String hint = "Password";
        char[] c_conv = hint.toCharArray();
        if (jPasswordField2.getPassword() == c_conv) {

            jPasswordField2.setText("");
        }
        jPasswordField2.setForeground(Color.black);
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
