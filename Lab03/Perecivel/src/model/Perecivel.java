/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author elio
 */
public class Perecivel extends Produto {
    private int validade;
    
    
    public Perecivel(){
    
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }
    
    public void setPreco() {
        this.preco = 1.4F * this.getValor();
    }
    
}
