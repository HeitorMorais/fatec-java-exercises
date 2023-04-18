/* Escreva um algoritmo para ler o número total
de eleitores de um munípio, o número de votos brancos, nulos
e válidos. Calcular e escrever o percentual que cada um representa
em relação ao total de eleitores.
*/
package javaexercises;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de eleitores: ");
        totalEleitores = scan.nextInt();
        
        System.out.println("Insira a quantidade de votos brancos: ");
        votosBrancos = scan.nextInt();
        
        System.out.println("Insira a quantidade de votos nulos: ");
        votosNulos = scan.nextInt();
        
        System.out.println("Insira a quantidade de votos válidos: ");
        votosValidos = scan.nextInt();
        
        percentualBrancos = (votosBrancos * 100) / totalEleitores;
        
        percentualNulos = (votosNulos * 100) / totalEleitores;
        
        percentualValidos = (votosValidos * 100) / totalEleitores;
        
        System.out.println("O percentual em relação ao total de eleitores é: " + percentualBrancos + "% votos brancos, " + percentualNulos + "% votos nulos, " + percentualValidos + "% votos válidos.");
    }
    
}
