package projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AcaoJogada extends JogoDaVelha implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		processaJogada(jogador, (JButton)e.getSource());
	}
	

}
