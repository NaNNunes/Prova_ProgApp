/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author r.nunes
 */
public class Ex04 {

    public static void main(String[] args) {
        String input;
        int sucessor;
        int antecessor;
        input = JOptionPane.showInputDialog("Informe um valor:");
        
        sucessor = (Integer.parseInt(input) + 1);
        antecessor = (Integer.parseInt(input) - 1);
        
        JOptionPane.showMessageDialog(null, "Antecessor" + ": " + antecessor 
                + "\nSucessor: " + sucessor);
    }
}
