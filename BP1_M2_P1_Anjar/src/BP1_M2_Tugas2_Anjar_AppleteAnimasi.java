/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BP1_M2_Tugas2_Anjar_AppleteAnimasi extends Applet implements Runnable {
    int x, y;
    int targetX, targetY;
    int[] xPoints = {50, 250, 150};
    int[] yPoints = {150, 150, 50};
    int currentTarget = 0;
    Thread animasi;

    public void init() {
        setSize(300, 200);
        setBackground(Color.black);

        x = xPoints[0];
        y = yPoints[0];
        targetX = xPoints[1];
        targetY = yPoints[1];

        animasi = new Thread(this);
        animasi.start();
    }
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, 20, 20);
    }
    public void run() {
        while (true) {
            if (x < targetX) x++;
            if (x > targetX) x--;
            if (y < targetY) y++;
            if (y > targetY) y--;
            if (x == targetX && y == targetY) {
                currentTarget = (currentTarget + 1) % 3;
                targetX = xPoints[currentTarget];
                targetY = yPoints[currentTarget];
            }
            repaint();
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}