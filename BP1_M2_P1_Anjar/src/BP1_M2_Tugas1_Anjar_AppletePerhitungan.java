/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BP1_M2_Tugas1_Anjar_AppletePerhitungan extends Applet implements ActionListener {
    TextField nom1, nom2, hasil;
    Button tambah, kurang, kali, bagi;

    public void init() {
        Label label1 = new Label("Angka 1:");
        Label label2 = new Label("Angka 2:");
        Label label3 = new Label("Hasil:");

        nom1 = new TextField(5);
        nom2 = new TextField(5);
        hasil = new TextField(10);
        hasil.setEditable(false);

        tambah = new Button("Tambah");
        kurang = new Button("Kurang");
        kali = new Button("Kali");
        bagi = new Button("Bagi");

        add(label1); add(nom1);
        add(label2); add(nom2);
        add(label3); add(hasil);
        add(tambah); add(kurang); add(kali); add(bagi);

        tambah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(nom1.getText());
            double n2 = Double.parseDouble(nom2.getText());
            double res = 0;

            if (e.getSource() == tambah) {
                res = n1 + n2;
            } else if (e.getSource() == kurang) {
                res = n1 - n2;
            } else if (e.getSource() == kali) {
                res = n1 * n2;
            } else if (e.getSource() == bagi) {
                res = n1 / n2;
            }
            hasil.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            hasil.setText("Error");
        }
    }
}