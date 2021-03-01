/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio4_gft;

/**
 *
 * @author vitor
 */
public class Teste {
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado q = new Quadrado(5);
        Retangulo r = new Retangulo(5, 7);
        Circulo c = new Circulo(4);
        
        System.out.println("Área do Quadrado: " + q.calcularArea());
        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Área do Círuclo: " + c.calcularArea());
    }
}
