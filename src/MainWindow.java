package src;

import src.component.ComponentList;

import javax.swing.*;
import javax.swing.plaf.ToolBarUI;
import javax.swing.plaf.basic.BasicMenuBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MainWindow extends JFrame {

    private ComponentList componentList;
    public MainWindow(int width, int height){
        setSize(width, height);
//        setTitle("My first window");
        setVisible(true);
        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        componentList = ComponentList.getINSTANCE();

        add(new DrawingCanvas(width, height), BorderLayout.CENTER); // This is adding entire JComponent as a class

        JToolBar barMain = new JToolBar(SwingConstants.VERTICAL);
        /*barMain.setUI(new ToolBarUI(){
            public void paint(Graphics g, JComponent c){
                g.setColor(Color.GRAY);
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }
        });*/
        add(barMain, BorderLayout.LINE_END);

        // adjusting JPanel body

        JPanel panelObjects = new JPanel();
        panelObjects.setLayout(new BoxLayout(panelObjects, BoxLayout.X_AXIS));

        JButton buttonCircle = new JButton("Circle");
        panelObjects.add(buttonCircle);



        // end of JPanel adjustments

        barMain.add(panelObjects);


        /*addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });*/

        //add(new TestForm().getMainPanel());

        /*setLayout(new FlowLayout());

        JLabel labHello = new JLabel("Hello");
//        add(labHello);

        JTextField textField = new JTextField();
        textField.setText("Hello");
        textField.setEditable(false);
//        add(textField);

        JButton jButton = new JButton("Click me");
//        add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("World");
                JOptionPane.showMessageDialog(null, "Zadej číslo!");
            }
        });

        JLabel lbNum1 = new JLabel("Zadej číslo 1:");
        add(lbNum1);
        JTextField txtFieldNum1 = new JTextField();
        txtFieldNum1.setEditable(true);
        txtFieldNum1.setColumns(4);
        JTextField txtFieldNum2 = new JTextField();
        txtFieldNum2.setEditable(true);
        txtFieldNum2.setColumns(4);
        add(txtFieldNum1);
        JLabel lbNum2 = new JLabel("Zadej číslo 2:");
        add(lbNum2);
        add(txtFieldNum2);

        JButton sumButton = new JButton("Sum the numbers");
        add(sumButton);

        JTextField sumTxtField = new JTextField();
        sumTxtField.setEditable(false);
        sumTxtField.setColumns(4);
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
        });*/


    }
}
