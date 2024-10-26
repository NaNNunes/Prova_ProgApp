/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex03 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input = "";
        String[] item = {"Cafe Expresso", "Cafe Capuccino", "Leite c/ Cafe", "Todos os Cafes"};
        double[] venda = new double[4];
        int[] contagem = new int[4];
        boolean isContinue;
        
        do{
            isContinue = false;
            System.out.printf("""
                              ---------------------------
                               Informe uma opcao:
                               [1] - Cafe Expresso
                               [2] - Cafe Capuccino
                               [3] - Leite c/ Cafe
                               [4] - Totalizar Vendas
                              ---------------------------
                               """);
            System.out.printf("-> ");
            data = new DataInputStream(System.in);
            input = data.readLine();

            switch (input){
                case "1" -> { 
                    venda[0] += 0.75;
                    contagem[0] ++;
                    }
                case "2" -> { 
                    venda[1] += 1;
                    contagem[1] ++;
                    }
                case "3" -> { 
                    venda[2] += 1.25;
                    contagem[2] ++;
                    }
                case "4" -> {
                    isContinue = true;
                }
                default -> {
                    System.out.println("--- Opcao invalida ---");
                }
            }
        } while (!isContinue);
        data.close();
        
        for (int i = 0; i < 3; i++) {
            venda[3] += venda[i];
            contagem[3] += contagem[i];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------------------------");
            System.out.printf("Quantidade de %s vendidos: %d\n", item[i], contagem[i]);
            System.out.printf("Valor de venda: R$%2.2f\n", venda[i]);
        }
        System.out.println("-----------------------------------");
        System.out.printf("Quantidade de %s vendidos: %d\n", item[3], contagem[3]);
        System.out.printf("Valor de venda: R$%2.2f\n", venda[3]);
        
    }
}
