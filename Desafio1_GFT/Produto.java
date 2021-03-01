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
public class Produto {
    private String nome;
    private double valor;
    private int qtde;

    public Produto(String nome, double valor, int qtde) {
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQtde() {
        return qtde;
    }
    
    public double calcularValorFinal(){
        return (this.valor*this.qtde) + (0.1*this.valor*this.qtde);
    }
}
