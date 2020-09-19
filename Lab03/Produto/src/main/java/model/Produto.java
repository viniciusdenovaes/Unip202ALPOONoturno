
package model;

/**
 *
 * @author elio
 */
public class Produto {
    private String nome;
    private Integer codigo;
    private Float valor;
    private Float preco;
        
    public Produto(){
    
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the preco
     */
    public Float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public void setPreco() {
      this.preco = 1.2F * this.getValor();
    }
  
}
