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
        setNome(nome);
        setValor(valor);
        setQtde(qtde);
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getValor() {
        return valor;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    }

    protected int getQtde() {
        return qtde;
    }

    protected void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    //Mudar para protected
    protected double calcularValorFinal(){
        return (this.valor*this.qtde) + (0.1*this.valor*this.qtde);
    }
    
}
