/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votos;

import java.util.Scanner;

/**
 *
 * @author Sandro Fiabane
 */
public class Votos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numeleitor, votbranco, votnulo, votvalid;
     double perctbranco, perctnulo,perctvalido;
     
        System.out.println("Mostre o número total de Eleitores:");
        numeleitor = teclado.nextInt();
        System.out.println("Mostre o número de votos Brancos:");
        votbranco = teclado.nextInt();
        System.out.println("Mostre o número de votos Nulos:");
        votnulo = teclado.nextInt();
        System.out.println("Mostre o número de votos Validos:");
        votvalid = teclado.nextInt();
        
        perctbranco =(double) votbranco / numeleitor * 100;
        perctnulo = (double) votnulo / numeleitor * 100;
        perctvalido = (double) votvalid / numeleitor * 100;
        
        System.out.println("Temos "+perctbranco+ " por cento de votos brancos");
        System.out.println("Temos "+perctbranco+ " por cento de votos nulos");
        System.out.println("Temos "+perctbranco+ " por cento de votos validos");
    }
    
}
