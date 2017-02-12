/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guistuff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcV3 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, subtract, equals;
    JTextField text;        //area for numbers to be displayed
    int num1, num2;         //the two numebrs we can work with
    String operation = "";  //can store the type of operation we're doing
    
    JPanel numPad, operPad;
    
    public CalcV3() {
	super("Calculator");
	setSize(250,200);           //modified size
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //make it close properly
	//create buttons
        numPad = new JPanel();
        operPad = new JPanel();
        
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
        text = new JTextField(20);        //create text field with spacing
        getContentPane().setLayout(new BorderLayout());   //set advanced layout
        getContentPane().add(text, BorderLayout.PAGE_START); //add text field for numbers at top of layout
	//add buttons
        numPad.add(b1);
        numPad.add(b2);
        numPad.add(b3);
        numPad.add(b4);
        numPad.add(b5);
        numPad.add(b6);
        numPad.add(b7);
        numPad.add(b8);
        numPad.add(b9);
        numPad.add(b0);
        operPad.add(add);
        operPad.add(subtract);
        operPad.add(equals);
        
        //add panels to JFrame
        getContentPane().add(numPad, BorderLayout.LINE_START);
        getContentPane().add(operPad, BorderLayout.LINE_END);
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
     * @param e teh event passed in
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
	CalcV3 c = new CalcV3();
    }

}
