package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawingCanvas extends JComponent {

    private int posX, posY;
    private int width, height;

    public DrawingCanvas(int width, int height){

        this.width = width;
        this.height = height;

        mMouseListener mListener = new mMouseListener();
        addMouseMotionListener(mListener);
        addMouseListener(mListener);
    }

    private class mMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
        }
    }
    /*@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillOval(posX - 125, posY - 125, 250, 250);
    }*/


}
