/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entidade.Produto;
import java.util.Collection;

/**
 *
 * @author vinicius
 */
public interface Model {
    
    public void saveProdutos(Collection<Produto> produtos);
    public Collection<Produto> loadProdutos();
    
}
