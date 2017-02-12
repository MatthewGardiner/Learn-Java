/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guistuff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcV1 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, subtract, equals;
    JTextField text;        //area for numbers to be displayed
    int num1, num2;         //the two numebrs we can work with
    String operation = "";  //can store the type of operation we're doing
    
    public CalcV1() {
	super("Calculator");
	setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //make it close properly
	//create buttons
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        add = new JButton("add");
        subtract = new JButton("subtract");
        equals = new JButton("equals");
        text = new JTextField();        //create text field
        getContentPane().setLayout(new FlowLayout());   //set basic layout
        //add buttons
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        getContentPane().add(b7);
        getContentPane().add(b8);
        getContentPane().add(b9);
        getContentPane().add(b0);
        getContentPane().add(add);
        getContentPane().add(subtract);
        getContentPane().add(equals);
        getContentPane().add(text); //add text field for numbers
	//add listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        equals.addActionListener(this);
	setVisible(true);
    }

    /**
     * Handles events from buttons. Numerical buttons alter the contents of
     * text field. The other buttons perform operations
     * @param e the event passed in
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)                        //if the 1 button was pressed
                text.setText(text.getText() + "1");     //add a "1" to the text field
        if (e.getSource() == b2)
                text.setText(text.getText() + "2");
        if (e.getSource() == b3)
                text.setText(text.getText() + "3");
        if (e.getSource() == b4)
                text.setText(text.getText() + "4");
        if (e.getSource() == b5)
                text.setText(text.getText() + "5");
        if (e.getSource() == b6)
                text.setText(text.getText() + "6");
        if (e.getSource() == b7)
                text.setText(text.getText() + "7");
        if (e.getSource() == b8)
                text.setText(text.getText() + "8");
        if (e.getSource() == b9)
                text.setText(text.getText() + "9");
        if (e.getSource() == b0)
                text.setText(text.getText() + "0");
        if (e.getSource() == add) {         //if add was pressed
            operation = "add";              //set the operation
            num1 = Integer.parseInt(text.getText());    //get the number entered
            text.setText("");               //clear the text field
        }
        if (e.getSource() == subtract) {
            operation = "subtract";
            num1 = Integer.parseInt(text.getText());
            text.setText("");
        }
        if (e.getSource() == equals) {
            int result = 0;     //for our result
            num2 = Integer.parseInt(text.getText());    //get second value
            
            if (operation.equals("add"))        //if we're adding
                result = num1 + num2;           //add numbers
            if (operation.equals("subtract"))
                result = num1 - num2;
            
            text.setText("" + result);          //change the text field to show result
        }
    }

    public static void main(String args[]) {
	CalcV1 c = new CalcV1();
    }

}
