/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khai
 */
public class lab_2_bai4 extends javax.swing.JFrame {

    /**
     * Creates new form lab_2_bai4
     */
    DefaultTableModel model;
    ArrayList<User> ListUser = new ArrayList<>();
    public lab_2_bai4() {
        initComponents();
        setLocationRelativeTo(null);
       
        ListUser.add(new User("Quangkhai","quangkhai2308","Admin"));
        ListUser.add(new User("Honganh","honganh1010","Admin"));
        ListUser.add(new User("Vietanh","vietanh0106","Admin"));
        ListUser.add(new User("Xuansang","xuansang2001","Admin"));
        
        model = (DefaultTableModel)tblListUser.getModel();
        
//        for (User user : ListUser) {
//            model.addRow(new Object[]{user.getUserName(),user.getPassWord(),user.getRole()});
//        }
//         tblListUser.setModel(model);
    fillTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tblTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblUsename = new javax.swing.JLabel();
        txtUsename = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        rdoUser = new javax.swing.JRadioButton();
        rdoAdmin = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Use Management");

        lblUsename.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsename.setText("Username");

        txtUsename.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblRole.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRole.setText("Role");

        buttonGroup1.add(rdoUser);
        rdoUser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoUser.setText("User");

        buttonGroup1.add(rdoAdmin);
        rdoAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdoAdmin.setText("Admin");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsename, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsename, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                .addComponent(txtPassword))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoUser)
                                .addGap(18, 18, 18)
                                .addComponent(rdoAdmin))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsename, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsename, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tblTab.addTab("EDITION", jPanel1);

        tblListUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "PASSWORD", "ROLE"
            }
        ));
        tblListUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListUser);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );

        tblTab.addTab("LIST", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblTab)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblTab, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        User use = new User();
//        use.setUserName(txtUsename.getText());
//        use.setPassWord(txtPassword.getText());
//        if(rdoAdmin.isSelected()) {
//            use.setRole("Admin");
//        } else if(rdoUser.isSelected()) {
//            use.setRole("User");
//        }
//        ListUser.add(use);
//        model = (DefaultTableModel)tblListUser.getModel();
        
//        for (User user : ListUser) {
//            model.addRow(new Object[]{use.getUserName(),use.getPassWord(),use.getRole()});
//        }
        try {
            if (txtUsename.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập usename");
                txtUsename.requestFocus();
                return;
            } else if(txtPassword.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập password");
                txtPassword.requestFocus();
                return;
            }
             addUser();
             fillTable();
             JOptionPane.showMessageDialog(this, "Thêm thành công");
             clearForm();
             tblTab.setSelectedIndex(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int rows = tblListUser.getSelectedRow();
//        model.removeRow(rows);
        try {
          int select = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa User: " + txtUsename.getText());
          if (select !=JOptionPane.YES_OPTION) {
            return;
          }else if(select == JOptionPane.YES_OPTION) {
            removeUse();
            fillTable();
            JOptionPane.showMessageDialog(this, "Remove thành công");
            clearForm();
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        int rows = tblListUser.getSelectedRow();
//        ListUser.get(rows).setUserName(txtUsename.getText());
//        ListUser.get(rows).setPassWord(txtPassword.getText());
//        if (rdoAdmin.isSelected()) {
//          ListUser.get(rows).setRole("Admin");
//        } else if(rdoUser.isSelected()){
//           ListUser.get(rows).setRole("User");
//        }
//        model.setRowCount(0);
//        Object rowsData[] = new Object[3];
//        for (int i = 0; i < ListUser.size(); i++) {
//          rowsData[0] = ListUser.get(i).getUserName();
//          rowsData[1] = ListUser.get(i).getPassWord();
//          rowsData[2] = ListUser.get(i).getRole();
//          model.addRow(rowsData);
//
        try {
          int index = tblListUser.getSelectedRow();
          if (index >=0 ) {
            updateUser();
            fillTable();
            JOptionPane.showMessageDialog(this, "Update thành công");
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }//GEN-LAST:event_jButton3ActionPerformed
       
    
    private void tblListUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListUserMouseClicked
//       int rows = tblListUser.getSelectedRow();
//       txtUsename.setText(tblListUser.getValueAt(rows, 0).toString());
//       txtPassword.setText(tblListUser.getValueAt(rows, 1).toString());
//       String Role = tblListUser.getValueAt(rows, 2).toString();
//        if (Role .equalsIgnoreCase("Admin")) {
//            rdoAdmin.setSelected(true);
//        } else {
//            rdoUser.setSelected(false);
//        }
        try {
          int rows = tblListUser.getSelectedRow();
            if (rows >= 0) {
                User use = ListUser.get(rows);
                writeForm(use);
                tblTab.setSelectedIndex(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblListUserMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtUsename.setText("");
        txtPassword.setText("");
        rdoAdmin.setSelected(false);
        rdoUser.setSelected(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(lab_2_bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab_2_bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab_2_bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab_2_bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab_2_bai4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsename;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoUser;
    private javax.swing.JTable tblListUser;
    private javax.swing.JTabbedPane tblTab;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsename;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        model.setRowCount(0);//xóa  hết dữ liệu cũ trên model 
        //Đổ dữ liệu từ list vào table
          for (User user : ListUser) {
            model.addRow(new Object[]{user.getUserName(),user.getPassWord(),user.getRole()});
        }
        
    }
    private User readForm() {
        String username = txtUsename.getText();
        String password = new String(txtPassword.getPassword());
        String role;
        if(rdoAdmin.isSelected()){
            role = "Admin";
        } else {
            role = "User";
        }
        User use = new User(username, password,role);
        return use;
    }
    private void writeForm(User use) {
        txtUsename.setText(use.getUserName());
        txtPassword.setText(use.getPassWord());
        if (use.getRole().equalsIgnoreCase("Admin")) {
            rdoAdmin.setSelected(true);
        }else {
            rdoUser.setSelected(true);
        }
        
    }
    private void addUser() {
        User use = readForm();
        ListUser.add(use);
    }
    private void removeUse() {
        int index = tblListUser.getSelectedRow();
        ListUser.remove(index);
    }
    private void updateUser() {
        int index = tblListUser.getSelectedRow();
        ListUser.get(index).setUserName(txtUsename.getText());//cách 1
        User setUser = readForm();//cách 2
        ListUser.set(index, setUser);
        
    }
    private void clearForm() {
        txtUsename.setText("");
        txtPassword.setText("");
        rdoUser.setSelected(true);
    }
}