package action_listener.inner_class;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public class ComportamentoBotao implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Botao apertado");
		}

	}

}
