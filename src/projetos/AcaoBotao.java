package projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AcaoBotao extends JogoDaVelha implements ActionListener{
	
	int x,y;
	
	
	
	public void matriz(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		processaJogada((JButton)e.getSource(), x, y);
		
	}
	
	public void processaJogada(JButton button, int x, int y) {
		if (jogador == 1) {
			tabela[x][y] = 1;
			button.setIcon(imagemX);
			jogador = 2;
			ganhador = jogador1;
			checarJogada(1);
			velha();
		} else {
			tabela[x][y] = 2;
			button.setIcon(imagemO);
			jogador = 1;
			ganhador = jogador2;
			checarJogada(2);
			velha();
		}
	
	}
	

}
