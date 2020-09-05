package label;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
	
	public Janela() {
		
		setLayout(new FlowLayout());
		
		JButton botao = new JButton("Não Funciona");
		add(botao);
		
		JLabel label = new JLabel("Etiqueta");
		add(label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	

}
