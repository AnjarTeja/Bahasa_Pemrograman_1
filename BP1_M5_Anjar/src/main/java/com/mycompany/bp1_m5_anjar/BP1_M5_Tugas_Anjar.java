/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bp1_m5_anjar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class BP1_M5_Tugas_Anjar extends JPanel {
    private static final int L = 400, T = 400;
    List<Roket> roketList;

    public BP1_M5_Tugas_Anjar() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        roketList = new ArrayList<>();
        roketList.add(new Roket(100, 200, 5, 3)); // Menambahkan roket dengan kecepatan awal
        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Roket roket : roketList) {
                    roket.Bergerak();
                    repaint();
                }
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Roket roket : roketList) {
            roket.GambarRoket(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    public class Roket {
        private static final int WIDTH = 30, HEIGHT = 80;
        int x, y, dx, dy;
        public Roket(int x, int y, int dx, int dy) {
            this.x = x;
            this.y = y;
            this.dx = dx;
            this.dy = dy;
        }

        public void GambarRoket(Graphics g) {
            // Badan roket
            g.setColor(Color.GRAY);
            g.fillRect(x, y, WIDTH, HEIGHT);
            // Kerucut atas
            g.setColor(Color.RED);
            int[] kerucutX = {x, x + WIDTH / 2, x + WIDTH};
            int[] kerucutY = {y, y - 30, y};
            g.fillPolygon(kerucutX, kerucutY, 3);
            // Sayap kiri
            g.setColor(Color.BLUE);
            int[] sayapKiriX = {x, x - 20, x};
            int[] sayapKiriY = {y + 60, y + 80, y + 80};
            g.fillPolygon(sayapKiriX, sayapKiriY, 3);
            // Sayap kanan
            g.setColor(Color.BLUE);
            int[] sayapKananX = {x + WIDTH, x + WIDTH + 20, x + WIDTH};
            int[] sayapKananY = {y + 60, y + 80, y + 80};
            g.fillPolygon(sayapKananX, sayapKananY, 3);
            // Api
            g.setColor(Color.ORANGE);
            int[] apiX = {x + WIDTH / 4, x + WIDTH / 2, x + (3 * WIDTH / 4)};
            int[] apiY = {y + HEIGHT, y + HEIGHT + 30, y + HEIGHT};
            g.fillPolygon(apiX, apiY, 3);
        }
        
        public void Bergerak() {
            x += dx;
            y += dy;

            if (x <= 0 || x + WIDTH >= L) {
                dx = -dx;
            }
            if (y <= 0 || y + HEIGHT >= T) {
                dy = -dy;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_M5_Tugas_Anjar());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Roket Bergerak 2D");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}