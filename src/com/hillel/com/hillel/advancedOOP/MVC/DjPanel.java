package com.hillel.com.hillel.advancedOOP.MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class DjPanel extends JFrame implements BeatObserver{
    private JButton increaseButton;
    private JButton decreaseButton;
    private JPanel panel;
    private JLabel label;
    private Controller controller;
    private Model model;

    public DjPanel(Controller controller, Model model) {
        this.model = model;
        this.controller = controller;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        setVisible(true);
        initDecBtn();
        initIncBtn();
        initUpdateBpm();
    }

    private void initUpdateBpm() {
        label.setText(String.valueOf(model.getBpm()));
    }

    private void initIncBtn() {
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.increaseBtnPressed();
            }
        });
    }

    private void initDecBtn() {
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.decreaseBtnPressed();
            }
        });
    }


    @Override
    public void beatChanged() {
        initUpdateBpm();
    }

    public void decreaseBtnEnabled(boolean enabled) {
        decreaseButton.setEnabled(enabled);
    }

    public void increaseBtnEnabled(boolean enabled) {
        increaseButton.setEnabled(enabled);
    }
}
