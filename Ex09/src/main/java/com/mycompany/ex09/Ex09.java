/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex09;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

/**
 *
 * @author r.nunes
 */
public class Ex09 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input = "";
        
        double[] descontos = new double[3];
        double[] salario = new double[2];
        double ganhoHora;
        int trabalahoMes;
        
        System.out.println("Informe seu ganho por hora: ");
        data = new DataInputStream(System.in);
        input = data.readLine();
        ganhoHora = Double.parseDouble(input);
        
        System.out.println("Horas que trabalha no mes: ");
        data = new DataInputStream(System.in);
        input = data.readLine();
        trabalahoMes = Integer.parseInt(input);
        
        salario[0] = ganhoHora * trabalahoMes;
        descontos[0] = ((ganhoHora * trabalahoMes) * 0.11);
        descontos[1] = ((ganhoHora * trabalahoMes) * 0.8);
        descontos[2] = ((ganhoHora * trabalahoMes) * 0.5);
        salario[1] = salario[0] - descontos[0] - descontos[1] - descontos[2];
        
        System.out.println("+ Salario Bruto: R$" + salario[0]);
        System.out.println("- Imposto de Renda (11%): R$" + descontos[0]);
        System.out.println("- INSS (8%): R$" + descontos[1]);
        System.out.println("- Sinficato (5%): R$" + descontos[2]);
        System.out.println("= Salario liquido: R$" + salario[1]);
    }
}
