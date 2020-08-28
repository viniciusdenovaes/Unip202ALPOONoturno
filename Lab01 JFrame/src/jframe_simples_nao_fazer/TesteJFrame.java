package jframe_simples_nao_fazer;

import javax.swing.JFrame;

public class TesteJFrame {
	
	public static void main(String[] args) {
		
		JFrame janela1 = new JFrame("Primeira Janela");
		JFrame janela2 = new JFrame("Segunda Janela");
		
		janela1.setSize(400, 200);
		janela2.setSize(400, 200);
		
		janela1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela1.setVisible(true);
		janela2.setVisible(true);
		
	}

}
