/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khai2
 */
public class random extends javax.swing.JFrame {

    /**
     * Creates new form random
     */
    public random() {
        initComponents();
        setLocationRelativeTo(null);
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
        btnTram = new javax.swing.JButton();
        btnChuc = new javax.swing.JButton();
        btnDonVi = new javax.swing.JButton();
        lblTram = new javax.swing.JLabel();
        lblChuc = new javax.swing.JLabel();
        lblDV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Sổ Xố Kiến Thức Poly");

        btnTram.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTram.setText("Trăm");
        btnTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramActionPerformed(evt);
            }
        });

        btnChuc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnChuc.setText("Chục");
        btnChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChucActionPerformed(evt);
            }
        });

        btnDonVi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDonVi.setText("Đơn Vị");
        btnDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonViActionPerformed(evt);
            }
        });

        lblTram.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblChuc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblChuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTram)
                    .addComponent(btnTram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblChuc)
                    .addComponent(btnChuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDonVi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTram, lblChuc, lblDV, lblTram});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTram)
                        .addComponent(lblChuc, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTram, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTram, lblChuc, lblDV, lblTram});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChucActionPerformed
        Thread t =new Thread() {
          @Override
          public void run() {
              for (int i = 0; i < 100; i++) {
                  try {
                      int so = (int) Math.round(Math.random()*9);
                      lblChuc.setText(so + "");
                      Thread.sleep(10);
                  } catch (InterruptedException ex) {
                      break;
                  }
              }
          }  
        };
        t.start();
    }//GEN-LAST:event_btnChucActionPerformed

    private void btnTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramActionPerformed
        Thread t =new Thread() {
          @Override
          public void run() {
              for (int i = 0; i < 100; i++) {
                  try {
                      int so = (int) Math.round(Math.random()*9);
                      lblTram.setText(so + "");
                      Thread.sleep(10);
                  } catch (InterruptedException ex) {
                      break;
                  }
              }
          }  
        };
        t.start();
    }//GEN-LAST:event_btnTramActionPerformed

    private void btnDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonViActionPerformed
       Thread t =new Thread() {
          @Override
          public void run() {
              for (int i = 0; i < 100; i++) {
                  try {
                      int so = (int) Math.round(Math.random()*9);
                      lblDV.setText(so + "");
                      Thread.sleep(10);
                  } catch (InterruptedException ex) {
                      break;
                  }
              }
          }  
        };
       t.start();
    }//GEN-LAST:event_btnDonViActionPerformed

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
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new random().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuc;
    private javax.swing.JButton btnDonVi;
    private javax.swing.JButton btnTram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblChuc;
    private javax.swing.JLabel lblDV;
    private javax.swing.JLabel lblTram;
    // End of variables declaration//GEN-END:variables
}
