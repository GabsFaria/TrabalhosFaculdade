package projetos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JogoDaVelha {

	int[][] tabela = new int[3][3];
	ArrayList<JButton> lista = new ArrayList<JButton>();
	JFrame janela;
	int jogador;
	String jogador1 = null;
	String jogador2 = null;
	String ganhador;
	int pontosJogador1, pontosJogador2;
	JLabel pontos1, pontos2;

	ImageIcon imagemX = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon imagemO = new ImageIcon(getClass().getResource("O.png"));

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	public void montaTela() {
		jogador = 1;
		pontosJogador1 = 0;
		pontosJogador2 = 0;
		setaJogadores();
		preparaJanela();
		mostraJanela();
		mostraPontos();
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

	public void mostraPontos() {
		pontos1 = new JLabel();
		pontos1.setText(jogador1 + ": \n" + pontosJogador1);
		pontos1.setBounds(450, 10, 80, 20);
		janela.add(pontos1);

		pontos2 = new JLabel();
		pontos2.setText(jogador2 + ": \n" + pontosJogador2);
		pontos2.setBounds(450, 40, 80, 20);
		janela.add(pontos2);

	}

	public void setaJogadores() {
		jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1(X):");
		while (jogador1 == null || jogador1.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "Você precisar escolher um nome para poder jogar!");
//			jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1(X):");
			System.exit(0);
		}
		jogador2 = JOptionPane.showInputDialog("Digite o nome do jogador 2(O):");
		while (jogador2 == null || jogador2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Você precisar escolher um nome para poder jogar!");
			jogador2 = JOptionPane.showInputDialog("Digite o nome do jogador 2(O):");
		}
	}

	public void preparaJanela() {
		janela = new JFrame("Jogo da Velha");
		janela.setLayout(null);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void mostraJanela() {
		janela.pack();
		janela.setSize(600, 450);
		janela.setVisible(true);
	}

	public void processaJogada(JButton button, int x, int y) {
		if (button.getIcon() == null) {
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

	private void preparaBotao(JButton button, int x, int y) {
		lista.add(button);
		janela.add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(), x, y);
			}
		});
	}

	public void preparaBotaoUm() {
		JButton botaoUm = new JButton();
		int x = 0, y = 0;
		botaoUm.setBounds(10, 10, 120, 120);
		preparaBotao(botaoUm, x, y);
	}

	public void preparaBotaoDois() {
		JButton botaoDois = new JButton();
		int x = 1, y = 0;
		botaoDois.setBounds(140, 10, 120, 120);
		preparaBotao(botaoDois, x, y);
	}

	public void preparaBotaoTres() {
		JButton botaoTres = new JButton();
		int x = 2, y = 0;
		botaoTres.setBounds(270, 10, 120, 120);
		preparaBotao(botaoTres, x, y);
	}

	public void preparaBotaoQuatro() {
		JButton botaoQuatro = new JButton();
		int x = 0, y = 1;
		botaoQuatro.setBounds(10, 140, 120, 120);
		preparaBotao(botaoQuatro, x, y);
	}

	public void preparaBotaoCinco() {
		JButton botaoCinco = new JButton();
		int x = 1, y = 1;
		botaoCinco.setBounds(140, 140, 120, 120);
		preparaBotao(botaoCinco, x, y);
	}

	public void preparaBotaoSeis() {
		JButton botaoSeis = new JButton();
		int x = 2, y = 1;
		botaoSeis.setBounds(270, 140, 120, 120);
		preparaBotao(botaoSeis, x, y);
	}

	public void preparaBotaoSete() {
		JButton botaoSete = new JButton();
		int x = 0, y = 2;
		botaoSete.setBounds(10, 270, 120, 120);
		preparaBotao(botaoSete, x, y);
	}

	public void preparaBotaoOito() {
		JButton botaoOito = new JButton();
		int x = 1, y = 2;
		botaoOito.setBounds(140, 270, 120, 120);
		preparaBotao(botaoOito, x, y);
	}

	public void preparaBotaoNove() {
		JButton botaoNove = new JButton();
		int x = 2, y = 2;
		botaoNove.setBounds(270, 270, 120, 120);
		preparaBotao(botaoNove, x, y);
	}

	public void checarJogada(int x) {
		if (checaVitoria(x)) {
			JOptionPane.showMessageDialog(null, ganhador + " Venceu! ", "Vitória", JOptionPane.INFORMATION_MESSAGE);
			if (x == 1) {
				pontosJogador1++;
			} else {
				pontosJogador2++;
			}
			fimDoJogo();
			imprimiPontos();
		}

	}

	public void imprimiPontos() {
		pontos1.setText(null);
		pontos1.setText(jogador1 + ": " + pontosJogador1);
		pontos2.setText(null);
		pontos2.setText(jogador2 + ": " + pontosJogador2);
	}

	public void fimDoJogo() {
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).setIcon(null);
			lista.get(i).setBackground(null);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabela[j][i] = 0;
			}
		}
	}

	private void setButtonBackground(int[] variaveis) {
		Color color = new Color(050, 205, 050);
		for (int i = 0; i < variaveis.length; i++) {
			int variavel = variaveis[i];
			lista.get(variavel).setBackground(color);
		}
	}

	public boolean checaVitoria(int codigoJogador) {
		for (int i = 0; i < 3; i++) {
			if (tabela[i][0] == codigoJogador && tabela[i][1] == codigoJogador && tabela[i][2] == codigoJogador) {
				setButtonBackground(new int[] { 0 + i, 3 + i, 6 + i });
				return true;
			}
		}
		if (tabela[0][0] == codigoJogador && tabela[1][0] == codigoJogador && tabela[2][0] == codigoJogador) {
			setButtonBackground(new int[] { 0, 1, 2 });
			return true;
		}
		if (tabela[0][1] == codigoJogador && tabela[1][1] == codigoJogador && tabela[2][1] == codigoJogador) {
			setButtonBackground(new int[] { 3, 4, 5 });
			return true;
		}
		if (tabela[0][2] == codigoJogador && tabela[1][2] == codigoJogador && tabela[2][2] == codigoJogador) {
			setButtonBackground(new int[] { 6, 7, 8 });
			return true;
		}
		if (tabela[0][0] == codigoJogador && tabela[1][1] == codigoJogador && tabela[2][2] == codigoJogador) {
			setButtonBackground(new int[] { 0, 4, 8 });
			return true;
		}
		if (tabela[2][0] == codigoJogador && tabela[1][1] == codigoJogador && tabela[0][2] == codigoJogador) {
			setButtonBackground(new int[] { 2, 4, 6 });
			return true;
		}

		return false;
	}

	public void velha() {
		if (tabela[0][0] != 0 && tabela[1][0] != 0 && tabela[2][0] != 0 && tabela[0][1] != 0 && tabela[1][1] != 0
				&& tabela[2][1] != 0 && tabela[0][2] != 0 && tabela[1][2] != 0 && tabela[2][2] != 0) {
			JOptionPane.showMessageDialog(null, "Deu velha!", "Empate", JOptionPane.INFORMATION_MESSAGE);
			fimDoJogo();
		}
	}

	private void preparaBotaoSair() {
		// TODO Auto-generated method stub

	}
}