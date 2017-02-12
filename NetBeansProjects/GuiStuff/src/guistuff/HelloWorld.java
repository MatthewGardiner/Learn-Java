/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guistuff;


import javax.swing.*;


/**
 *
 * @author mgardin2
 */
public class HelloWorld {

    public static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame frame = new JFrame("HelloWorldString");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Hello World");
        
        frame.getContentPane().add(label);
        
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 300);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
        
    });
    
    }
}
