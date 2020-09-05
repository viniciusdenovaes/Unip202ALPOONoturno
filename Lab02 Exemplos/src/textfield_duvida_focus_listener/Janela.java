package textfield_duvida_focus_listener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		textField.addFocusListener(new ComportamentoFocus());
		textField.addKeyListener(new ComportamentoTecla());
		
		JButton botaoSubmit = new JButton("Submit");
		add(botaoSubmit);
		botaoSubmit.addActionListener(new ComportamentoTexto());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}
	
	private void verificaTexto() {
		if(textField.getText().length()<=5) {
			System.out.println("Texto inválido");
			//textField.setText("");
		}else {
			System.out.println("Texto válido");
		}
	}
	
	class ComportamentoTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Texto entrado: " + textField.getText());
		}
		
	}
	
	/*
	 * Texto do usuário DEVE ter tamanho maior que 5
	 * */
	class ComportamentoFocus implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
		}

		@Override
		public void focusLost(FocusEvent e) {
			verificaTexto();
		}
		
	}
	class ComportamentoTecla implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			verificaTexto();
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	

}






