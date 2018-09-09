package projetos;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha {

	private int[][] tabela = new int[3][3];
	private JButton[] button = new JButton[9];
	private JFrame janela;
	private JPanel painelPrincipal;
	protected int jogador;

	ImageIcon imagemX = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon imagemO = new ImageIcon(getClass().getResource("O.png"));

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	private void montaTela() {
		jogador = 1;
		preparaJanela();
		preparaPainelPrincipal();
		mostraJanela();
		preparaBotaoUm();
		preparaBotaoDois();
		preparaBotaoTres();
		preparaBotaoQuatro();
		preparaBotaoCinco();
		preparaBotaoSeis();
		preparaBotaoSete();
		preparaBotaoOito();
		preparaBotaoNove();
		preparaBotaoSair();
	}

	private void preparaJanela() {
		janela = new JFrame("Jogo da Velha");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void preparaPainelPrincipal() {
		painelPrincipal = new JPanel();
		janela.add(painelPrincipal);
	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(600, 600);
		janela.setVisible(true);
	}

	private void preparaBotaoUm() {
		button[0] = new JButton();
		painelPrincipal.add(button[0]);
		int x = 0, y = 0;
		button[0].setBounds(10, 10, 120, 120);
		button[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(), x, y);
			}
		});
	}

	private void preparaBotaoDois() {
		button[1] = new JButton();
		painelPrincipal.add(button[1]);
		int x = 1, y= 0;
		button[1].setBounds(140, 10, 120, 120);
		button[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(), x, y);
				
			}
		});
	}

	private void preparaBotaoTres() {
		button[2] = new JButton();
		painelPrincipal.add(button[2]);
		int x = 2, y = 0;
		button[2].setBounds(270, 10, 120, 120);
		button[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(), x, y);
			}
		});
	}

	private void preparaBotaoQuatro() {
		button[3] = new JButton();
		painelPrincipal.add(button[3]);
		int x = 0, y = 1;
		button[3].setBounds(10, 140, 120, 120);
		button[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(), x, y);
			}
		});
	}

	private void preparaBotaoCinco() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoSeis() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoSete() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoOito() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoNove() {
		// TODO Auto-generated method stub

	}

	public void processaJogada(JButton button, int x, int y) {
		if (jogador == 1) {
			tabela[x][y] = 1;
			button.setIcon(imagemX);
			jogador = 2;
		} else {
			tabela[x][y] = 2;
			button.setIcon(imagemO);
			jogador = 1;
		}

	}

	private void preparaBotaoSair() {
		// TODO Auto-generated method stub

	}
}