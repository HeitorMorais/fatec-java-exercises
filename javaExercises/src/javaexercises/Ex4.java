/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs 
compradas, calcule e escreva o custo total da compra.
 */
package javaexercises;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
       double valorMacaVarejo_db = 1.30, numeroMacas_db, custoTotal_db;
       int valorMacaAtacado_int = 1;
       
       Scanner scan = new Scanner (System.in);
       
        System.out.println("Insira o número de maçãs compradas: ");
        numeroMacas_db = scan.nextDouble();
        
        if(numeroMacas_db >= 12) {
            custoTotal_db = numeroMacas_db * valorMacaAtacado_int;
        } else {
            custoTotal_db = numeroMacas_db * valorMacaVarejo_db;
        }
        
        System.out.println("O custo total da compra é: R$ " + custoTotal_db);
    }   
    
}
