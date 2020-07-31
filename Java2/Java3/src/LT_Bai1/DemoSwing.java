/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LT_Bai1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Khai2
 */
public class DemoSwing extends JFrame{
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Demo JavaSwing");
        JPanel Panel = new JPanel();
        
        Frame.setLocation(400, 400);
        Frame.setSize(550,100);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Frame.setLocationRelativeTo(null);
        
        
        JLabel FullName = new JLabel("Fullname");
        JTextField txtFullName = new JTextField(10);
        
        JLabel MaNV = new JLabel("MaNV");
        JTextField txtMaNV = new JTextField(10);
        
        Panel.add(FullName);
        Panel.add(MaNV);
        Panel.add(txtFullName);
        Panel.add(txtMaNV);
        Frame.add(Panel);
        Frame.setVisible(true);
    }
}
