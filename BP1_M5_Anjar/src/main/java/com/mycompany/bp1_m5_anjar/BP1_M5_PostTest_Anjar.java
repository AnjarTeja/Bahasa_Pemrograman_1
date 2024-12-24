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

public class BP1_M5_PostTest_Anjar extends JPanel {
    private static final int L = 400, T = 400;
    List<Roket> roketList;

    public BP1_M5_PostTest_Anjar() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        roketList = new ArrayList<>();
        roketList.add(new Roket(100, 200));
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
        private static final int INCREMENT = 5;
        int x, y;
        public Roket(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public void GambarRoket(Graphics g) {
            // Badan roket
            g.setColor(Color.GRAY);
            g.fillRect(x, y, 30, 80);
            // Kerucut atas
            g.setColor(Color.RED);
            int[] kerucutX = {x, x + 15, x + 30};
            int[] kerucutY = {y, y - 30, y};
            g.fillPolygon(kerucutX, kerucutY, 3);
            // Sayap kiri
            g.setColor(Color.BLUE);
            int[] sayapKiriX = {x, x - 20, x};
            int[] sayapKiriY = {y + 60, y + 80, y + 80};
            g.fillPolygon(sayapKiriX, sayapKiriY, 3);
            // Sayap kanan
            g.setColor(Color.BLUE);
            int[] sayapKananX = {x + 30, x + 50, x + 30};
            int[] sayapKananY = {y + 60, y + 80, y + 80};
            g.fillPolygon(sayapKananX, sayapKananY, 3);
            // Api
            g.setColor(Color.ORANGE);
            int[] apiX = {x + 10, x + 15, x + 20};
            int[] apiY = {y + 80, y + 110, y + 80};
            g.fillPolygon(apiX, apiY, 3);
        }
        public void Bergerak() {
            if (x >= L) {
                x = 1;
            } else {
                x += INCREMENT;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.getContentPane().add(new BP1_M5_PostTest_Anjar());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animasi Roket Bergerak");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}