package de.medieninformatik.swt;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PaintArea extends Canvas {
    private final PaintAreaController pac;

    public PaintArea(PaintAreaController pac) {
        setSize(400, 300);
        addMouseListener(pac);
        this.pac = pac;
    }

    @Override
    public void paint(Graphics g) {
        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(pac.getDoubleClickX(),
                pac.getDoubleClickY(), 20.0F, 20.0F);
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(ellipse2D);
        repaint();
        // super.paint(g);
        //g.drawOval(PaintAreaController.getDoubleClickX(), PaintAreaController.getDoubleClickY(),50, 50);
    }
}
