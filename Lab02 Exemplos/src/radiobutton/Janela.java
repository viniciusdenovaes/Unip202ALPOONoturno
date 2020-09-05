package radiobutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
	JRadioButton opcao1;
	JRadioButton opcao2;
	JRadioButton opcao3;
	
	public Janela() {
		setLayout(new FlowLayout());
		
		add(new JLabel("Entre com uma opção"));
		
		opcao1 = new JRadioButton("Primeira Opção");
		add(opcao1);
		opcao2 = new JRadioButton("Segunda Opção");
		add(opcao2);
		opcao3 = new JRadioButton("Terceira Opção");
		add(opcao3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(opcao1);
		bg.add(opcao2);
		bg.add(opcao3);
		
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
