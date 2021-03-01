/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1_gft;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Caixa {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Caixa(ArrayList<Produto> produtos) {
        this.setProdutos(produtos);
    }

    private void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void calcularTotal() {
        double soma = 0;
        for (int i = 0; i < this.produtos.size(); i++) {
            System.out.println("Nome: " + this.produtos.get(i).getNome());
            System.out.println("Valor: " + this.produtos.get(i).getValor());
            System.out.println("Quantidade: " + this.produtos.get(i).getQtde());
            System.out.format("Valor Final: %.2f%n", this.produtos.get(i).calcularValorFinal());
            System.out.println("");
            soma += this.produtos.get(i).calcularValorFinal();
        }
        System.out.format("Valor total da lista: %.2f%n", soma);
    }
}
