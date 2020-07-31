/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import SanPham.SanPham;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khai2
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    String user = "sa";
    String pass = "30082001H";
    int index = 0;
    DefaultTableModel model;
    Connection conn;
    List<SanPham> ListSP = new ArrayList<>();

    public view() {
        initComponents();
        setLocationRelativeTo(null);

        ListSP = getList();
        renderForm(ListSP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgayNhap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListSP = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lí Sản Phẩm");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tên sản phẩm");

        txtTenSP.setEditable(false);
        txtTenSP.setBackground(new java.awt.Color(204, 204, 204));
        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        txtMaSP.setEditable(false);
        txtMaSP.setBackground(new java.awt.Color(204, 204, 204));
        txtMaSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ngày nhập");

        txtNgayNhap.setEditable(false);
        txtNgayNhap.setBackground(new java.awt.Color(204, 204, 204));
        txtNgayNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Số lượng");

        txtSoLuong.setEditable(false);
        txtSoLuong.setBackground(new java.awt.Color(204, 204, 204));
        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tblListSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblListSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Mã sản phẩm", "Ngày nhập", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAdd)
                .addGap(60, 60, 60)
                .addComponent(btnUpdate)
                .addGap(60, 60, 60)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMaSP, txtTenSP});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:sqlserver://localhost\\DESKTOP-KFE677I:1433;databaseName=qlsp";
        if (checkNull() && checkNgay() && checkSoLuong()) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(url, user, pass);

                for (SanPham sanPham : ListSP) {
                    if (txtMaSP.getText().equalsIgnoreCase(sanPham.getMaSP())) {
                        JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        txtMaSP.requestFocus();
                        return;
                    }
                }
                String query = "INSERT INTO san_pham(ten, ma_sp, ngay_nhap, so_luong)"
                        + "VALUES(?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setNString(1, txtTenSP.getText());
                ps.setString(2, txtMaSP.getText());
                ps.setDate(3, Date.valueOf(txtNgayNhap.getText()));
                ps.setInt(4, Integer.parseInt(txtSoLuong.getText()));

                ps.execute();

                ListSP = getList();
                renderForm(ListSP);
                Clear();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        index = tblListSP.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần xóa");
            return;
        }
        String url = "jdbc:sqlserver://localhost\\DESKTOP-KFE677I:1433;databaseName=qlsp";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);
            
            String MaSP = tblListSP.getValueAt(index, 1).toString();
            String query = "DELETE FROM san_pham WHERE ma_sp = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, MaSP);
            ps.execute();
            delete();
//            ListSP = getList();
            renderForm(ListSP);
            Clear();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblListSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListSPMouseClicked
        // TODO add your handling code here:
        index = tblListSP.getSelectedRow();
        ShowDetails();
    }//GEN-LAST:event_tblListSPMouseClicked

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    private void renderForm(List<SanPham> sp) {
        model = (DefaultTableModel) tblListSP.getModel();
        model.setRowCount(0);

//        for (SanPham sp : this.ListSP) {
//            model.addRow(new Object[]{ sp.getTenSP(), sp.getMaSP(), sp.getNgayNhap(), sp.getSoLuong() });
//        }
        for (int i = 0; i < sp.size(); i++) {
            SanPham x = sp.get(i);
            model.addRow(new Object[]{x.getTenSP(), x.getMaSP(), x.getNgayNhap(), x.getSoLuong()});

        }
    }

    private List<SanPham> getList() {
        String url = "jdbc:sqlserver://localhost\\DESKTOP-KFE677I:1433;databaseName=qlsp";
        List<SanPham> sp = new ArrayList<SanPham>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);

            Statement sm = conn.createStatement();
            String sql = "SELECT * FROM san_pham";
            ResultSet rs = sm.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String TenSP = rs.getNString("ten");
                String MaSP = rs.getString("ma_sp");
                Date NgayNhap = rs.getDate("ngay_nhap");
                int SoLuong = rs.getInt("so_luong");

                sp.add(new SanPham(id, TenSP, MaSP, NgayNhap, SoLuong));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }

    private boolean checkNull() {
        if (txtTenSP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên sản phẩm chưa được nhập", "Check NULL", JOptionPane.ERROR_MESSAGE);
            txtTenSP.requestFocus();
            return false;
        } else if (txtMaSP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm chưa được nhập", "Check NULL", JOptionPane.ERROR_MESSAGE);
            txtMaSP.requestFocus();
            return false;
        } else if (txtNgayNhap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ngày nhập sản phẩm chưa được nhập", "Check NULL", JOptionPane.ERROR_MESSAGE);
            txtNgayNhap.requestFocus();
            return false;
        } else if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm chưa được nhập", "Check NULL", JOptionPane.ERROR_MESSAGE);
            txtSoLuong.requestFocus();
            return false;
        }
        return true;
    }

    private boolean checkNgay() {

        Date date;

        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//            date = (Date) sdf.parse(txtNgayNhap.getText());
            date = Date.valueOf(txtNgayNhap.getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày nhập sai định dạng", "Sai định dạng", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean checkSoLuong() {

        String SoLuong = txtSoLuong.getText();

        try {
            int CheckSL = Integer.parseInt(SoLuong);
            if (CheckSL < 0) {
                JOptionPane.showMessageDialog(this, "Số lương phải là số nguyên dương", "Sai định dạng", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số", "Sai định dạng", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void ShowDetails() {
        SanPham sp = ListSP.get(index);

        txtTenSP.setText(sp.getTenSP());
        txtMaSP.setText(sp.getMaSP());
        txtNgayNhap.setText(sp.getNgayNhap().toString());
        txtSoLuong.setText(sp.getSoLuong() + "");

        txtTenSP.setEditable(true);
        txtNgayNhap.setEditable(true);
        txtSoLuong.setEditable(true);
        txtMaSP.setEditable(false);
        
        txtTenSP.setBackground(Color.WHITE);
        txtMaSP.setBackground(Color.GRAY.brighter());
        txtNgayNhap.setBackground(Color.WHITE);
        txtSoLuong.setBackground(Color.WHITE);
    }

    private void Clear() {
        txtTenSP.setText("");
        txtMaSP.setText("");
        txtNgayNhap.setText("");
        txtSoLuong.setText("");

        txtTenSP.setEditable(true);
        txtMaSP.setEditable(true);
        txtNgayNhap.setEditable(true);
        txtSoLuong.setEditable(true);
        
        txtTenSP.setBackground(Color.WHITE);
        txtMaSP.setBackground(Color.WHITE);
        txtNgayNhap.setBackground(Color.WHITE);
        txtSoLuong.setBackground(Color.WHITE);
    }
    private void delete() {
        ListSP.remove(index);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblListSP;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}