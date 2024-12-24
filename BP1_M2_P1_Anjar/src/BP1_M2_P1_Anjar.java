/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

public class BP1_M2_P1_Anjar extends Applet {

    public void init() {

    }
    
    public void paint (Graphics g){
        Font f = new Font ("Comic Sans MS", Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.red);
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().height/2;
        String s = "Ayoo Belajar Java Applet!!!";
        FontMetrics fm = this.getFontMetrics(f);
        int posisiX = xPusat - (fm.stringWidth(s)/2);
        g.drawString("Ayoo Belajar Java Applet!!!", posisiX, yPusat);
    }
}