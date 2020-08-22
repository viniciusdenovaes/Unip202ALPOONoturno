
package lab00_elio.aula1;

import javax.swing.JOptionPane;
import lab00_elio.model.Instrutor;


public class Aula1 {
   
    public static void main(String[] args) {
        
        Instrutor instrutor = new Instrutor(); 
        
        instrutor.setNome(JOptionPane.showInputDialog("Nome:"));
        
        instrutor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código:")));
        
        instrutor.setCargaHoraria(Double.parseDouble(JOptionPane.showInputDialog("CH:")));
        
        instrutor.calcularSalario();
        
        JOptionPane.showMessageDialog(null, instrutor.getNome() + '\n' + instrutor.getCodigo()
        + '\n' + instrutor.getCargaHoraria() + '\n' + instrutor.getSalario());
    }
    
}
