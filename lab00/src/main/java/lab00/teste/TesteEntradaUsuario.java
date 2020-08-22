/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab00.teste;

import java.util.Scanner;
import javax.swing.JOptionPane;
import lab00.entidade.Instrutor;

/**
 *
 * @author vinicius
 */
public class TesteEntradaUsuario {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre com o nome do Instrutor");
        String nome = in.nextLine();
        
        System.out.println("Entre com o codigo");
        int codigo = Integer.parseInt(in.next());
        
        System.out.println("Entre com a carga horaria");
        double cargaHoraria = Double.parseDouble(in.next());
        
        Instrutor instrutor = new Instrutor(nome, codigo, cargaHoraria);
        
        System.out.println("Nome: " + instrutor.getNome());
        System.out.println("Codigo: " + instrutor.getCodigo());
        System.out.println("Carga Horaria: " + instrutor.getCargaHoraria());
        System.out.println("Salario: " + instrutor.getSalario());
        
        String mensagem = "";
        mensagem += "Nome: " + instrutor.getNome() + "\n";
        mensagem += "Codigo: " + instrutor.getCodigo() + "\n";
        mensagem += "Carga Horaria: " + instrutor.getCargaHoraria() + "\n";
        mensagem += "Salario: " + instrutor.getSalario() + "\n";
        
        JOptionPane.showMessageDialog(null, mensagem);

        

        
        
    }
    
}
