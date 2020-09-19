/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidade.Produto;
import java.util.ArrayList;
import java.util.Collection;
import model.ModelCsv;

/**
 *
 * @author vinicius
 */
public class TesteModelCSV {
    
    public static void main(String[] args) {
        ModelCsv model = new ModelCsv();
//        Collection<Produto> produtos = new ArrayList<>();
//        produtos.add(new Produto(1, "Arroz", 10));
//        produtos.add(new Produto(2, "Feijão", 5));
//        produtos.add(new Produto(3, "Açúcar", 4.5));
        
//        model.saveProdutos(produtos);
        Collection<Produto> produtos = model.loadProdutos();
        for(Produto produto: produtos){
            System.out.println(produto);
        }
    }
    
}
