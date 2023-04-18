/*
Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do
valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor 
que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
 */
package javaexercises;

import java.util.Scanner;

public class Ex3 {  
    public static void main(String[] args) {
        int carrosVendidos_int;
        double valorTotalVendas_db, salarioFixo_db, comissaoVendaCarro_db, salarioFinal_db;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o número de carros vendidos: ");
        carrosVendidos_int = scan.nextInt();
        
        System.out.print("Insira o valor total das suas vendas: ");
        valorTotalVendas_db = scan.nextDouble();
        
        System.out.print("Insira seu salário fixo: ");
        salarioFixo_db = scan.nextDouble();
        
        System.out.print("Insira a comissão por carro vendido: ");
        comissaoVendaCarro_db = scan.nextDouble();
        
        
        salarioFinal_db = salarioFixo_db + (comissaoVendaCarro_db * carrosVendidos_int) + (valorTotalVendas_db * 0.05);
        
        System.out.print("O seu salário final é: R$" + salarioFinal_db);
        
        
        
        
        
        
        
        
        
    }
    
}
