package de.medieninformatik.swt;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MainFrame extends Frame {

    private static final PaintAreaController _paController = new PaintAreaController();
    private static final PaintArea _paintArea = new PaintArea(_paController);


    public MainFrame(MainFrameController mfc) {
        setTitle("Metrik Version 1.0");
        setSize(400, 300);

        //initializeMenu();

        addWindowListener(mfc);
        add(_paintArea);  // new Canvas()
    }



    /*
    private void initializeMenu() {
        MenuBar mBar = new MenuBar();
        Menu mFile = new Menu("Program");
        mFile.add(new MenuItem("Neues Programm"));
        mFile.add(new MenuItem("Beenden"));
        mBar.add(mFile);
        setMenuBar(mBar);
    }
     */
}
