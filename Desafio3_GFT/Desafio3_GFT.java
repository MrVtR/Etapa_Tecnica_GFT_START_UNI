/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3_gft;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Desafio3_GFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intervaloI, intervaloF, intervalo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o intervalo inicial: ");
        intervaloI = sc.nextInt();
        System.out.println("Digite o intervalo final: ");
        intervaloF = sc.nextInt();
        intervalo = intervaloF - intervaloI;
        if(intervalo <= 15)
            for(int i =intervaloI; i<=intervaloF;i++)
                System.out.println(Math.pow(i, 3));
        else
            System.out.println("Intervalo inválido, maior que 15, encerrando programa.");
    }
    
}
