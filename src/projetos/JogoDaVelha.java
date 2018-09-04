package projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha {
	
	private JFrame janela;
	private JPanel painelPrincipal;
	
	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}
	
	private void montaTela() {
		preparaJanela();
		preparaPainelPrincipal();
		preparaBotaoUm();
		preparaBotaoDois();
		preparaBotaoTres();
		preparaBotaoQuatro();
		preparaBotaoCinco();
		preparaBotaoSeis();
		preparaBotaoSair();
		mostraJanela();
	}

	private void preparaJanela() {
		janela = new JFrame("Jogo da Velha");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void preparaPainelPrincipal() {
		painelPrincipal = new JPanel();
		janela.add(painelPrincipal);
	}

	private void preparaBotaoUm() {
		JButton botaoUm = new JButton();
		botaoUm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	private void preparaBotaoDois() {
		// TODO Auto-generated method stub
		
	}

	private void preparaBotaoTres() {
		// TODO Auto-generated method stub
		
	}

	private void preparaBotaoQuatro() {
		// TODO Auto-generated method stub
		
	}

	private void preparaBotaoCinco() {
		// TODO Auto-generated method stub
		
	}

	private void preparaBotaoSeis() {
		// TODO Auto-generated method stub
		
	}

	private void preparaBotaoSair() {
		// TODO Auto-generated method stub
		
	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(600, 600);
		janela.setVisible(true);
	}

}
