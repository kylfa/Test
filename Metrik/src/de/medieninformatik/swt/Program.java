package de.medieninformatik.swt;

/**
 * @author Frieda Kolbe, m29061
 * Version 1.0
 */

public class Program {

    public static void main(String[] args) {

        MainFrameController mfc = new MainFrameController();
        MainFrame mainFrame = new MainFrame(mfc);

        mainFrame.setVisible(true);
    }
}
