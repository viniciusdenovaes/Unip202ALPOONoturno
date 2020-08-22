/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab00.entidade;

/**
 *
 * @author vinicius
 */
public class Instrutor {
    
    //Criar a classe Instrutor com os atributos privados: 
    // nome (String), código (Integer), carga horária (Double) e salário (Double) e um construtor.
    
    private String nome;
    private int codigo;
    private double cargaHoraria;
    private double salario;
    
    public Instrutor(String aNome, int aCodigo, double aCargaHoraria){
        this.nome = aNome;
        this.codigo = aCodigo;
        this.cargaHoraria = aCargaHoraria;
        
        double pagamentoPorHora = 0;
        if(this.cargaHoraria < 30){
            pagamentoPorHora = 20;
        } else{
            pagamentoPorHora = 15;
        }
        
        this.salario = this.cargaHoraria * pagamentoPorHora;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public double getCargaHoraria(){
        return this.cargaHoraria;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    
}
