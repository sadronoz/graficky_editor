package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow(int width, int height){
        setSize(width, height);
        setTitle("My first window");
        setVisible(true);
        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JLabel labHello = new JLabel("Hello");
        add(labHello);

        JTextField textField = new JTextField();
        textField.setText("Hello");
        textField.setEditable(false);
        add(textField);

        JButton jButton = new JButton("Click me");
        add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("World");
                JOptionPane.showMessageDialog(null, "Zadej číslo!");
            }
        });

        JTextField txtFieldNum1 = new JTextField();
        txtFieldNum1.setEditable(true);
        txtFieldNum1.setText("0");
        JTextField txtFieldNum2 = new JTextField();
        txtFieldNum2.setEditable(true);
        txtFieldNum2.setText("0");
        add(txtFieldNum1);
        add(txtFieldNum2);

        JButton sumButton = new JButton("Sum the numbers");
        add(sumButton);

        JTextField sumTxtField = new JTextField();
        sumTxtField.setEditable(false);
        sumTxtField.setText("0");
        add(sumTxtField);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                try{
                    sum = Integer.parseInt(txtFieldNum1.getText()) + Integer.parseInt(txtFieldNum2.getText());
                    sumTxtField.setText(String.valueOf(sum));
                }
                catch (Exception exp){
                    JOptionPane.showMessageDialog(null, "Musí být zadaná čísla!");
                }
            }
        });


    }
}
