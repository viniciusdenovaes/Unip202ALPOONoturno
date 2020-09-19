/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entidade.Produto;
import java.awt.event.ActionListener;
import java.util.Collection;

/**
 *
 * @author vinicius
 */
public interface View {
    
    public void mostrarProdutos(Collection<Produto> produtos);
    public void addComportamentoMostrarProdutos(ActionListener al);
    
}
