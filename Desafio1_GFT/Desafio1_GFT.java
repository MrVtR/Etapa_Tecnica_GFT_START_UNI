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
public class Desafio1_GFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Eletronico e = new Eletronico("Ventilador", 320, 3);
        Eletronico e2 = new Eletronico("Computador", 3999, 2);
        Movel m = new Movel("Mesa", 270, 2);
        Produto p = new Produto("Caderno", 10.5, 10);
        Movel m2 = new Movel("Cadeira", 234.25, 2);
        Produto p2 = new Produto("Caneta",0.7, 15);
        
        produtos.add(e);
        produtos.add(e2);
        produtos.add(m);
        produtos.add(p);
        produtos.add(m2);
        produtos.add(p2);
        
        Caixa c = new Caixa(produtos);
        c.calcularTotal();
    }
}
