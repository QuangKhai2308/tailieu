/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.QLD;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Long
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    Border default_border = BorderFactory.createMatteBorder(3, 0, 3, 0, new Color(46, 49, 48));
    Border ation_border = BorderFactory.createMatteBorder(3, 0, 3, 0, new Color(204, 204, 204));
    JLabel[] menu_label = new JLabel[3];
    lg login;
    SV qlsv;
    DSV qldsv;

    public TrangChu() {
        initComponents();
        setLocationRelativeTo(null);
        Border panelBorder = BorderFactory.createMatteBorder(1, 1, 5, 1, new Color(204, 204, 204));
        panelHome.setBorder(panelBorder);

        ActionToMenu();
        menu_label[0] = jlabel_menu1;
        menu_label[1] = jlabel_menu2;
        menu_label[2] = jlabel_menu3;
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
        panel_menu = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlabel_menu2 = new javax.swing.JLabel();
        jlabel_menu1 = new javax.swing.JLabel();
        jlabel_menu3 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_menu.setBackground(new java.awt.Color(44, 49, 49));

        panelHome.setBackground(new java.awt.Color(46, 49, 49));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/spark.png"))); // NOI18N
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Home");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jlabel_menu2.setBackground(new java.awt.Color(46, 49, 49));
        jlabel_menu2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jlabel_menu2.setForeground(new java.awt.Color(204, 204, 204));
        jlabel_menu2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlabel_menu2.setText("  Quản Lí Điểm ");
        jlabel_menu2.setToolTipText("");
        jlabel_menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_menu2.setOpaque(true);
        jlabel_menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_menu2MouseClicked(evt);
            }
        });

        jlabel_menu1.setBackground(new java.awt.Color(46, 49, 49));
        jlabel_menu1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jlabel_menu1.setForeground(new java.awt.Color(204, 204, 204));
        jlabel_menu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlabel_menu1.setText("  Quản Lí Sinh Viên");
        jlabel_menu1.setToolTipText("");
        jlabel_menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_menu1.setOpaque(true);
        jlabel_menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_menu1MouseClicked(evt);
            }
        });

        jlabel_menu3.setBackground(new java.awt.Color(46, 49, 49));
        jlabel_menu3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jlabel_menu3.setForeground(new java.awt.Color(204, 204, 204));
        jlabel_menu3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlabel_menu3.setText("  Đăng xuất");
        jlabel_menu3.setToolTipText("");
        jlabel_menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_menu3.setOpaque(true);
        jlabel_menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_menu3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jlabel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlabel_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabel_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlabel_menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_menu1MouseClicked
        // TODO add your handling code here:
        if (qlsv == null) {
            qlsv = new SV();
            desktop.add(qlsv);
            qlsv.setLocation(desktop.getWidth() / 2 - qlsv.getWidth() / 2, (desktop.getHeight() - 20) / 2 - qlsv.getHeight() / 2 - 20);
//            qlsv.toFront();
            qlsv.setVisible(true);
        } else {
            qlsv.setLocation(desktop.getWidth() / 2 - qlsv.getWidth() / 2, (desktop.getHeight() - 20) / 2 - qlsv.getHeight() / 2 - 20);
//            qlsv.toFront();
            qlsv.setVisible(true);
//            qlsv.dispose();
        }
//        setUndecorated(true);
//        qlsv.setLocation(this.getWidth(), this.getHeight());


    }//GEN-LAST:event_jlabel_menu1MouseClicked

    private void jlabel_menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_menu2MouseClicked
        // TODO add your handling code here:
        if (qldsv == null) {
            qldsv = new DSV();
            desktop.add(qldsv);
            qldsv.setLocation(desktop.getWidth() / 2 - qldsv.getWidth() / 2, (desktop.getHeight() - 20) / 2 - qldsv.getHeight() / 2 - 20);
//            qldsv.toFront();
            qldsv.setVisible(true);

        } else {
            qldsv.setLocation(desktop.getWidth() / 2 - qldsv.getWidth() / 2, (desktop.getHeight() - 20) / 2 - qldsv.getHeight() / 2 - 20);
//            qldsv.toFront();
            qldsv.setVisible(true);
//            qldsv.dispose();
        }

//        
    }//GEN-LAST:event_jlabel_menu2MouseClicked

    private void jlabel_menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_menu3MouseClicked
        // TODO add your handling code here:
        if (login == null) {
            login = new lg();
            desktop.add(login);
            login.setLocation(desktop.getWidth() / 2 - login.getWidth() / 2, (desktop.getHeight() - 20) / 2 - login.getHeight() / 2 - 20);
//            login.toFront();
            login.setVisible(true);
        } else {
//            login.removeAll();
            login.setLocation(desktop.getWidth() / 2 - login.getWidth() / 2, (desktop.getHeight() - 20) / 2 - login.getHeight() / 2 - 20);
//            login.toFront();
            login.setVisible(true);
//            login.dispose();
        }
    }//GEN-LAST:event_jlabel_menu3MouseClicked
    public void setLabel(JLabel label) {

        for (JLabel item : menu_label) {
            item.setBackground(new Color(46, 49, 49));
            item.setForeground(new Color(204, 204, 204));
        }
        label.setBackground(Color.WHITE);
        label.setForeground(new Color(46, 49, 49));
    }

    public void ActionToMenu() {
        Component[] com = panel_menu.getComponents();

        for (Component x : com) {
            if (x instanceof JLabel) {
                JLabel label = (JLabel) x;
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setLabel(label);
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        label.setBorder(ation_border);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        label.setBorder(default_border);
                    }
                });
            }
        }
    }

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlabel_menu1;
    private javax.swing.JLabel jlabel_menu2;
    private javax.swing.JLabel jlabel_menu3;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}
