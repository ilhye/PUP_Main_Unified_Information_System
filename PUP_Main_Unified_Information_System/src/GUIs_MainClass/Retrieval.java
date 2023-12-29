/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs_MainClass;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jim Aerol
 */
public class Retrieval extends javax.swing.JFrame {

    /**
     * Creates new form Retrieval
     */
    public Retrieval() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
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
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(136, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1241, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1290, -1));

        jPanel2.setBackground(new java.awt.Color(136, 0, 0));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/200x180.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(97, 90, 194, 180);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Unified Information System");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 372, 400, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Polytechic University of the Philippines");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 334, 380, 38);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 560));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(136, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Account Retrieval");
        jLabel4.setToolTipText("");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 30, 450, 48);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 85, 85));
        jLabel5.setText("Input Back-up Code");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 80, 351, 29);

        jButton1.setBackground(new java.awt.Color(136, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RETRIEVE");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(50, 200, 351, 44);

        jButton2.setBackground(new java.awt.Color(255, 255, 255, 215));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(130, 0, 0));
        jButton2.setText("Sign In");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(260, 250, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(130, 0, 0));
        jLabel7.setText("Already have an account?");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(100, 250, 175, 20);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(136, 0, 0));
        jCheckBox1.setText("Show Code");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(50, 170, 150, 26);

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField2.setSelectionColor(new java.awt.Color(136, 0, 0));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField2);
        jPasswordField2.setBounds(50, 120, 350, 41);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(136, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Username:");
        jLabel6.setToolTipText("");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 340, 100, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(136, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Name:");
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(38, 290, 70, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(136, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Password:");
        jLabel11.setToolTipText("");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(39, 390, 100, 25);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setSelectionColor(new java.awt.Color(136, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(140, 390, 260, 31);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setSelectionColor(new java.awt.Color(136, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(140, 290, 260, 31);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.setSelectionColor(new java.awt.Color(136, 0, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(140, 340, 260, 31);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 450, 440));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/image-1080x900.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setBackground(new Color(136, 0, 0));
        jLabel8.setFont(new Font("Segoe UI", Font.BOLD, 24));
        jLabel8.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBackground(new Color(255, 255, 255));
        jLabel8.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        jLabel8.setForeground(new Color(136,0,0));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(102, 0, 0));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(136,0,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String strInputCode = jPasswordField2.getText();
        String strCode = null, strName = null, strUserName = null, strPassword = null;
        
        try {
            FileWriter fileName = new FileWriter("Account_Name.txt", true);
            FileWriter fileUserName = new FileWriter("Account_UserName.txt", true);
            FileWriter filePassword = new FileWriter("Account_Password.txt", true);
            FileWriter fileCode = new FileWriter("Account_Code.txt", true);
            
               
            fileName.close();
            fileUserName.close();
            filePassword.close();
            fileCode.close();
            
            BufferedReader brCode = new BufferedReader(new FileReader("Account_Code.txt"));
            StringBuilder sbCode = new StringBuilder();
            String line;

            while ((line = brCode.readLine()) != null) {
                sbCode.append(line);
            }

            strCode = sbCode.toString();
                
        }   catch (IOException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (strInputCode.equals(strCode) && (!strInputCode.isEmpty())){
            //jTextField2.setText(strCode);
            
            try {
                BufferedReader brName = new BufferedReader(new FileReader("Account_Name.txt"));
                BufferedReader brUserName = new BufferedReader(new FileReader("Account_UserName.txt"));
                BufferedReader brPassword = new BufferedReader(new FileReader("Account_Password.txt"));
                
                StringBuilder sbName = new StringBuilder();
                StringBuilder sbUserName = new StringBuilder();
                StringBuilder sbPassword = new StringBuilder();
                String line;

                while ((line = brName.readLine()) != null) {
                    sbName.append(line);
                }
                while ((line = brUserName.readLine()) != null) {
                    sbUserName.append(line);
                }
                while ((line = brPassword.readLine()) != null) {
                    sbPassword.append(line);
                }

                strName = sbName.toString();
                strUserName = sbUserName.toString();
                strPassword = sbPassword.toString();
                
                jTextField2.setText(strName);
                jTextField3.setText(strUserName);
                jTextField1.setText(strPassword);
                JOptionPane.showMessageDialog(this, "Account Successfully Retrieved! Please click Sign-In to continue ", "Notice", JOptionPane.INFORMATION_MESSAGE);
                
            }   catch (IOException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Back-up Code is not correct. Please try again.", "Incorrect Code", JOptionPane.ERROR_MESSAGE);
        }
        
        
        /*
        Menus men = new Menus();
        men.pack();
        men.setVisible(true);

        dispose();
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered

    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        
        LogIn logFrame = new LogIn();
        logFrame.pack();
        
        logFrame.setVisible(true);
        
        dispose(); // Close login frame
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()){
            jPasswordField2.setEchoChar((char)0);
        }else{
            jPasswordField2.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}