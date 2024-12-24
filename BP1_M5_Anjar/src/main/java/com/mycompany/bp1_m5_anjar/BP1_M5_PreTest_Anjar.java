/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bp1_m5_anjar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BP1_M5_PreTest_Anjar extends JPanel {
    private int x = 0, y = 100; // Posisi awal bola
    private int dx = 5;         // Kecepatan bola

    public BP1_M5_PreTest_Anjar() {
        // Timer untuk menggerakkan bola
        new Timer(30, e -> {
            x += dx; // Gerakkan bola ke kanan
            if (x > getWidth()) { // Reset posisi jika keluar layar
                x = -30;
            }
            repaint(); // Perbarui tampilan
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30); // Gambar bola
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Bola");
        frame.add(new BP1_M5_PreTest_Anjar());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}