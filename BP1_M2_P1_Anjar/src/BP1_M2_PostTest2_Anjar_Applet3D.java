/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;

public class BP1_M2_PostTest2_Anjar_Applet3D extends Applet {
    public void paint(Graphics g) {

        int[] xFront = {100, 50, 150};
        int[] yFront = {50, 150, 150};

        int[] xBack = {120, 70, 170};
        int[] yBack = {70, 170, 170};

        g.drawPolygon(xFront, yFront, 3);
        g.drawPolygon(xBack, yBack, 3);

        g.drawLine(xFront[0], yFront[0], xBack[0], yBack[0]);
        g.drawLine(xFront[1], yFront[1], xBack[1], yBack[1]);
        g.drawLine(xFront[2], yFront[2], xBack[2], yBack[2]);
    }
}