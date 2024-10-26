/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex02 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input;
        String msg = "";
        int[] numbers = new int[4]; 
        
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 -> msg = "Informe seus anos completos de vida: ";
                case 1 -> msg = "Informe seus meses completos de vida: ";
                case 2 -> msg = "Informe seus meses completos de vida: ";
            }
            while (true){
                try { 
                    System.out.println(msg);
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    numbers[i] = Integer.parseInt(input);
                    switch (i) {
                    case 0 -> numbers[3] += (numbers[i] * 365);
                    case 1 -> numbers[3] += (numbers[i] * 30);
                    case 2 -> numbers[3] += (numbers[i]);
                }
                    break;
                } catch (Exception erro){
                    System.out.println("--- Por favor, apenas numeros inteiros validos ---");
                }
            } 
        }
        data.close();
        
        System.out.println("Sua idade em dias: " + numbers[3]);
        
    }
}
