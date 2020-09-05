package radiobutton_list;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
	ArrayList<JRadioButton> opcoes = new ArrayList<>();
	
	public Janela() {
		setLayout(new FlowLayout());
		
		add(new JLabel("Entre com uma opção"));
		
		opcoes.add(new JRadioButton("Primeira Opção"));
		opcoes.add(new JRadioButton("Segunda Opção"));
		opcoes.add(new JRadioButton("Terceira Opção"));
		
		ButtonGroup bg = new ButtonGroup();
		for(JRadioButton rb: opcoes) {
			add(rb);
			bg.add(rb);
		}
		
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
			for(JRadioButton rb: opcoes) {
				if(rb.isSelected()) {
					System.out.println("Opcao selecionada: " + rb.getText());
				}
			}
		}
		
	}

}
