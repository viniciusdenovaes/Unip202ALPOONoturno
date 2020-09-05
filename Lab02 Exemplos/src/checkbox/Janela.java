package checkbox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
	JCheckBox opcao1;
	JCheckBox opcao2;
	JCheckBox opcao3;
	
	public Janela() {
		setLayout(new FlowLayout());
		
		add(new JLabel("Entre com uma ou mais opções"));
		
		opcao1 = new JCheckBox("Primeira Opção");
		add(opcao1);
		opcao2 = new JCheckBox("Segunda Opção");
		add(opcao2);
		opcao3 = new JCheckBox("Terceira Opção");
		add(opcao3);
		
		JButton botaoSubmit = new JButton("Submit");
		add(botaoSubmit);
		botaoSubmit.addActionListener(new ComportamentoCheckBox());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}
	
	class ComportamentoCheckBox implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(opcao1.isSelected()) {
				System.out.println("Primeira Opção selecionada");
			}
			if(opcao2.isSelected()) {
				System.out.println("Segunda Opção selecionada");
			}
			if(opcao3.isSelected()) {
				System.out.println("Terceira Opção selecionada");
			}
		}
		
	}

}
