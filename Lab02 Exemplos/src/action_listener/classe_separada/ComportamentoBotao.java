package action_listener.classe_separada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComportamentoBotao implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Botao apertado");
	}

}
