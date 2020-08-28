package jframe_duvida_overload_constructor;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		super("Sem Nome");
		configuraJanela();
	}
	
	public Janela(String titulo) {
		super(titulo);
		configuraJanela();
	}
	
	private void configuraJanela() {
		// 1 - Configurar o tamanho
		this.setSize(400, 200);
		
		// 2 - Configurar comportamento de fechar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3 - Tornar visivel
		this.setVisible(true);
	}
	
}
