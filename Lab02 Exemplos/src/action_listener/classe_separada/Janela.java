package action_listener.classe_separada;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		setLayout(new FlowLayout());
		
		JButton botao = new JButton("Aperte!");
		add(botao);
		botao.addActionListener(new ComportamentoBotao());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

}
