/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controller.Controller;
import model.ModelCsv;
import view.view_janela.ViewJanela;

/**
 *
 * @author vinicius
 */
public class TesteController {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                model.Model model = new ModelCsv();
                ViewJanela view = new ViewJanela();
                view.setVisible(true);
                controller.Controller controller = new Controller(view, model);
            }
        });

    }
    
}
