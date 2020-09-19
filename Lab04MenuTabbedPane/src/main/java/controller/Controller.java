/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import entidade.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import model.Model;
import view.View;

/**
 *
 * @author vinicius
 */
public class Controller {
    
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        
        view.addComportamentoMostrarProdutos(new ComportamentoMostrarProdutos());
    }
    
    
    
    class ComportamentoMostrarProdutos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Collection<Produto> produtos = model.loadProdutos();
            view.mostrarProdutos(produtos);
        }
        
    }
    
    
}
