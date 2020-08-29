package duvida_setlocationrelativeto;

import javax.swing.JFrame;

public class TesteJanela {
	
	public static void main(String[] args) {
		JFrame janela2 = new JFrame("Janela 2");
		JFrame janela1 = new JFrame("Janela 1");
		
		janela1.setSize(400, 400);
		janela2.setSize(700, 200);
		
		janela1.setLocationRelativeTo(null);
		
		janela1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		janela1.setVisible(true);
		
		janela2.setLocationRelativeTo(janela1);
		janela2.setVisible(true);
		
		janela1.setVisible(false);
		janela1.setVisible(true);
		
	}

}
