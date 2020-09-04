package jbutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		setLayout(new FlowLayout());
		
		JButton botao = new JButton("Pressione");
		add(botao);
		botao.addActionListener(new ComportametoBotaoPressione());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	class ComportametoBotaoPressione implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Botao Pressionado");
		}
		
	}

}
