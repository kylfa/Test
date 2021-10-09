package de.medieninformatik.swt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PaintAreaController implements MouseListener {
    private static int doubleClickX;
    private static int doubleClickY;
    private static int clickCount = 0;

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getClickCount() == 2) {
            doubleClickX = me.getX();
            doubleClickY = me.getY();
            System.out.println("X: " + doubleClickX + "  Y: " + doubleClickY);
            clickCount++;
        }
    }

    public int getDoubleClickX() {
        return doubleClickX;
    }

    public int getDoubleClickY() {
        return doubleClickY;
    }

    public int getClickCount() {
        return clickCount;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
