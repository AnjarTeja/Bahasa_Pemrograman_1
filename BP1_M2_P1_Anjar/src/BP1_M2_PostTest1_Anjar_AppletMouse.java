/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class BP1_M2_PostTest1_Anjar_AppletMouse extends Applet implements MouseMotionListener {
    private int mouse1 = 0;
    private int mouse2 = 0;

    public void init() {
    addMouseMotionListener(this);
    }
public void paint(Graphics g) {
        g.drawString("Mouse di (" + mouse1 + ", " + mouse2 + ")", mouse1, mouse2);
    }

    public void mouseMoved(MouseEvent e) {
        mouse1 = e.getX();
        mouse2 = e.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent e) {
    }
}