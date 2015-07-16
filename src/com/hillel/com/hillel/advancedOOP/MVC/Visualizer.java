package com.hillel.com.hillel.advancedOOP.MVC;

import javax.swing.*;
import java.awt.*;

/**
 * Created by VZhuchkovsky on 16.07.2015.
 */
public class Visualizer extends JFrame implements BeatsObserver {
    private JProgressBar progressBar;
    private JPanel panel;

    public Visualizer() {
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        initProgresBar();
    }

    private void initProgresBar() {
        progressBar.setMaximum(10);
    }

    @Override
    public void beat() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setValue(7);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {}
                progressBar.setValue(10);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {}
                progressBar.setValue(3);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {}
                progressBar.setValue(0);
            }
        }).start();

    }
}
