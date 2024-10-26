/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex06;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex06 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input = "";
        char[] char_valores;
        String[] str_valores;
        int contaDigito;
        int[] valores;
        int validador;
        
        while (true){
            try {
                System.out.printf("Informe um valor: ");
                data = new DataInputStream(System.in);
                input = data.readLine();
                validador = Integer.parseInt(input);
                break;
            } catch (Exception erro){
                System.out.println("--- Por favor, apenas numeros inteiros validos ---");
            }
        }
        data.close();
        
        contaDigito = input.length();
        valores = new int[contaDigito + 1];
        char_valores = new char[contaDigito];
        str_valores = new String[contaDigito];
        
        for (int i = 0; i < contaDigito; i++) {
            char_valores[i] = input.charAt(i);
            str_valores[i] = Character.toString(char_valores[i]);
            valores[i] = Integer.parseInt(str_valores[i]);
            valores[2] += valores[i];
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Media entre valores digitados: " + (valores[2] / contaDigito));
        System.out.println("Soma entre valores digitados: " + valores[2]);
        System.out.println("Quantidade de valores digitados: " + contaDigito);
    }
}
