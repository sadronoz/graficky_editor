package src;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(int width, int height){
        setSize(width, height);
        setTitle("My first window");
        setVisible(true);
        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel labHello = new JLabel("Hello");
        add(labHello);
    }
}
