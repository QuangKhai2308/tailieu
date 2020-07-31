/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khai
 */
public class viewer extends javax.swing.JFrame {

    /**
     * Creates new form viewer
     */
    DefaultTableModel model;
    List<Employee> ListEmp = new ArrayList<>();
    int index = 0;

    public viewer() {
        initComponents();
        setLocationRelativeTo(null);
        time();
        model = (DefaultTableModel) tblListEmployee.getModel();
        
        ListEmp.add(new Employee("Ph12", "Nguyễn Quang Khải", 18, "khai@gmail.com", 100000));
        ListEmp.add(new Employee("Ph13", "Bùi Xuân Sáng", 18, "sang@gmail.com", 900000));
        ListEmp.add(new Employee("Ph14", "Quân Việt Anh", 18, "anh@gmail.com", 100000));
        
        if (ListEmp.size() >= 0) {
            fillToTable();
            ShowDetails();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblMaSV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblTuoi = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLuong = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        btnNew = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNewForm = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrew = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListEmployee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblStt = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("QUẢN LÍ NHÂN VIÊN");

        lblMaSV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMaSV.setText("MÃ NHÂN VIÊN");

        txtMaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblHoTen.setText("HỌ VÀ TÊN");

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblTuoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTuoi.setText("TUỔI");

        txtTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblEmail.setText("EMAIL");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblLuong.setText("LƯƠNG");

        txtLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnNew.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDelete.setText("Deleet");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNewForm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnNewForm.setText("New");
        btnNewForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnNewLayout = new javax.swing.GroupLayout(btnNew);
        btnNew.setLayout(btnNewLayout);
        btnNewLayout.setHorizontalGroup(
            btnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnNewLayout.setVerticalGroup(
            btnNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnNewForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnNewLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNewForm, btnSave});

        btnFirst.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrew.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnPrew.setText("<<");
        btnPrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrewActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        tblListEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblListEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListEmployee);

        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        lblStt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblStt.setForeground(new java.awt.Color(255, 51, 51));

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaSV)
                            .addComponent(lblHoTen)
                            .addComponent(lblTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(txtEmail)
                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast)
                                .addGap(18, 18, 18)
                                .addComponent(lblStt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(lblStt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListEmployeeMouseClicked
        index = tblListEmployee.getSelectedRow();
        try {
            if (index >= 0) {
                ShowDetails();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblListEmployeeMouseClicked

    private void btnNewFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFormActionPerformed
        ResetForm();
    }//GEN-LAST:event_btnNewFormActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        OpenFile();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtMaNV.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên chưa được nhập");
                txtMaNV.requestFocus();
                return;
            } else if (txtHoTen.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên  nhân viên chưa được nhập");
                txtHoTen.requestFocus();
                return;
            } else if (txtTuoi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tuổi  nhân viên chưa được nhập");
                txtTuoi.requestFocus();
                return;
            } else if (txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email  nhân viên chưa được nhập");
                txtEmail.requestFocus();
                return;
            } else if (txtLuong.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lương  nhân viên chưa được nhập và lương phải là số");
                txtLuong.requestFocus();
                return;
            }
            
                String MaNV = txtMaNV.getText();
                
                
            try {
                for (Employee x : ListEmp) {
                    if (MaNV.equalsIgnoreCase(x.getMaNV())) {
                        JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại !");
                        txtMaNV.requestFocus();
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //check Tuổi phải từ 16 đến 55
//            String TxtTuoi = txtTuoi.getText();
            try {
                int Tuoi = Integer.parseInt(txtTuoi.getText());
                if (Tuoi < 16 || Tuoi > 55) {
                    JOptionPane.showMessageDialog(this, "Tuổi phải từ 16-55");
                    txtTuoi.requestFocus();
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tuổi phải là số");
                txtTuoi.requestFocus();
                return;
            }
                
            //check Email đúng định dạng  || txtEmail.getText().contains("@") == false
            String Email = txtEmail.getText();
            String CheckEmail = "\\w+@\\w+(\\.\\w+){1,2}";
            try {
                if (!Email.matches(CheckEmail)) {
                    JOptionPane.showMessageDialog(this, "Email chưa đúng định dạng");
                    txtEmail.requestFocus();
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                
            }
            //check Lương phải trên 5 triệu
            try {
                int Luong = Integer.parseInt(txtLuong.getText());
                if (Luong < 5000000) {
                    JOptionPane.showMessageDialog(this, "Lương phải trên 5000000");
                    txtLuong.requestFocus();
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lương phải là số");
                txtLuong.requestFocus();
                return;
            }
                String FullName = txtHoTen.getText();
                int Age = Integer.parseInt(txtTuoi.getText());
               
                double Salary = Double.parseDouble(txtLuong.getText());
            if (index == -1) {
//                AddToTable();
//                
                ListEmp.add(new Employee(MaNV, FullName, Age, Email, Salary));
                model.addRow(new Object[]{MaNV, FullName, Age, Email, Salary});
                
                index = ListEmp.size() - 1;
                fillToTable();
                JOptionPane.showMessageDialog(this, "Lưu thành công");
                ShowDetails();
                
            } else {
                ListEmp.set(index, new Employee(MaNV, FullName, Age, Email, Salary));
                model.setValueAt(MaNV, index, 0);
                model.setValueAt(FullName, index, 1);
                model.setValueAt(Age, index, 2);
                model.setValueAt(Email, index, 3);
                model.setValueAt(Salary, index, 4);
                fillToTable();
                JOptionPane.showMessageDialog(this, "Update thành công");
                ShowDetails();
            }

            
            ResetForm();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (ListEmp.size() >= 0) {
                DeleteEmployee();
                ResetForm();
                index = -1;
                
//                int select = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa: " + txtHoTen.getText());
//                if (select == JOptionPane.YES_OPTION) {
//                    DeleteRecord();
//                    fillToTable();
//                    ResetForm();
//                }
                
                lblStt.setText("Record: " + (index + 1) + " " + "of" + " " + ListEmp.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            if (ListEmp.size() >= 0) {
                index = 0;
                ShowDetails();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bảng trống cần thêm dữ liệu");
            return;
        }

    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrewActionPerformed
        try {
            if (ListEmp.size() >= 0) {
                index--;
                if (index < 0) {
                    index = ListEmp.size() - 1;
                }
                ShowDetails();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bảng trống, bạn cần thêm dữ liệu");
            return;
        }
    }//GEN-LAST:event_btnPrewActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (ListEmp.size() >= 0) {
                index++;
                if (index > ListEmp.size() - 1) {
                    index = 0;
                }
                ShowDetails();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bảng trống, bạn cần thêm dữ liệu");
            return;
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            if (ListEmp.size() >= 0) {
                index = ListEmp.size() - 1;
                ShowDetails();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bảng trống cần thêm dữ liệu");
            return;
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        SaveFile();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        FindEmployee();
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JPanel btnNew;
    private javax.swing.JButton btnNewForm;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrew;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaSV;
    private javax.swing.JLabel lblStt;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JTable tblListEmployee;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
    private void fillToTable() {
        model.setRowCount(0);
        for (Employee employee : ListEmp) {
            model.addRow(new Object[]{employee.getMaNV(), employee.getFullName(),
                employee.getAge(), employee.getEmail(), employee.getSalary()});
        }
    }

    private Employee ReadForm() {
        String MaNV = txtMaNV.getText();
        String FullName = txtHoTen.getText();
        int Age = Integer.parseInt(txtTuoi.getText());
        String Email = txtEmail.getText();
        double Salary = Double.parseDouble(txtLuong.getText());
        Employee emp = new Employee(MaNV, FullName, Age, Email, Salary);
        return emp;
    }
    private void DeleteEmployee() {
        String FindMaNV = JOptionPane.showInputDialog("Nhập Mã Nhân Viên để xóa: ");
        boolean check = false;
        int i = 0;
        
        for (Employee x : ListEmp) {
            i++;
            if (x.getMaNV().equalsIgnoreCase(FindMaNV)) {
                check = true;
                index = i - 1; 
                ListEmp.remove(index);
                fillToTable();
                return;
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(this, "Không tồn tại Mã Nhân Viên: " + FindMaNV);
        }
    }
    private void FindEmployee() {
        String FindMaNV = JOptionPane.showInputDialog("Nhập Mã Nhân Viên tìm kiếm: ");
        boolean check = false;
        int i = 0;
        for (Employee x : ListEmp) {
            i++;
            if (x.getMaNV().equalsIgnoreCase(FindMaNV)) {
                check = true;
                index = i - 1; 
//                JOptionPane.showMessageDialog(this, "Đã tìm thấy Mã Nhân Viên: " + FindMaNV);
//                txtMaNV.setText(x.getMaNV());
//                txtHoTen.setText(x.getFullName());
//                txtTuoi.setText(x.getAge() + "");
//                txtEmail.setText(x.getEmail());
//                txtLuong.setText(x.getSalary() + "");
                ShowDetails();
                return;
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(this, "Không tồn tại Mã Nhân Viên: " + FindMaNV);
        }
    }
    private void ShowDetails() {
        Employee emp = ListEmp.get(index);
        txtMaNV.setText(emp.getMaNV());
        txtHoTen.setText(emp.getFullName());
        txtTuoi.setText(emp.getAge() + "");
        txtEmail.setText(emp.getEmail());
        txtLuong.setText(emp.getSalary() + "");
        lblStt.setText("Record: " + (index + 1) + " " + "of" + " " + ListEmp.size());
        tblListEmployee.setRowSelectionInterval(index, index);

    }

//    private void UpdateRecord() {
//        int select = tblListEmployee.getSelectedRow();
//    }
    private void OpenFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        JFileChooser jfc = null;

        try {
            jfc = new JFileChooser();
            int select = jfc.showOpenDialog(this);
            
            if (select == JFileChooser.APPROVE_OPTION) {
                String FileName = jfc.getSelectedFile().getAbsolutePath();
                fis = new FileInputStream(FileName);
                ois = new ObjectInputStream(fis);
                ListEmp = (List<Employee>) ois.readObject();
                
                if (ListEmp.size() >= 0) {
                    fillToTable();
                    index = 0;
                    ShowDetails();

                }
            JOptionPane.showMessageDialog(this, "Đọc thành công");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đọc thất bại");
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void SaveFile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        JFileChooser jfc = null;
        try {
            jfc = new JFileChooser();
            int select = jfc.showSaveDialog(this);
            if (select == JFileChooser.APPROVE_OPTION) {
                String FileName = jfc.getSelectedFile().getAbsolutePath();
                fos = new FileOutputStream(FileName);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(ListEmp);
                oos.flush();

            JOptionPane.showMessageDialog(this, "Lưu file thành công ");
            }
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi ghi file");
            ex.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void AddToTable() {
        Employee emp = ReadForm();
        ListEmp.add(emp);
    }

    private void DeleteRecord() {
        index = tblListEmployee.getSelectedRow();
        ListEmp.remove(index);
        index = -1;
    }
    private void time() {
        Thread time = new Thread() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aaa");
                while(true) {
                    try {
                        Date date = new Date();
                        lblTime.setText(sdf.format(date));
                        Thread.sleep(1000);
                        
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                
            }
        };
        time.start();
    }
    private void ResetForm() {
        txtMaNV.setText("");
        txtHoTen.setText("");
        txtTuoi.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        index = -1;
//        lblStt.setText("Record: ");
    }
}