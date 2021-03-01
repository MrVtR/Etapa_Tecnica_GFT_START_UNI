/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2_gft;

/**
 *
 * @author vitor
 */
public class Desafio2_GFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Números divisíveis por 3 e 7:");
        for (int i = 10; i < 215; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
