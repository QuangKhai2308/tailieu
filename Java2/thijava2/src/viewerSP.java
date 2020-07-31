
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai2
 */
public class viewerSP extends javax.swing.JFrame {

    /**
     * Creates new form viewerSP
     */
    DefaultTableModel model;
    List<Laptop> ListSP = new ArrayList<>();
    int index ;
    public viewerSP() {
        initComponents();
        setLocationRelativeTo(null);
        
        model = (DefaultTableModel) tblListSp.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgayNhap = new javax.swing.JTextField();
        cboLoaiSP = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListSp = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSapxep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("Loại sản phẩm");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Giá");

        txtGia.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Tên sản phẩm");

        txtTensp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Ngày Nhập");

        txtNgayNhap.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        cboLoaiSP.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn loại", "Laptop", "DienThoai", "Tivi", " " }));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnReset.setText("Reset Form");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblListSp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Loại sản phẩm", "Giá", "Ngày nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListSp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListSpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListSp);

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnSave.setText("Lưu vào File");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnOpen.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnOpen.setText("Mở File");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSapxep.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnSapxep.setText("Sắp xếp theo tên");
        btnSapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapxepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTensp)
                            .addComponent(cboLoaiSP, 0, 119, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSapxep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(txtGia))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnReset, btnSave, txtNgayNhap});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if (txtTensp.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên sản phẩm không để trống");
                txtTensp.requestFocus();
                return;
            } else if (cboLoaiSP.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Loại sản phẩm chưa được chọn");
                cboLoaiSP.requestFocus();
                return;
            } else if (txtGia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Giá sản phẩm chưa được nhập");
                txtGia.requestFocus();
                return;
            } else if (txtNgayNhap.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ngày nhập sản phẩm chưa được nhập");
                txtNgayNhap.requestFocus();
                return;
            }
            String Gia = txtGia.getText();
            try {
                double gia = Double.parseDouble(Gia);
                if (gia < 0) {
                    JOptionPane.showMessageDialog(this, "Giá sản phẩm không được âm");
                    txtGia.requestFocus();
                    return;
                }
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Giá sản phẩm phải là số");
                    txtGia.requestFocus();
                    return;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date;
            try {
                sdf.parse(txtNgayNhap.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ngày nhập nhập sai định dạng");
                txtNgayNhap.requestFocus();
                return;
            }
            
            if (index == -1) {
                AddTable();
                FillTable();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                ResetForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblListSpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListSpMouseClicked
        index = tblListSp.getSelectedRow();
        try {
            if (ListSP.size() > 0) {
                ShowDetails();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblListSpMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ResetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (ListSP.size() > 0) {
                Delete();
                FillTable();
                ReadForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SaveFile();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
       OpenFile();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapxepActionPerformed
        Sapxep();
        FillTable();
    }//GEN-LAST:event_btnSapxepActionPerformed

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
            java.util.logging.Logger.getLogger(viewerSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewerSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewerSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewerSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewerSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSapxep;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListSp;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtTensp;
    // End of variables declaration//GEN-END:variables

    private void FillTable() {
        model.setRowCount(0);
        for (Laptop laptop : ListSP) {
            model.addRow(new Object[] {laptop.getNameSP(),laptop.getLoaiSP(),
            laptop.getGia(),laptop.getNgayNhap()});
        }
    }
    
    private Laptop ReadForm() {
        String NameSP  = txtTensp.getText();
        String LoaiSP  = cboLoaiSP.getSelectedItem() + "";
        double Gia = Double.parseDouble(txtGia.getText());
        String NgayNhap = txtNgayNhap.getText();
        
        Laptop lp = new Laptop(NameSP, LoaiSP, Gia, NgayNhap);
        
        return lp;
        
    }
    
    private void AddTable() {
        Laptop lp = ReadForm();
        ListSP.add(lp);
        
        index = -1;
    }
    
    private void ResetForm() {
        txtTensp.setText("");
        cboLoaiSP.setSelectedIndex(0);
        txtGia.setText("");
        txtNgayNhap.setText("");
        
        index = -1;
    }
    private void ShowDetails() {
        index = tblListSp.getSelectedRow();
        Laptop lp = ListSP.get(index);
        
        txtTensp.setText(lp.getNameSP());
        cboLoaiSP.setSelectedItem(lp.getLoaiSP());
        txtGia.setText(lp.getGia() + "");
        txtNgayNhap.setText(lp.getNgayNhap());
        
        tblListSp.setRowSelectionInterval(index, index);
    }
    
    private void Delete() {
        index = tblListSp.getSelectedRow();
        ListSP.remove(index);
        
        index = -1;
    }
    
    private void SaveFile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("E:\\Java2\\Product.txt");
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(ListSP);
            
            oos.flush();
            JOptionPane.showMessageDialog(this, "Lưu file thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lưu file thất bại");
            return;
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
    private void OpenFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("E:\\Java2\\Product.txt");
            ois = new ObjectInputStream(fis);
            
            ListSP = (List<Laptop>) ois.readObject();
            
            
            if (ListSP.size() > 0) {
                index = 0;
                FillTable();
                ShowDetails();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mở file thất bại"+e);
            return;
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void Sapxep() {
        ListSP.sort((Laptop lp1, Laptop lp2) -> (lp1.getNameSP().substring(lp1.getNameSP().lastIndexOf(lp1.getNameSP().length() - 1)).
                compareTo(lp2.getNameSP().substring(lp2.getNameSP().lastIndexOf(lp2.getNameSP().length() - 1)))));
    }
}
