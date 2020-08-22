package lab00_elio.model;

public class Instrutor {
    
    private String nome;
    private Integer codigo;
    private Double cargaHoraria; 
    private Double salario;

    public Instrutor() {
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
     * @return the cargaHoraria
     */
    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    public void calcularSalario()
    {
        if (this.cargaHoraria < 30)
            this.salario = 20 * this.cargaHoraria;
        else
            this.salario = 15 * this.cargaHoraria;
    }
    
    
}
