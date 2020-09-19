/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JFrame;
import model.Produto;
import view.JanelaTabela;

/**
 *
 * @author vinicius
 */
public class TesteTabela {
    public static void main(String[] args) {
        Collection<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(123, "Arroz", 45.5));
        produtos.add(new Produto(124, "Feijao", 40));
        produtos.add(new Produto(125, "Acucar", 10));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaTabela janela = new JanelaTabela();
                janela.updateTabela(produtos);
                janela.setVisible(true);
            }
        });
    }
}
