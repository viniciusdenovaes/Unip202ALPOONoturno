/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab00.teste;

import lab00.entidade.Instrutor;

/**
 *
 * @author vinicius
 */
public class TetsteInstrutor {
    
    public static void main(String[] args) {
        
        Instrutor instrutor = new Instrutor("Vinicius", 123, 10);
        
        System.out.println("Nome: " + instrutor.getNome());
        System.out.println("Codigo: " + instrutor.getCodigo());
        System.out.println("Carga Horaria: " + instrutor.getCargaHoraria());
        System.out.println("Salario: " + instrutor.getSalario());
        
    }
    
}
