package src;

import src.component.BaseComponent;
import src.component.Circle;
import src.component.ComponentList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawingCanvas extends JComponent {

    private int posX = -1, posY = -1;
    private int sizeX, sizeY;
    private int width, height;

    private ComponentList componentList;

    public DrawingCanvas(int width, int height){

        this.width = width;
        this.height = height;

        componentList = ComponentList.getINSTANCE();

        mMouseListener mListener = new mMouseListener();
        addMouseMotionListener(mListener);
        addMouseListener(mListener);
    }

    private class mMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            if(posX == -1 || posY == -1){
                posX = e.getX();
                posY = e.getY();
                repaint();
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);

            Circle circle = new Circle(posX, posY, sizeX);
            componentList.add(circle);
            posX = -1;
            posY = -1;
            sizeX = 0;
            sizeY = 0;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);

            int size = (int) Math.round(Math.sqrt(Math.pow(posX - e.getX(), 2) + Math.pow(posY - e.getY(), 2)));
            sizeX = size;
            sizeY = size;
            repaint();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for(BaseComponent b : componentList.getList()){
            if(b instanceof Circle){
                g.drawOval(b.getX() - b.getWidth()/2, b.getY() - b.getHeight()/2, b.getWidth(), b.getHeight());
            }
        }
//        g.fillOval(posX - sizeX/2, posY - sizeY/2, sizeX, sizeY);
    }


}
