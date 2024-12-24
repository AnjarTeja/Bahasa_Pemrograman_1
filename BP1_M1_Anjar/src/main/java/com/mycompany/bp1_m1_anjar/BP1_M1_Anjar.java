/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bp1_m1_anjar;

/**
 *
 * @author Pongo
 */
import java.awt.*;

public class BP1_M1_Anjar extends Frame {

    public static void main(String[] args) {
        BP1_M1_Anjar test = new BP1_M1_Anjar();
    }
        public BP1_M1_Anjar() {
            super("BP1_M1");
            setSize(300, 100);
        
            Panel panelTombol = new Panel();
            panelTombol.add(new Button("Mulai"));
            panelTombol.add(new Button("Selesai"));

            add("South", panelTombol);
        
             show();
    }
}