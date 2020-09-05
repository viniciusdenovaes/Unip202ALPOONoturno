package textfield;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
	private JTextField textField;
	
	public Janela() {
		setLayout(new FlowLayout());
		
		add(new JLabel("Entre com um texto"));
		
		textField = new JTextField(20);
		add(textField);
		textField.addActionListener(new ComportamentoTexto());
		
		JButton botaoSubmit = new JButton("Submit");
		add(botaoSubmit);
		botaoSubmit.addActionListener(new ComportamentoTexto());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}
	
	class ComportamentoTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Texto entrado: " + textField.getText());
		}
		
	}

}
