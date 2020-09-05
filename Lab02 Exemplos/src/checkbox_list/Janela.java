package checkbox_list;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
	ArrayList<JCheckBox> opcoes = new ArrayList<>();
	
	public Janela() {
		setLayout(new FlowLayout());
		
		add(new JLabel("Entre com uma ou mais opções"));
		
		opcoes.add(new JCheckBox("Primeira Opção"));
		opcoes.add(new JCheckBox("Segunda Opção"));
		opcoes.add(new JCheckBox("Terceira Opção"));
		
		for(JCheckBox cb: opcoes) {
			add(cb);
			cb.addActionListener(new ComportamentoCheckBox());
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
			System.out.println();
			for(JCheckBox cb: opcoes) {
				if(cb.isSelected()) {
					System.out.println("Opcao " + cb.getText() + " selecionada");
				}
			}
		}
		
	}

}
