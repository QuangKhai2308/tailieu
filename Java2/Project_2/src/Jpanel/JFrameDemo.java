/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Khai
 */
public class JFrameDemo {

    private JFrame frame;
    JButton button;
    public JFrameDemo() {
        createAndShow();
    }

    public void createAndShow() {
        frame = new JFrame("Java JFrame");
        button = new JButton("Oke");
        frame.add(button);
//        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
