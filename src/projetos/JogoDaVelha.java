package projetos;


import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JogoDaVelha {

	int[][] tabela = new int[3][3];
	JFrame janela;
	int jogador;
	String jogador1=null;
	String jogador2=null;
	String ganhador;
	int pontosJogador1, pontosJogador2;
	JLabel pontos1, pontos2;
	ArrayList<JButton> lista = new ArrayList<JButton>();
	
	ImageIcon imagemX = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon imagemO = new ImageIcon(getClass().getResource("O.png"));

	

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	public void montaTela() {
		jogador=1;
		pontosJogador1=0;
		pontosJogador2=0;
		setaJogadores();
		preparaJanela();
		mostraJanela();
		mostraPontos();
		Botoes b = new Botoes();
		b.preparaBotaoUm();
		b.preparaBotaoDois();
		b.preparaBotaoTres();
		b.preparaBotaoQuatro();
		b.preparaBotaoCinco();
		b.preparaBotaoSeis();
		b.preparaBotaoSete();
		b.preparaBotaoOito();
		b.preparaBotaoNove();
		preparaBotaoSair();
		
	}


	public void mostraPontos() {
		pontos1 = new JLabel();
		pontos1.setText(jogador1+": \n"+pontosJogador1);
		pontos1.setBounds(450, 10, 80, 20);
		janela.add(pontos1);
		
		pontos2 = new JLabel();
		pontos2.setText(jogador2+": \n"+pontosJogador2);
		pontos2.setBounds(450, 40, 80, 20);
		janela.add(pontos2);
		
	}

	public void setaJogadores() {
		jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1(X):");
		while(jogador1==null || jogador1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Você precisar escolher um nome para poder jogar!");
			jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1(X):");
		}
		jogador2 = JOptionPane.showInputDialog("Digite o nome do jogador 2(O):");
		while(jogador2==null || jogador2.isEmpty()) {
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
	
	public void checarJogada(int x) {
		if(vitoria(x) == true) {
			JOptionPane.showMessageDialog(null, ganhador+" Venceu! ", "Vitória", JOptionPane.INFORMATION_MESSAGE);
			fimDoJogo();
			imprimiPontos();
			}
	}

	public void imprimiPontos() {
		pontos1.setText(null);
		pontos1.setText(jogador1+": "+pontosJogador1);
		pontos2.setText(null);
		pontos2.setText(jogador2+": "+pontosJogador2);
	}

	public void fimDoJogo() {
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

	public boolean vitoria(int x) {
			//Lógica de resultado para X
			for(int i= 0; i<3; i++) {
			if(tabela[i][0]==1 && tabela[i][1]==1 && tabela[i][2]==1) {
				lista.get(0+i).setBackground(new Color(050, 205, 050));
				lista.get(3+i).setBackground(new Color(050, 205, 050));
				lista.get(6+i).setBackground(new Color(050, 205, 050));
				pontosJogador1+=1;
				return true;
			}
			}
			if(tabela[0][0]==1 && tabela[1][0]==1 && tabela[2][0]==1) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(1).setBackground(new Color(050, 205, 050));
				lista.get(2).setBackground(new Color(050, 205, 050));
				pontosJogador1+=1;
				return true;
			}
			if(tabela[0][1]==1 && tabela[1][1]==1 && tabela[2][1]==1) {
				lista.get(3).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(5).setBackground(new Color(050, 205, 050));
				pontosJogador1+=1;
				return true;
			}
			if(tabela[0][2]==1 && tabela[1][2]==1 && tabela[2][2]==1) {
				lista.get(6).setBackground(new Color(050, 205, 050));
				lista.get(7).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				pontosJogador1+=1;
				return true;
			}
			if(tabela[0][0]==1 && tabela[1][1]==1 && tabela[2][2]==1) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				pontosJogador1+=1;
				return true;
			}
			if(tabela[2][0]==1 && tabela[1][1]==1 && tabela[0][2]==1) {
				lista.get(2).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(6).setBackground(new Color(050, 205, 050));
				pontosJogador1+=1;
				return true;
			}
			
			//Lógica de resultado para O
			
			for(int i= 0; i<3; i++) {
				if(tabela[i][0]==2 && tabela[i][1]==2 && tabela[i][2]==2) {
					lista.get(0+i).setBackground(new Color(050, 205, 050));
					lista.get(3+i).setBackground(new Color(050, 205, 050));
					lista.get(6+i).setBackground(new Color(050, 205, 050));
					pontosJogador2+=1;
					return true;
				}
				}
			if(tabela[0][0]==2 && tabela[1][0]==2 && tabela[2][0]==2) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(1).setBackground(new Color(050, 205, 050));
				lista.get(2).setBackground(new Color(050, 205, 050));
				pontosJogador2+=1;
				return true;
			}
			if(tabela[0][1]==2 && tabela[1][1]==2 && tabela[2][1]==2) {
				lista.get(3).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(5).setBackground(new Color(050, 205, 050));
				pontosJogador2+=1;
				return true;
			}
			if(tabela[0][2]==2 && tabela[1][2]==2 && tabela[2][2]==2) {
				lista.get(6).setBackground(new Color(050, 205, 050));
				lista.get(7).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				pontosJogador2+=1;
				return true;
			}
			if(tabela[0][0]==2 && tabela[1][1]==2 && tabela[2][2]==2) {
				lista.get(0).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(8).setBackground(new Color(050, 205, 050));
				pontosJogador2+=1;
				return true;
			}
			if(tabela[2][0]==2 && tabela[1][1]==2 && tabela[0][2]==2) {
				lista.get(2).setBackground(new Color(050, 205, 050));
				lista.get(4).setBackground(new Color(050, 205, 050));
				lista.get(6).setBackground(new Color(050, 205, 050));
				pontosJogador2+=1;
				return true;
			}			
			
		return false;
	}
	
	public void velha() {
		if(tabela[0][0]!=0 && tabela[1][0] !=0 && tabela[2][0]!=0 && tabela[0][1]!=0 && tabela[1][1]!=0
				&& tabela[2][1]!=0 && tabela[0][2]!=0 && tabela[1][2]!=0 && tabela[2][2]!=0) {
			JOptionPane.showMessageDialog(null, "Deu velha!", "Empate", JOptionPane.INFORMATION_MESSAGE);
			fimDoJogo();
		}
	}

	private void preparaBotaoSair() {
		// TODO Auto-generated method stub

	}
}