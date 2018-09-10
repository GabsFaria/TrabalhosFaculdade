package projetos;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JogoDaVelha {

	private int[][] tabela = new int[3][3];
	private ArrayList<JButton> lista = new ArrayList<JButton>();
	private JFrame janela;
	protected int jogador;
	private String jogador1;
	private String jogador2;
	private String ganhador;

	ImageIcon imagemX = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon imagemO = new ImageIcon(getClass().getResource("O.png"));

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	private void montaTela() {
		jogador = 1;
		setaJogadores();
		preparaJanela();
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

	private void setaJogadores() {
		jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1(X):");
		jogador2 = JOptionPane.showInputDialog("Digite o nome do jogador 2(O):");
	}

	private void preparaJanela() {
		janela = new JFrame("Jogo da Velha");
		Container c = janela.getContentPane();
		c.setLayout(new GroupLayout(c));
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(600, 600);
		janela.setVisible(true);
	}

	private void preparaBotaoUm() {
		JButton botaoUm = new JButton();
		lista.add(botaoUm);
		janela.add(lista.get(0));
		int x = 0, y = 0;
		botaoUm.setBounds(10, 10, 120, 120);
		lista.get(0).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(),x, y);
			}
		});
		
	}

	private void preparaBotaoDois() {
		JButton botaoDois = new JButton();
		lista.add(botaoDois);
		janela.add(lista.get(1));
		int x = 1, y= 0;
		botaoDois.setBounds(140, 10, 120, 120);
		lista.get(1).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(),x, y);
				
			}
		});
	}

	private void preparaBotaoTres() {
		JButton botaoTres = new JButton();
		lista.add(botaoTres);
		janela.add(lista.get(2));
		int x = 2, y= 0;
		botaoTres.setBounds(270, 10, 120, 120);
		lista.get(2).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource(),x, y);
				
			}
		});
	}

	private void preparaBotaoQuatro() {
		JButton botaoQuatro = new JButton();
		lista.add(botaoQuatro);
		janela.add(lista.get(3));
		int x = 0, y= 1;
		botaoQuatro.setBounds(10, 140, 120, 120);
		lista.get(3).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource() ,x, y);
				
			}
		});
	}

	private void preparaBotaoCinco() {
		JButton botaoCinco = new JButton();
		lista.add(botaoCinco);
		janela.add(lista.get(4));
		int x = 1, y= 1;
		botaoCinco.setBounds(140, 140, 120, 120);
		lista.get(4).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource() ,x, y);
				
			}
		});
	}

	private void preparaBotaoSeis() {
		JButton botaoSeis = new JButton();
		lista.add(botaoSeis);
		janela.add(lista.get(5));
		int x = 2, y= 1;
		botaoSeis.setBounds(270, 140, 120, 120);
		lista.get(5).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource() ,x, y);
				
			}
		});
	}

	private void preparaBotaoSete() {
		JButton botaoSete = new JButton();
		lista.add(botaoSete);
		janela.add(lista.get(6));
		int x = 0, y= 2;
		botaoSete.setBounds(10, 270, 120, 120);
		lista.get(6).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource() ,x, y);
				
			}
		});
	}

	private void preparaBotaoOito() {
		JButton botaoOito = new JButton();
		lista.add(botaoOito);
		janela.add(lista.get(7));
		int x = 1, y= 2;
		botaoOito.setBounds(140, 270, 120, 120);
		lista.get(7).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource() ,x, y);
				
			}
		});
	}

	private void preparaBotaoNove() {
		JButton botaoNove = new JButton();
		lista.add(botaoNove);
		janela.add(lista.get(8));
		int x = 2, y= 2;
		botaoNove.setBounds(270, 270, 120, 120);
		lista.get(8).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				processaJogada((JButton) e.getSource() ,x, y);
				
			}
		});
	}

	public void processaJogada(JButton button, int x, int y) {
		if (jogador == 1) {
			tabela[x][y] = 1;
			button.setIcon(imagemX);
			jogador = 2;
			ganhador = jogador1;
			checarJogada(1);
		} else {
			tabela[x][y] = 2;
			button.setIcon(imagemO);
			jogador = 1;
			ganhador = jogador2;
			checarJogada(2);
		}

	}

	private void checarJogada(int x) {
		if(vitoria(x) == true) {
			JOptionPane.showMessageDialog(null, ganhador+" Venceu! ", "Vitória", JOptionPane.INFORMATION_MESSAGE);
			fimDoJogo();
		}
		
	}

	private void fimDoJogo() {
		for(int i=0; i<lista.size();i++) {
			lista.get(i).setIcon(null);
			lista.get(i).setBackground(null);
		}
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				tabela[j][i]=0;
			}
		}
	}

	private boolean vitoria(int x) {
			//Lógica de resultado para X
			for(int i= 0; i<3; i++) {
			if(tabela[i][0]==1 && tabela[i][1]==1 && tabela[i][2]==1) {
				lista.get(0+i).setBackground(new Color(050, 205, 050));
				lista.get(3+i).setBackground(new Color(050, 205, 050));
				lista.get(6+i).setBackground(new Color(050, 205, 050));
				return true;
			}
			}
			if(tabela[0][0]==1 && tabela[1][0]==1 && tabela[2][0]==1) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(1).setBackground(new Color(050, 205, 050));
				lista.get(2).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[0][1]==1 && tabela[1][1]==1 && tabela[2][1]==1) {
				lista.get(3).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(5).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[0][2]==1 && tabela[1][2]==1 && tabela[2][2]==1) {
				lista.get(6).setBackground(new Color(050, 205, 050));
				lista.get(7).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[0][0]==1 && tabela[1][1]==1 && tabela[2][2]==1) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[2][0]==1 && tabela[1][1]==1 && tabela[0][2]==1) {
				lista.get(2).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(6).setBackground(new Color(050, 205, 050));
				return true;
			}
			
			//Lógica de resultado para O
			
			for(int i= 0; i<3; i++) {
				if(tabela[i][0]==2 && tabela[i][1]==2 && tabela[i][2]==2) {
					lista.get(0+i).setBackground(new Color(050, 205, 050));
					lista.get(3+i).setBackground(new Color(050, 205, 050));
					lista.get(6+i).setBackground(new Color(050, 205, 050));
					return true;
				}
				}
			if(tabela[0][0]==2 && tabela[1][0]==2 && tabela[2][0]==2) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(1).setBackground(new Color(050, 205, 050));
				lista.get(2).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[0][1]==2 && tabela[1][1]==2 && tabela[2][1]==2) {
				lista.get(3).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(5).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[0][2]==2 && tabela[1][2]==2 && tabela[2][2]==2) {
				lista.get(6).setBackground(new Color(050, 205, 050));
				lista.get(7).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[0][0]==2 && tabela[1][1]==2 && tabela[2][2]==2) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				return true;
			}
			if(tabela[2][0]==2 && tabela[1][1]==2 && tabela[0][2]==2) {
				lista.get(2).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(6).setBackground(new Color(050, 205, 050));
				return true;
			}
			
		return false;
	}

	private void preparaBotaoSair() {
		// TODO Auto-generated method stub

	}
}