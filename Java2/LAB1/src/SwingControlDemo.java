
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai2
 */
public class SwingControlDemo {
    private JFrame FrameMain;
    private JLabel headerLable;
    private JLabel statusLable;
    private JPanel controlPanel;
    
    public SwingControlDemo() {
        initComponent();
        
        
    } 
    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showCheckBoxDemo();
    }
    public void initComponent() {
        FrameMain = new JFrame("Ví dụ Java Swing");
        FrameMain.setSize(550, 400);
        FrameMain.setLayout(new GridLayout(3, 1));
        FrameMain.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        headerLable = new JLabel("",JLabel.CENTER);
        statusLable = new JLabel("",JLabel.CENTER);
        
        statusLable.setSize(350,100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        FrameMain.add(headerLable);
        FrameMain.add(controlPanel);
        FrameMain.add(statusLable);
        FrameMain.setLocationRelativeTo(null);
        FrameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrameMain.setVisible(true);
    }
    private void showCheckBoxDemo() {
        headerLable.setText("Control in action: CheckBox");
        
        final JCheckBox chkApple = new JCheckBox("Apple");
        final JCheckBox chkMango = new JCheckBox("Mango");
        final JCheckBox chkPeer = new JCheckBox("Peer");
        
        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        chkPeer.setMnemonic(KeyEvent.VK_P);
        
        chkApple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLable.setText("Apple CheckBox: " +
                (e.getStateChange() == 1?"Checked":"Unchecked"));
            }
        });
        
        chkMango.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLable.setText("Mango CheckBox: " +
                (e.getStateChange() == 1?"Checked":"Unchecked"));
            }
        });
        
        chkPeer.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLable.setText("Peer CheckBox: " +
                (e.getStateChange() == 1?"Checked":"Unchecked"));
            }
        });
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        controlPanel.add(chkPeer);
        controlPanel.setVisible(true);
    }
}
