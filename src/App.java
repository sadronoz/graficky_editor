package src;

import javax.swing.*;

public class App {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new MainWindow(WIDTH, HEIGHT));
    }
}
