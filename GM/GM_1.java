/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gm;

import javax.swing.JFrame;

public class GM_1{
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // 1. Creamos la Ventana Maestra
                JFrame ventana = new JFrame("Sistema Grupo Modelo");
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setSize(591, 541); 
                ventana.setLocationRelativeTo(null); // Centramos la ventana en la pantalla
                
             
                
                // 2. Creamos tu primer lienzo
                BMain inicio = new BMain(); 
                
                // 3. Pegamos el lienzo en la ventana y la mostramos
                ventana.add(inicio);
                ventana.setVisible(true); 
            }
        });
    }
}
//[361, 344]
//[602, 465]
//[591, 541]
/*
ventana.setContentPane(new PanelA());
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.revalidate();
        ventana.repaint();
*/