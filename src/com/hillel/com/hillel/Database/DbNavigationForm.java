package com.hillel.com.hillel.Database;

import sun.misc.IOUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

/**
 * Created by MFarsikov on 02.07.2015.
 */
public class DbNavigationForm extends JFrame {
    private JTextField nameField;
    private JTextField categoryField;
    private JTextField priceField;
    private JButton nextButton;
    private JPanel panel;
    private JButton previousButton;
    private JButton saveButton;
    private JButton createButton;
    private JButton deleteButton;
    private JButton imageButton;
    private JLabel imageLabel;
    private final ResultSet resultSet;
    private Connection connection;
    private byte[] imageBytes;

    public DbNavigationForm() throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        String connectionString = "jdbc:postgresql://localhost:5432/postgres";

        connection = DriverManager.getConnection(connectionString, "postgres", "postgres");
        String sql = "SELECT name, category, price FROM store";

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = statement.executeQuery(sql);

        resultSet.next();
        readFromResultSet();

        initNextBtn();
        initPrevBtn();
        initClose();
        initSaveBtn();
        initCreateBtn();
        initDeleteBtn();
        initImageBtn();
        drawImage();

        setContentPane(panel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void drawImage() {
if(imageBytes != null){
    try {
       BufferedImage image =  ImageIO.read(new ByteArrayInputStream(imageBytes));
        imageLabel.setIcon(new ImageIcon(image));
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "unable to draw the element", JOptionPane.ERROR_MESSAGE);
    }
}
    }

    private void initImageBtn() {
        imageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if(fileChooser.showDialog(null, "ok") == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    try {
                       imageBytes = IOUtils.toByteArray(new FileInputStream(file));
                    }catch(IOException e1){
                        JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load the element", JOptionPane.ERROR_MESSAGE);

                    }
                }
            }
        });
    }

    private void initDeleteBtn() {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  resultSet.deleteRow();
                    if(resultSet.next()){
                        readFromResultSet();
                }else{
                        if(resultSet.previous()){
                            readFromResultSet();
                        }else{
                            nameField.setText("");
                            categoryField.setText("");
                            priceField.setText("");
                        }
                    }

                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to delete the element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void initCreateBtn() {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    resultSet.moveToInsertRow();
                    updateResultSet();
                    resultSet.insertRow();
                    //resultSet.moveToCurrentRow();
                    resultSet.last();
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to insert the element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void updateResultSet() throws SQLException {
        resultSet.updateString(1, nameField.getText());
        resultSet.updateString(2, categoryField.getText());
        resultSet.updateInt(3, Integer.parseInt(priceField.getText()));
    }

    private void initSaveBtn() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateResultSet();
                    resultSet.updateRow();
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to save the element", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }

    private void initPrevBtn() {
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!resultSet.isFirst() && !resultSet.isBeforeFirst()) {
                        resultSet.previous();
                        readFromResultSet();
                    }
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load previous element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void initClose() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    connection.close();
                } catch (SQLException ignored) {}
            }
        });
    }

    private void initNextBtn() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!resultSet.isLast() && !resultSet.isAfterLast()) {
                        resultSet.next();
                        readFromResultSet();
                    }
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load next element", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void readFromResultSet() throws SQLException {
        nameField.setText(resultSet.getString(1));
        categoryField.setText(resultSet.getString(2));
        priceField.setText(Integer.toString(resultSet.getInt(3)));
    }

    public static void main(String[] args) throws SQLException {
        DbNavigationForm form = new DbNavigationForm();
    }

}