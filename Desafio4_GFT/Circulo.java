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
public class Circulo implements AreaCalculavel {

    public static final double PI = 3.141592653589793;
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(this.raio, 2);
    }
}
