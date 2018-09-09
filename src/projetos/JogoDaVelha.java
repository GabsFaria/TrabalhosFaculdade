package projetos;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha {

	private int[][] tabela = new int[3][3];
	private ArrayList<JButton> lista = new ArrayList<JButton>();
	private JFrame janela;
	protected int jogador;

	ImageIcon imagemX = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon imagemO = new ImageIcon(getClass().getResource("O.png"));

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	private void montaTela() {
		jogador = 1;
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