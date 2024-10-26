/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex08;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author r.nunes
 */
public class Ex08 {

    public static void main(String[] args) throws IOException {
        toFile(inputValues());
    }
    
    public static int inputValues(){
        DataInputStream data;
        final int len = 5;
        String input;
        int valor;

            while (true){
                try {
                    System.out.printf("Insira 1 valor\n");
                    data = new DataInputStream(System.in);
                    valor = Integer.parseInt(input = data.readLine());
                    break;
                }
                catch (Exception erro){
                    System.out.println("Valor invalido");
                }
            }
            
        return valor;
    }
    
    public static void toFile(int valor) throws IOException{
        Date date = new Date();
        
        FileWriter file = new FileWriter("C:\\Users\\Public\\TABUADA.txt");
        PrintWriter record = new PrintWriter(file);
        
        record.println("TABUADA DE " + valor);
        for (int j = 1; j <= 10; j++){
            record.printf("\n %3d x %3d = %3d", valor, j, (valor * j));
        }
        record.printf("\n---------------");
        record.printf("%s", date.getDate());
        record.close();
        
    }
}
