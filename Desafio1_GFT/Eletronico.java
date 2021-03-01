/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1_gft;

/**
 *
 * @author vitor
 */
public class Eletronico extends Produto{
    
    public Eletronico(String nome, double valor, int qtde) {
        super(nome, valor, qtde);
    }
    
    @Override
    public double calcularValorFinal(){
        double valorF = this.getValor()*this.getQtde();
        return valorF + valorF*0.15;
    }
}
