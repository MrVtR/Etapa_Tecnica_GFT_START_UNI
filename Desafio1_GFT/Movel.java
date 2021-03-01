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
public class Movel extends Produto{
    
    public Movel(String nome, double valor, int qtde) {
        super(nome, valor, qtde);
    }
    
    @Override
    public double calcularValorFinal(){
        double valorF = this.getValor()*this.getQtde();
        if(this.getQtde()<10)
            return valorF + valorF*0.11;
        else
            return valorF + valorF*0.05;
    }
}
