package duvida_setlocationrelativeto;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		Dimension dimensionTela = Toolkit.getDefaultToolkit().getScreenSize();
		
		int larguraTela = dimensionTela.width;
		int alturaTela = dimensionTela.height;
		
		int larguraJanela = larguraTela/2;
		int alturaJanela = alturaTela/2;
		
		setSize(larguraJanela, alturaJanela);
		
		//setLocation(larguraTela/4, alturaTela/4);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

}
