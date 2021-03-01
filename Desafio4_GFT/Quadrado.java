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
public class Quadrado implements AreaCalculavel{

    private double lado;

    public Quadrado(double lado) {
        setLado(lado);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
