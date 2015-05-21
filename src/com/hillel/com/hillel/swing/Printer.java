package com.hillel.com.hillel.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by VZhuchkovsky on 21.05.2015.
 */
public class Printer  implements ActionListener{


    private final JTextField textField;
    private final JTextField output;

    public Printer(JTextField textField, JTextField outputTextField) {
        this.textField = textField;
        this.output = outputTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // System.out.println(textField.getText());
        output.setText(textField.getText());
        textField.setText("");
    }
}
