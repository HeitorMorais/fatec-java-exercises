/*
O custo de  um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do 
distribuidor é de 28% e os impostos de 45%, escreva um algoritmo para ler o custo de fábrica
de um carro, calcular e escrever o custo final ao consumidor.
 */
package javaexercises;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        double custoFabrica, custoFinal;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Insira o custo de fábrica do carro: ");
        custoFabrica = scan.nextDouble();
        
        custoFinal = custoFabrica + (custoFabrica * 28 / 100) + (custoFabrica * 45 / 100);
        
        System.out.print("O custo final ao consumidor será R$" + custoFinal);
    }
    
}
