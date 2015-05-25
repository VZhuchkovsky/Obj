package com.hillel.com.hillel.swing;

import javax.swing.*;

/**
 * Created by VZhuchkovsky on 21.05.2015.
 */
public class Calculator extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a0Button;
    private JButton plusButton;
    private JButton equalButton;

    public Calculator() {
        a1Button.setActionCommand("1");
        a2Button.setActionCommand("2");
        a3Button.setActionCommand("3");
        a4Button.setActionCommand("4");
        a5Button.setActionCommand("5");
        a6Button.setActionCommand("6");
        a7Button.setActionCommand("7");
        a8Button.setActionCommand("8");
        a9Button.setActionCommand("9");
        a0Button.setActionCommand("0");
        plusButton.setActionCommand("+");
        equalButton.setActionCommand("=");

        NumberListener listener = new NumberListener(textField1);

        a1Button.addActionListener(listener);
        a2Button.addActionListener(listener);
        a3Button.addActionListener(listener);
        a4Button.addActionListener(listener);
        a5Button.addActionListener(listener);
        a6Button.addActionListener(listener);
        a7Button.addActionListener(listener);
        a8Button.addActionListener(listener);
        a9Button.addActionListener(listener);
        a0Button.addActionListener(listener);
        plusButton.addActionListener(listener);
        equalButton.addActionListener(listener);


        setContentPane(panel1);

        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
