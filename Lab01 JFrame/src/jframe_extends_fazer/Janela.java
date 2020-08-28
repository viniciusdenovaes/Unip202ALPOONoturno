package jframe_extends_fazer;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela(String titulo) {
		super(titulo);
		
		// 1 - Configurar o tamanho
		this.setSize(400, 200);
		
		// 2 - Configurar comportamento de fechar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3 - Tornar visivel
		this.setVisible(true);
		
	}
	
}
