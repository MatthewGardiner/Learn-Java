/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guistuff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author mgardin2
 */
public class CelsiusToFahrenheit extends JFrame implements ActionListener{
    JTextField tempCelsius;
    JLabel celsiusLabel, fahrenheitLabel;
    JButton convertTemp;
    

    public CelsiusToFahrenheit() {
        super("Celsius to Fahrenheit Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(300, 100));
        setLayout(new GridLayout(2, 4));
        
        tempCelsius = new JTextField();
        getContentPane().add(tempCelsius);
        celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
        getContentPane().add(celsiusLabel);
        
        
        convertTemp = new JButton("Convert");
        getContentPane().add(convertTemp);
        convertTemp.addActionListener(this);
        
        
        fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);
        getContentPane().add(fahrenheitLabel);
    }
    
    public void actionPerformed(ActionEvent event) {
        double dTempCelsius = Double.parseDouble(tempCelsius.getText());
        int tempFahrenheit = (int)((dTempCelsius * 1.8) + 32);
        fahrenheitLabel.setText(tempFahrenheit + " Fahrenheit");
    }
        public static void main(String[] args) {
            CelsiusToFahrenheit converter = new CelsiusToFahrenheit();
            
            converter.setVisible(true);
        }
    }

